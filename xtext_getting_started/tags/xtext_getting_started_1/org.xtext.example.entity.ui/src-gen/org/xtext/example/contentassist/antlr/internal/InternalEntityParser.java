package org.xtext.example.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEntityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'typedef'", "'mapsto'", "'.'", "'entity'", "'{'", "'}'", "'extends'", "'*'"
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
    public String getGrammarFileName() { return "../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g"; }


     
     	private EntityGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:60:16: ( ruleModel EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:61:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:68:1: ruleModel : ( ( rule__Model__TypesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:72:2: ( ( ( rule__Model__TypesAssignment )* ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:73:1: ( ( rule__Model__TypesAssignment )* )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:73:1: ( ( rule__Model__TypesAssignment )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:74:1: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:75:1: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:75:2: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_in_ruleModel94);
            	    rule__Model__TypesAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleType
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:87:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:87:15: ( ruleType EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:88:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType121);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:95:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:99:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:100:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:100:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:101:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:102:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:102:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType155);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleTypeDef
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:114:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:114:18: ( ruleTypeDef EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:115:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef181);
            ruleTypeDef();
            _fsp--;

             after(grammarAccess.getTypeDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypeDef


    // $ANTLR start ruleTypeDef
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:122:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:126:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:127:1: ( ( rule__TypeDef__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:127:1: ( ( rule__TypeDef__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:128:1: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:129:1: ( rule__TypeDef__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:129:2: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef215);
            rule__TypeDef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeDef


    // $ANTLR start entryRuleJAVAID
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:141:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:141:17: ( ruleJAVAID EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:142:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID241);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleJAVAID


    // $ANTLR start ruleJAVAID
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:149:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:153:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:154:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:154:1: ( ( rule__JAVAID__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:155:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:156:1: ( rule__JAVAID__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:156:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID275);
            rule__JAVAID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJAVAID


    // $ANTLR start entryRuleEntity
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:168:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:168:17: ( ruleEntity EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:169:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity301);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:176:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:180:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:181:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:181:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:182:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:183:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:183:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity335);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleAttribute
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:195:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:195:20: ( ruleAttribute EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:196:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:203:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:207:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:208:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:208:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:209:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:210:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:210:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395);
            rule__Attribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start rule__Type__Alternatives
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:222:1: rule__Type__Alternatives : ( ( ruleTypeDef ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:226:1: ( ( ruleTypeDef ) | ( ruleEntity ) )
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
                    new NoViableAltException("222:1: rule__Type__Alternatives : ( ( ruleTypeDef ) | ( ruleEntity ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:227:1: ( ruleTypeDef )
                    {
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:227:1: ( ruleTypeDef )
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:228:1: ruleTypeDef
                    {
                     before(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeDef_in_rule__Type__Alternatives431);
                    ruleTypeDef();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:233:6: ( ruleEntity )
                    {
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:233:6: ( ruleEntity )
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:234:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives448);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__TypeDef__Group__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:246:1: rule__TypeDef__Group__0 : ( 'typedef' ) rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:250:1: ( ( 'typedef' ) rule__TypeDef__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:251:1: ( 'typedef' ) rule__TypeDef__Group__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:251:1: ( 'typedef' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:252:1: 'typedef'
            {
             before(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__TypeDef__Group__0483); 
             after(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__0493);
            rule__TypeDef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__Group__0


    // $ANTLR start rule__TypeDef__Group__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:266:1: rule__TypeDef__Group__1 : ( ( rule__TypeDef__NameAssignment_1 ) ) rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:270:1: ( ( ( rule__TypeDef__NameAssignment_1 ) ) rule__TypeDef__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:271:1: ( ( rule__TypeDef__NameAssignment_1 ) ) rule__TypeDef__Group__2
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:271:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:272:1: ( rule__TypeDef__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:273:1: ( rule__TypeDef__NameAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:273:2: rule__TypeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDef__NameAssignment_1_in_rule__TypeDef__Group__1521);
            rule__TypeDef__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__TypeDef__Group__2_in_rule__TypeDef__Group__1530);
            rule__TypeDef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__Group__1


    // $ANTLR start rule__TypeDef__Group__2
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:284:1: rule__TypeDef__Group__2 : ( ( rule__TypeDef__Group_2__0 )? ) ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:288:1: ( ( ( rule__TypeDef__Group_2__0 )? ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:289:1: ( ( rule__TypeDef__Group_2__0 )? )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:289:1: ( ( rule__TypeDef__Group_2__0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:290:1: ( rule__TypeDef__Group_2__0 )?
            {
             before(grammarAccess.getTypeDefAccess().getGroup_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:291:1: ( rule__TypeDef__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:291:2: rule__TypeDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeDef__Group_2__0_in_rule__TypeDef__Group__2558);
                    rule__TypeDef__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__Group__2


    // $ANTLR start rule__TypeDef__Group_2__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:307:1: rule__TypeDef__Group_2__0 : ( 'mapsto' ) rule__TypeDef__Group_2__1 ;
    public final void rule__TypeDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:311:1: ( ( 'mapsto' ) rule__TypeDef__Group_2__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:312:1: ( 'mapsto' ) rule__TypeDef__Group_2__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:312:1: ( 'mapsto' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:313:1: 'mapsto'
            {
             before(grammarAccess.getTypeDefAccess().getMapstoKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__TypeDef__Group_2__0600); 
             after(grammarAccess.getTypeDefAccess().getMapstoKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__TypeDef__Group_2__1_in_rule__TypeDef__Group_2__0610);
            rule__TypeDef__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__Group_2__0


    // $ANTLR start rule__TypeDef__Group_2__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:327:1: rule__TypeDef__Group_2__1 : ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__TypeDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:331:1: ( ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:332:1: ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:332:1: ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:333:1: ( rule__TypeDef__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getTypeDefAccess().getMappedTypeAssignment_2_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:334:1: ( rule__TypeDef__MappedTypeAssignment_2_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:334:2: rule__TypeDef__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TypeDef__MappedTypeAssignment_2_1_in_rule__TypeDef__Group_2__1638);
            rule__TypeDef__MappedTypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getMappedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__Group_2__1


    // $ANTLR start rule__JAVAID__Group__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:348:1: rule__JAVAID__Group__0 : ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:352:1: ( ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:353:1: ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:353:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:354:1: ( rule__JAVAID__NameAssignment_0 )
            {
             before(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:355:1: ( rule__JAVAID__NameAssignment_0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:355:2: rule__JAVAID__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__0676);
            rule__JAVAID__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__0685);
            rule__JAVAID__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group__0


    // $ANTLR start rule__JAVAID__Group__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:366:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:370:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:371:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:371:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:372:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:373:1: ( rule__JAVAID__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:373:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__1713);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJAVAIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group__1


    // $ANTLR start rule__JAVAID__Group_1__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:387:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:391:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:392:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:392:1: ( '.' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:393:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__JAVAID__Group_1__0753); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__0763);
            rule__JAVAID__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group_1__0


    // $ANTLR start rule__JAVAID__Group_1__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:407:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:411:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:412:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:412:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:413:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__1791); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group_1__1


    // $ANTLR start rule__Entity__Group__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:428:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:432:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:433:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:433:1: ( 'entity' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:434:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__0829); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0839);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:448:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:452:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:453:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:453:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:454:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:455:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:455:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1867);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1876);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__2
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:466:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:470:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:471:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:471:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:472:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:473:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:473:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2904);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2914);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__3
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:484:1: rule__Entity__Group__3 : ( '{' ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:488:1: ( ( '{' ) rule__Entity__Group__4 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:489:1: ( '{' ) rule__Entity__Group__4
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:489:1: ( '{' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:490:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__3943); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3953);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__4
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:504:1: rule__Entity__Group__4 : ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:508:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:509:1: ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:509:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:510:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:511:1: ( rule__Entity__AttributesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:511:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4981);
            	    rule__Entity__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4991);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__5
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:522:1: rule__Entity__Group__5 : ( '}' ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:526:1: ( ( '}' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:527:1: ( '}' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:527:1: ( '}' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:528:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__51020); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group_2__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:553:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:557:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:558:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:558:1: ( 'extends' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:559:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group_2__01068); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01078);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:573:1: rule__Entity__Group_2__1 : ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:577:1: ( ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:578:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:578:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:579:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:580:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:580:2: rule__Entity__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__11106);
            rule__Entity__SuperEntityAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Attribute__Group__0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:594:1: rule__Attribute__Group__0 : ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:598:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:599:1: ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:599:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:600:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:601:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:601:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__01144);
            rule__Attribute__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01153);
            rule__Attribute__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:612:1: rule__Attribute__Group__1 : ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:616:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:617:1: ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:617:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:618:1: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:619:1: ( rule__Attribute__ManyAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:619:2: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__11181);
                    rule__Attribute__ManyAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11191);
            rule__Attribute__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__2
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:630:1: rule__Attribute__Group__2 : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:634:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:635:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:635:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:636:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:637:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:637:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__21219);
            rule__Attribute__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Model__TypesAssignment
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:653:1: rule__Model__TypesAssignment : ( ruleType ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:657:1: ( ( ruleType ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:658:1: ( ruleType )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:658:1: ( ruleType )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:659:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment1259);
            ruleType();
            _fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__TypesAssignment


    // $ANTLR start rule__TypeDef__NameAssignment_1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:668:1: rule__TypeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:672:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:673:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:673:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:674:1: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDef__NameAssignment_11290); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__NameAssignment_1


    // $ANTLR start rule__TypeDef__MappedTypeAssignment_2_1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:683:1: rule__TypeDef__MappedTypeAssignment_2_1 : ( ruleJAVAID ) ;
    public final void rule__TypeDef__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:687:1: ( ( ruleJAVAID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:688:1: ( ruleJAVAID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:688:1: ( ruleJAVAID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:689:1: ruleJAVAID
            {
             before(grammarAccess.getTypeDefAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__TypeDef__MappedTypeAssignment_2_11321);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getTypeDefAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDef__MappedTypeAssignment_2_1


    // $ANTLR start rule__JAVAID__NameAssignment_0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:698:1: rule__JAVAID__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JAVAID__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:702:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:703:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:703:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:704:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_01352); 
             after(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__NameAssignment_0


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:713:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:717:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:718:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:718:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:719:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11383); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__SuperEntityAssignment_2_1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:728:1: rule__Entity__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:732:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:733:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:733:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:734:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:735:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:736:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_11418); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__SuperEntityAssignment_2_1


    // $ANTLR start rule__Entity__AttributesAssignment_4
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:747:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:751:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:752:1: ( ruleAttribute )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:752:1: ( ruleAttribute )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:753:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_41453);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__AttributesAssignment_4


    // $ANTLR start rule__Attribute__TypeAssignment_0
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:762:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:766:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:767:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:767:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:768:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:769:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:770:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_01488); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__TypeAssignment_0


    // $ANTLR start rule__Attribute__ManyAssignment_1
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:781:1: rule__Attribute__ManyAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:785:1: ( ( ( '*' ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:786:1: ( ( '*' ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:786:1: ( ( '*' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:787:1: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:788:1: ( '*' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:789:1: '*'
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__ManyAssignment_11528); 
             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ManyAssignment_1


    // $ANTLR start rule__Attribute__NameAssignment_2
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:804:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:808:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:809:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:809:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalEntity.g:810:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21567); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__NameAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rule__Type__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__TypeDef__Group__0483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__0493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__NameAssignment_1_in_rule__TypeDef__Group__1521 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__2_in_rule__TypeDef__Group__1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2__0_in_rule__TypeDef__Group__2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TypeDef__Group_2__0600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2__1_in_rule__TypeDef__Group_2__0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__MappedTypeAssignment_2_1_in_rule__TypeDef__Group_2__1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__0676 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__0685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__1713 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rule__JAVAID__Group_1__0753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__0763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__0829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1867 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2904 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__3943 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4981 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__51020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group_2__01068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__01144 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__11181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__21219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDef__NameAssignment_11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__TypeDef__MappedTypeAssignment_2_11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_11418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_41453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_01488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__ManyAssignment_11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21567 = new BitSet(new long[]{0x0000000000000002L});

}