import sys, os
from antlr4 import *

# Define your variables
DIR = os.path.dirname(__file__)
ANTLR_JAR = 'C:/antlr/antlr4-4.9.2-complete.jar'
CPL_Dest = 'CompiledFiles'
SRC = 'proj.g4'
TESTS = os.path.join(DIR, './tests')

filename = '001.txt'
inputFile = os.path.join(DIR, './tests', filename) 
input_stream = FileStream(inputFile) 

print(input_stream)

greeting = ["hello", "hi"]

def greet(input):
    try:
        content = str(input)
        words = content.split()
        for word in words:
            if word.lower() in greeting:
                return True;
    except:
        return False
print(greet(input_stream))