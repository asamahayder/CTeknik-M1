grammar simpleCalc;

start   :  'GL' s=sequence 'GG' EOF ;

assign : x=ID '=' e=expr  ;

/* A grammar for arithmetic expressions */

expr	:
      '(' e=expr ')'      # Parenthesis
    | e1=expr op=OP2 e2=expr # MultiplicationAndDivision
    | e1=expr op=OP1 e2=expr # AdditionAndSubtraction
	| c=FLOAT     	      # Constant
	| x=ID		          # Variable
	| op=OP1 f=FLOAT #SignedConstant
	;

conditionsNumerical :
    e1=expr c1=COND1 e2=expr
    ;

conditionsBoolean :
        e1=conditionsNumerical c=COND2 e2=conditionsNumerical #ConditionBooleanWithNumerical
        | e1=conditionsBoolean c=COND2 e2=conditionsBoolean #ConditionBooleanWithMultipleBooleans
        | '('e=conditionsBoolean')'#ConditionBooleanWithParenthesis

        ;


COND1    :
      '=='
    | '!='
    | '<'
    | '>'
    | '<='
    | '>='
    ;

COND2 :
    '&&'
    |'||'
    ;

statement :
            a= assign
        | i= if_statement
        | ie= if_else_statement
        | w= while_loop
        ;

//vores version af sequence
//sequence : '[' as+=assign (','assign)* ']';
//[x=5, b=7, h=9];


//deres version
//TODO plz help
/*assigment : ass=assign
          | expri=expr
          ;*/
//TODO hvordan kan vi få en liste i vores version? denne version acceptere en lonely comma
sequence : (as+=statement)* e=expr;

//TODO how to fix 5 == 5 == 5...
if_statement : 'if('e1=conditionsNumerical'){'s1+=statement*'}' #IfStatementNumericalCondition
            |'if('e1=conditionsBoolean'){'s1+=statement*'}' #IfStatementBooleanCondition
            ;

if_else_statement : 'if('e1=conditionsNumerical'){'s1+=statement*'}else{'s2+=statement*'}' #IfElseStatementNumericalCondition
                |'if('e1=conditionsBoolean'){'s1+=statement*'}else{'s2+=statement*'}' #IfElseStatementBooleanCondition;

while_loop : 'while('e1=conditionsNumerical'){'s1+=statement*'}' #WhileNumericalCondition
        |'while('e1=conditionsBoolean'){'s1+=statement*'}' #WhileBooleanCondition ;

// Lexer:

OP1 : ('-'|'+') ;
OP2 : ('*'|'/');

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
