from antlr4 import ParserRuleContext, TerminalNode
from CompiledFiles.projLexer import projLexer
from CompiledFiles.projParser import projParser

# Create a direct mapping from token types to names based on projLexer.tokens
TOKEN_TYPE_MAP = {
    1: "'('",
    2: "')'",
    3: "'>'",
    4: "'<'",
    5: "'=='",
    6: "'!='",
    7: "'<='",
    8: "'>='",
    9: "'+'",
    10: "'-'",
    11: "'*'",
    12: "'/'",
    13: "'show'",
    14: "'tell'",
    15: "'me'",
    16: "'the'",
    17: "'an'",
    18: "'a'",
    19: "','",
    20: "'--'",
    21: "'++'",
    22: "'+='",
    23: "'-='",
    24: "MAIN",
    25: "DEF",
    26: "IF",
    27: "ELIF",
    28: "ELSE",
    29: "COLON",
    30: "BREAK",
    31: "WHILE",
    32: "RETURN",
    33: "PRINT",
    34: "STRING",
    35: "ID",
    36: "EQUAL",
    37: "NUMBER",
    38: "NL",
    39: "WS"
}

def parse_tree(tree, indent=0, prefix=""):
    """
    Generate a pretty-printed ANTLR parse tree as a string.
    
    Args:
        tree: The parse tree node (ParserRuleContext or TerminalNode).
        indent: Current indentation level (number of spaces).
        prefix: Prefix for the current line (e.g., for tree branches).
    
    Returns:
        str: The formatted parse tree as a string.
    """
    # List to collect tree lines
    lines = []
    
    # Indentation string (2 spaces per level)
    indent_str = "  " * indent
    
    if isinstance(tree, TerminalNode):
        # Terminal node (e.g., token like 'count', '=', '1')
        token = tree.getSymbol()
        token_type = token.type
        
        # Get token name from the map or use a default
        token_name = TOKEN_TYPE_MAP.get(token_type, f"UNKNOWN({token_type})")
            
        lines.append(f"{indent_str}{prefix}Token: {token.text} (type: {token_name})")
    elif isinstance(tree, ParserRuleContext):
        # Rule node (e.g., program, stmt, asg)
        rule_name = projParser.ruleNames[tree.getRuleIndex()]
        lines.append(f"{indent_str}{prefix}Rule: {rule_name}")
        
        # Process children
        children = list(tree.getChildren())
        for i, child in enumerate(children):
            # Determine prefix for child (e.g., ├── for intermediate, └── for last)
            is_last = i == len(children) - 1
            child_prefix = "└── " if is_last else "├── "
            # Recursively get child lines and extend the list
            child_lines = parse_tree(child, indent + 1, child_prefix)
            lines.extend(child_lines.split("\n"))
    else:
        lines.append(f"{indent_str}{prefix}Unknown node: {tree}")
    
    return "\n".join(lines)