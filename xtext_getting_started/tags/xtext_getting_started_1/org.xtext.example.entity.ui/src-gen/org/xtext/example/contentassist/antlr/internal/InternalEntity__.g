lexer grammar InternalEntity;
@header {
package org.xtext.example.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'typedef' ;
T12 : 'mapsto' ;
T13 : '.' ;
T14 : 'entity' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'extends' ;
T18 : '*' ;

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 820
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 822
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 824
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 826
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 828
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 830
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g" 832
RULE_ANY_OTHER : .;


