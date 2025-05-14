from antlr4 import ParserRuleContext, TerminalNode
from CompiledFiles.projLexer import projLexer
from CompiledFiles.projParser import projParser

# Create a direct mapping from token types to names based on projLexer.tokens
TOKEN_TYPE_MAP = {
    1: "'('",
    2: "','",
    3: "')'",
    4: "'and'",
    5: "'or'",
    6: "'>'",
    7: "'<'",
    8: "'=='",
    9: "'!='",
    10: "'<='",
    11: "'>='",
    12: "'+'",
    13: "'-'",
    14: "'*'",
    15: "'/'",
    16: "'not'",
    17: "'show'",
    18: "'tell'",
    19: "'save'",
    20: "'retrieve'",
    21: "'get'",
    22: "'store'",
    23: "'--'",
    24: "'++'",
    25: "'+='",
    26: "'-='",
    27: "MAIN",
    28: "DEF",
    29: "IF",
    30: "ELIF",
    31: "ELSE",
    32: "COLON",
    33: "BREAK",
    34: "WHILE",
    35: "FOR",
    36: "IN",
    37: "RANGE",
    38: "RETURN",
    39: "PRINT",
    40: "TRUE",
    41: "FALSE",
    42: "NONE",
    43: "STRING",
    44: "ID",
    45: "EQUAL",
    46: "NUMBER",
    47: "FLOAT",
    48: "NL",
    49: "WS"
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
    if tree is None:
        return ""

    # List to collect tree lines
    lines = []
    
    # Indentation string (2 spaces per level)
    indent_str = "  " * indent
    
    if isinstance(tree, TerminalNode):
        # Terminal node (e.g., token like 'count', '=', '1')
        token = tree.getSymbol()
        if token is None:
            return ""
            
        token_type = token.type
        token_text = token.text
        
        # Skip whitespace and newline tokens
        if token_type in [46, 47]:  # NL or WS
            return ""
            
        # Get token name from the map or use a default
        token_name = TOKEN_TYPE_MAP.get(token_type, f"UNKNOWN({token_type})")
            
        lines.append(f"{indent_str}{prefix}Token: {token_text} (type: {token_name})")
    elif isinstance(tree, ParserRuleContext):
        # Rule node (e.g., program, stmt, asg)
        rule_name = projParser.ruleNames[tree.getRuleIndex()]
        lines.append(f"{indent_str}{prefix}Rule: {rule_name}")
        
        # Process children
        children = list(tree.getChildren())
        if not children:
            return f"{indent_str}{prefix}Rule: {rule_name} (empty)"
            
        for i, child in enumerate(children):
            # Determine prefix for child (e.g., ├── for intermediate, └── for last)
            is_last = i == len(children) - 1
            child_prefix = "└── " if is_last else "├── "
            # Recursively get child lines and extend the list
            child_lines = parse_tree(child, indent + 1, child_prefix)
            if child_lines:  # Only add non-empty lines
                lines.extend(child_lines.split("\n"))
    else:
        lines.append(f"{indent_str}{prefix}Unknown node: {tree}")
    
    return "\n".join(line for line in lines if line.strip())