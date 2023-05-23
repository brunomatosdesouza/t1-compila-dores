lexer grammar AlgumaLexer;

PALAVRA_CHAVE:
    'algoritmo' | 'declare' | 'literal' | 'inteiro'|
    'leia' | 'escreva' | 'fim_algoritmo';

IDENT:
    ('a' .. 'z');

CADEIA:
    '"' ~('"')* '"';

COMENTARIO:
    '{' ~('}')* '}' { skip(); } ;

WS:
    ( ' ' | '\t' | '\r' | '\n' ) { skip(); } ;

SEPARADOR:
    ',';

DELIM:
    ':';

ABREPAR:
    '(';

FECHAPAR:
    ')';