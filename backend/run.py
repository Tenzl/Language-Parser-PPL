import sys, os
import subprocess
import unittest
from antlr4 import *
from AssignmentToJavaVisitor import AssignmentToJavaVisitor
from tree_printer import parse_tree  # Import the new function

# Define your variables
DIR = os.path.dirname(__file__)
ANTLR_JAR = 'C:/antlr/antlr4-4.9.2-complete.jar'
CPL_Dest = 'CompiledFiles'
SRC = 'proj.g4'
TESTS = os.path.join(DIR, './tests')

def printUsage():
    print('python run.py gen')
    print('python run.py test')

def printBreak():
    print('-----------------------------------------------')

def generateAntlr2Python():
    print('Antlr4 is running...')
    subprocess.run(['java', '-jar', ANTLR_JAR, '-o', CPL_Dest, '-no-listener', '-Dlanguage=Python3', '-visitor', SRC])
    print('Generate successfully')

def runTest():
    print('Running testcases...')
    
    from CompiledFiles.projLexer import projLexer
    from CompiledFiles.projParser import projParser
    from antlr4.error.ErrorListener import ErrorListener

    class CustomErrorListener(ErrorListener):
        def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
            print(f"Input rejected: {msg}")
            exit(1)  # Exit the program with an error

    filename = '001.txt'
    inputFile = os.path.join(DIR, './tests', filename)    

    # Test
    input_stream = FileStream(inputFile)
    lexer = projLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = projParser(stream)
    tree = parser.program()  # Start parsing at the `program` rule

    # Print the parse tree (for debugging)
    parse_tree_output = parse_tree(tree)
    print(parse_tree_output)
    
    # Visit and print converted code
    visitor = AssignmentToJavaVisitor()
    java_code = visitor.visit(tree)
    print("// Translated Java code:")
    print(java_code)
    
    
    printBreak()
    print('Run tests completely')

def main(argv):
    print('Complete jar file ANTLR  :  ' + str(ANTLR_JAR))
    print('Length of arguments      :  ' + str(len(argv)))    
    printBreak()

    if len(argv) < 1:
        printUsage()
    elif argv[0] == 'gen':
        generateAntlr2Python()    
    elif argv[0] == 'test':       
        runTest()
    else:
        printUsage()

if __name__ == '__main__':
    main(sys.argv[1:])