lexer grammar AlgumaLexer;

// Ignora
COMENTARIO:
    '{' ~('\n' | '}' | '\r')* '}' { skip(); } ;

WS:
    ( ' ' | '\t' | '\r' | '\n' ) { skip(); } ;

PALAVRA_CHAVE:
    'algoritmo' |
    //declarar
    'declare' |
    //registro
    'registro' |
    //'.' ex: ponto1.x
    '.' |
    //if
    'se' | 'caso' | 'entao' | 'senao' |
    //for
    'para' | 'ate' | '..' | 'faca' |
    //while
    'enquanto' |
    //ler, escrever
    'leia' | 'escreva' |
    //vetor
    '[' | ']' |
    //endereço
    '^' | '&' |
    //função
    'procedimento' | 'funcao' | 'retorne' | 
    //operador logico
    '<-' | 'logico' | 'nao' | 'e' | 'ou' | 'seja' |
    //falso, verdadeiro
    'falso' | 'verdadeiro' |
    //fim
    'fim_se' | 'fim_caso' | 'fim_para' | 'fim_enquanto' | 'fim_registro' | 'fim_funcao' | 'fim_procedimento' | 'fim_algoritmo';

TIPOS:
    'literal' | 'inteiro' | 'real' | 'constante' | 'tipo' | 'var' ;

// Identificadores
IDENT:
    ([a-zA-Z]) ([a-zA-Z] | [0-9] | '_')*;

//Constantes
CADEIA:
    '"' ~('\n' | '"' | '\\')* '"';
NUM_INT:
    ('0'..'9')+;
NUM_REAL:
    ('0'..'9')+ ('.' ('0'..'9')+)?;

// Operações
OP_REL:
    '>' | '>=' | '<' | '<=' | '<>' | '=';
SOMA: 
    '+';
SUBTRACAO:
    '-';
MULTIPLICACAO:
    '*';
DIVISAO:
    '/';
RESTO:
    '%';

SEPARADOR:
    ',';

DELIM:
    ':';

ABREPAR:
    '(';

FECHAPAR:
    ')';


// Erros possíveis
CADEIA_NAO_FECHADA:
    '"' ~('"')* '\n';

COMENTARIO_NAO_FECHADO:
    '{' ~('}')* '\n';

SIMBOLO_NAO_IDENTIFICADO:
    '~' | '[' | ']' | '%' | '$' | '#' | '@' | '!' | '^' | '`' | '}';