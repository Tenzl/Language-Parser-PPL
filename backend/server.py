from fastapi import FastAPI
from pydantic import BaseModel
from antlr4 import *
from CompiledFiles.projLexer import projLexer
from CompiledFiles.projParser import projParser
from antlr4.error.ErrorListener import ErrorListener
from fastapi.middleware.cors import CORSMiddleware
from AssignmentToJavaVisitor import AssignmentToJavaVisitor
from tree_printer import parse_tree
from Extend import *

app = FastAPI()

# Initialize global variables
last_tree = None
last_code = None

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_methods=["*"],
    allow_headers=["*"],
)

class CodeInput(BaseModel):
    python_code: str

class CustomErrorListener(ErrorListener):
    def __init__(self):
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"Syntax error at line {line}:{column}: {msg}")

@app.post("/convert")
async def convert_code(input_data: CodeInput):
    global last_tree, last_code
    try:
        # Ensure the input ends with a newline for proper parsing
        cleaned_code = input_data.python_code.rstrip() + "\n"
        input_stream = InputStream(cleaned_code)
        lexer = projLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        
        parser = projParser(token_stream)
        parser.removeErrorListeners()
        error_listener = CustomErrorListener()
        parser.addErrorListener(error_listener)
        tree = parser.program()
        
        if error_listener.errors:
            return {"error": error_listener.errors}
        
        # Use the AssignmentToJavaVisitor from the separate file
        visitor = AssignmentToJavaVisitor()
        java_code = visitor.visit(tree)
        
        # Check if the result is the special string from questStmt
        if java_code == "1":  # get saved code
            saved_code, saved_tree = get_code()
            if saved_code is None:
                return {"error": "No code has been saved yet"}
            last_tree = saved_tree  # Update last_tree with saved tree
            return {"java_code": saved_code}
        elif java_code == "2":  # save command
            save_code(last_code, last_tree)  # Save both code and tree
            return {"java_code": "Code saved successfully"}
        elif java_code == "3":  # show/tell command
            if last_tree is None:
                return {"error": "No previous code to show"}
            parse_tree_output = parse_tree(last_tree)
            return {"java_code": parse_tree_output}
        elif java_code == "4":  # show the output of the code
            output = run_code(last_code)
            return {"java_code": output}
        else:
            last_tree = tree
            last_code = cleaned_code
            return {"java_code": java_code}
    except Exception as e:
        return {"error": 'unknown command'}