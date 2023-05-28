lexer grammar AlgumaLexer;

PALAVRA_CHAVE:
    'algoritmo' | 'declare' | 'literal' | 'inteiro'|
    'leia' | 'escreva' | 'fim_algoritmo';

IDENT:
    ('a' .. 'z') ('a'..'z')*;

CADEIA:
    '"' ~('\n' | '"')* '"';

COMENTARIO:
    '{' ~('\n' | '}' | '\r')* '}' { skip(); } ;

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

CADEIA_NAO_FECHADA:
    '"' ~('"')* '\n';

COMENTARIO_NAO_FECHADO:
    '{' ~('}')* '\n';

SIMBOLO_NAO_IDENTIFICADO:
    '~' | '[' | ']' | '%' | '$' | '#' | '@' | '!' | '^' | '`';

ERRO:
    .;