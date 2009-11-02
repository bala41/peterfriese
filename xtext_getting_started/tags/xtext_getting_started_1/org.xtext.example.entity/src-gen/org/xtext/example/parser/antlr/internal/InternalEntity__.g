lexer grammar InternalEntity;
@header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'typedef' ;
T12 : 'mapsto' ;
T13 : '.' ;
T14 : 'entity' ;
T15 : 'extends' ;
T16 : '{' ;
T17 : '}' ;
T18 : '*' ;

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 444
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 446
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 448
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 450
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 452
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 454
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g" 456
RULE_ANY_OTHER : .;


