package org.xtext.example.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.example.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEntityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'typedef'", "'mapsto'", "'.'", "'entity'", "'extends'", "'{'", "'}'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalEntityParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g"; }


     
     	private EntityGrammarAccess grammarAccess;
     	
        public InternalEntityParser(TokenStream input, IAstFactory factory, EntityGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/example/parser/antlr/internal/InternalEntity.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:72:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:72:47: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:73:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:80:1: ruleModel returns [EObject current=null] : (lv_types_0= ruleType )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:85:6: ( (lv_types_0= ruleType )* )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:86:1: (lv_types_0= ruleType )*
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:86:1: (lv_types_0= ruleType )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:89:6: lv_types_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel141);
            	    lv_types_0=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_0, "Type", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleType
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:114:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:114:46: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:115:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType178);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:122:1: ruleType returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:127:6: ( (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:128:1: (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:128:1: (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("128:1: (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:129:5: this_TypeDef_0= ruleTypeDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleType235);
                    this_TypeDef_0=ruleTypeDef();
                    _fsp--;

                     
                            current = this_TypeDef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:139:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType262);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleTypeDef
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:154:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:154:49: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:155:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef294);
            iv_ruleTypeDef=ruleTypeDef();
            _fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDef


    // $ANTLR start ruleTypeDef
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:162:1: ruleTypeDef returns [EObject current=null] : ( 'typedef' (lv_name_1= RULE_ID ) ( 'mapsto' (lv_mappedType_3= ruleJAVAID ) )? ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_mappedType_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:167:6: ( ( 'typedef' (lv_name_1= RULE_ID ) ( 'mapsto' (lv_mappedType_3= ruleJAVAID ) )? ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:168:1: ( 'typedef' (lv_name_1= RULE_ID ) ( 'mapsto' (lv_mappedType_3= ruleJAVAID ) )? )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:168:1: ( 'typedef' (lv_name_1= RULE_ID ) ( 'mapsto' (lv_mappedType_3= ruleJAVAID ) )? )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:168:2: 'typedef' (lv_name_1= RULE_ID ) ( 'mapsto' (lv_mappedType_3= ruleJAVAID ) )?
            {
            match(input,11,FOLLOW_11_in_ruleTypeDef338); 

                    createLeafNode(grammarAccess.getTypeDefAccess().getTypedefKeyword_0(), null); 
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:172:1: (lv_name_1= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:174:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef360); 

            		createLeafNode(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:192:2: ( 'mapsto' (lv_mappedType_3= ruleJAVAID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:192:3: 'mapsto' (lv_mappedType_3= ruleJAVAID )
                    {
                    match(input,12,FOLLOW_12_in_ruleTypeDef378); 

                            createLeafNode(grammarAccess.getTypeDefAccess().getMapstoKeyword_2_0(), null); 
                        
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:196:1: (lv_mappedType_3= ruleJAVAID )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:199:6: lv_mappedType_3= ruleJAVAID
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTypeDefAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleJAVAID_in_ruleTypeDef412);
                    lv_mappedType_3=ruleJAVAID();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "mappedType", lv_mappedType_3, "JAVAID", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeDef


    // $ANTLR start entryRuleJAVAID
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:224:1: entryRuleJAVAID returns [EObject current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final EObject entryRuleJAVAID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJAVAID = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:224:48: (iv_ruleJAVAID= ruleJAVAID EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:225:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID451);
            iv_ruleJAVAID=ruleJAVAID();
            _fsp--;

             current =iv_ruleJAVAID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJAVAID


    // $ANTLR start ruleJAVAID
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:232:1: ruleJAVAID returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) ;
    public final EObject ruleJAVAID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:237:6: ( ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:238:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:238:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:238:2: (lv_name_0= RULE_ID ) ( '.' RULE_ID )*
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:238:2: (lv_name_0= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:240:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID508); 

            		createLeafNode(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getJAVAIDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:258:2: ( '.' RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:258:3: '.' RULE_ID
            	    {
            	    match(input,13,FOLLOW_13_in_ruleJAVAID526); 

            	            createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID535); 
            	     
            	        createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJAVAID


    // $ANTLR start entryRuleEntity
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:273:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:273:48: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:274:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity569);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:281:1: ruleEntity returns [EObject current=null] : ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_attributes_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:286:6: ( ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:287:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:287:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:287:2: 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}'
            {
            match(input,14,FOLLOW_14_in_ruleEntity613); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:291:1: (lv_name_1= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:293:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity635); 

            		createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:311:2: ( 'extends' ( RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:311:3: 'extends' ( RULE_ID )
                    {
                    match(input,15,FOLLOW_15_in_ruleEntity653); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:315:1: ( RULE_ID )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:318:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity675); 

                    		createLeafNode(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0(), "superEntity"); 
                    	

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleEntity689); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:335:1: (lv_attributes_5= ruleAttribute )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:338:6: lv_attributes_5= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity723);
            	    lv_attributes_5=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "attributes", lv_attributes_5, "Attribute", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleEntity737); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleAttribute
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:367:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:367:51: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:368:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute770);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:375:1: ruleAttribute returns [EObject current=null] : ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:380:6: ( ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:381:1: ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:381:1: ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:381:2: ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:381:2: ( RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:384:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute827); 

            		createLeafNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:397:2: (lv_many_1= '*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:399:6: lv_many_1= '*'
                    {
                    lv_many_1=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleAttribute851); 

                            createLeafNode(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:418:3: (lv_name_2= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:420:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute887); 

            		createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel141 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTypeDef338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef360 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleTypeDef412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID508 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleJAVAID526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID535 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEntity613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity635 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEntity653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity675 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity689 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity723 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEntity737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute827 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleAttribute851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute887 = new BitSet(new long[]{0x0000000000000002L});

}