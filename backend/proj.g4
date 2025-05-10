grammar proj;

// Grammar rules

program: (stmt | NL)+ EOF;

stmt: mainStmt 
    | whileStmt
    | ifStmt
    | funcStmt
    | asg
    | breakStmt
    | postfixStmt
    | returnStmt
    | printStmt
    | callStmt
    | questStmt
    ;

whileStmt: WHILE exp COLON block;

asg: ID EQUAL exp NL? ;

ifStmt: IF exp COLON block elifStmt* elseStmt? ;

elifStmt: ELIF exp COLON block ;

elseStmt: ELSE COLON block ;

funcStmt: DEF ID '(' param? ')' COLON block ;

breakStmt: BREAK NL? ;

postfixStmt: ID postfix exp? NL? ;

returnStmt: RETURN exp NL? ;

mainStmt: IF MAIN COLON block ;

printStmt: PRINT '(' printArgs? ')' NL? ;

block: NL stmt+;

callStmt: ID '(' exp? ')' NL? ;

questStmt: verb obj article noun ;

exp: addExp (op=('>'|'<'|'=='|'!='|'<='|'>=') addExp)* ;
addExp: mulExp (op=('+'|'-') mulExp)* ;
mulExp: atom (op=('*'|'/') atom)* ;
verb: ('show' | 'tell') ;
obj: 'me' ;
article: ('the' | 'an'| 'a') ;
noun: ID ;

atom: NUMBER
    | ID '(' (exp (',' exp)*)? ')'
    | ID
    | '(' exp ')'
    | STRING
    ;

MAIN: '__name__' WS* '==' WS* ('"__main__"'|'\'__main__\'') ;

postfix: op=('--'|'++'|'+='|'-=');

printArgs: exp (',' exp)* ;

param: ID (',' ID)* ;

// Tokens

DEF: 'def';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
COLON: ':';
BREAK: 'break';
WHILE: 'while';
RETURN: 'return';
PRINT: 'print' ;

STRING: '"' ( ~["\\\r\n] | '\\' . )* '"' 
      | '\'' ( ~['\\\r\n] | '\\' . )* '\'' ;
ID: [a-zA-Z_][_a-zA-Z0-9]* ;
EQUAL: '=' ;
NUMBER: [0-9]+ ;
NL: ('\r'? '\n' [ \t]*) ;
WS: [ \t]+ -> skip ;