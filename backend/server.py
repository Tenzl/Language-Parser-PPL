from fastapi import FastAPI
from pydantic import BaseModel
from antlr4 import *
from CompiledFiles.projLexer import projLexer
from CompiledFiles.projParser import projParser
from antlr4.error.ErrorListener import ErrorListener
from fastapi.middleware.cors import CORSMiddleware
from AssignmentToJavaVisitor import AssignmentToJavaVisitor
from tree_printer import parse_tree

app = FastAPI()

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
    global last_tree
    try:
        # Ensure the input ends with a newline for proper parsing
        cleaned_code = input_data.python_code.rstrip() + "\n"
        input_stream = InputStream(cleaned_code)
        lexer = projLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        
        # Optional: Print tokens for debugging
        token_stream.fill()
        for token in token_stream.tokens:
            print(token)
        
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
        
        # Check if the result is the special string "true" from questStmt
        if java_code == "true":
            # Generate parse tree visualization
            parse_tree_output = parse_tree(last_tree)
            return {"java_code": parse_tree_output}
        else:
            last_tree = tree
            return {"java_code": java_code}
    except Exception as e:
        return {"error": str(e)}