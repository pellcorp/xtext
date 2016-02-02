package com.pellcorp.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.pellcorp.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'workspace'", "'description'", "'.'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "']'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_DECIMAL=8;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFQN"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleFQN EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN121);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN128); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__FQN__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__FQN__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN154);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ( ruleEntity EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity183);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity190); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:127:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__Entity__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rule__Entity__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity216);
            rule__Entity__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleBuiltInType"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRuleBuiltInType : ruleBuiltInType EOF ;
    public final void entryRuleBuiltInType() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( ruleBuiltInType EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ruleBuiltInType EOF
            {
             before(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType243);
            ruleBuiltInType();

            state._fsp--;

             after(grammarAccess.getBuiltInTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType250); 

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
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: ruleBuiltInType : ( ( rule__BuiltInType__Group__0 ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( rule__BuiltInType__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__BuiltInType__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__BuiltInType__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__BuiltInType__Group__0 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__BuiltInType__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:2: rule__BuiltInType__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__0_in_ruleBuiltInType276);
            rule__BuiltInType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleField"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleField EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField303);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField310); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__Field__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__Field__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__Field__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField336);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "rule__Field__Alternatives_3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: rule__Field__Alternatives_3 : ( ( ( rule__Field__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__Field__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:207:1: ( ( ( rule__Field__Group_3_0__0 ) ) | ( ';' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EOF||LA1_0==RULE_ID||LA1_0==15||LA1_0==19||LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( ( rule__Field__Group_3_0__0 ) )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( ( rule__Field__Group_3_0__0 ) )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ( rule__Field__Group_3_0__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_3_0()); 
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:1: ( rule__Field__Group_3_0__0 )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:2: rule__Field__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0__0_in_rule__Field__Alternatives_3373);
                    rule__Field__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:6: ( ';' )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:6: ( ';' )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ';'
                    {
                     before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); 
                    match(input,13,FOLLOW_13_in_rule__Field__Alternatives_3392); 
                     after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__Field__Alternatives_3"


    // $ANTLR start "rule__Field__Alternatives_3_0_1_3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:227:1: rule__Field__Alternatives_3_0_1_3 : ( ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) ) | ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) ) );
    public final void rule__Field__Alternatives_3_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ( ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) ) | ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 )
                    {
                     before(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); 
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:234:2: rule__Field__UpperUnlimitedAssignment_3_0_1_3_0
                    {
                    pushFollow(FOLLOW_rule__Field__UpperUnlimitedAssignment_3_0_1_3_0_in_rule__Field__Alternatives_3_0_1_3426);
                    rule__Field__UpperUnlimitedAssignment_3_0_1_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:238:6: ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:238:6: ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ( rule__Field__UpperAssignment_3_0_1_3_1 )
                    {
                     before(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); 
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ( rule__Field__UpperAssignment_3_0_1_3_1 )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:2: rule__Field__UpperAssignment_3_0_1_3_1
                    {
                    pushFollow(FOLLOW_rule__Field__UpperAssignment_3_0_1_3_1_in_rule__Field__Alternatives_3_0_1_3444);
                    rule__Field__UpperAssignment_3_0_1_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); 

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
    // $ANTLR end "rule__Field__Alternatives_3_0_1_3"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:255:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0475);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0478);
            rule__Model__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: rule__Model__Group__0__Impl : ( 'workspace' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: ( ( 'workspace' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: ( 'workspace' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: ( 'workspace' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: 'workspace'
            {
             before(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl506); 
             after(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1537);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1540);
            rule__Model__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__Model__NameAssignment_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl567);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2597);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2600);
            rule__Model__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: rule__Model__Group__2__Impl : ( ';' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__2__Impl628); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:347:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3659);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3662);
            rule__Model__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( ( rule__Model__Group_3__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( rule__Model__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:361:2: rule__Model__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl689);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( rule__Model__Group__4__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:376:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4720);
            rule__Model__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: rule__Model__Group__4__Impl : ( ( rule__Model__DataTypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( ( ( rule__Model__DataTypesAssignment_4 )* ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( ( rule__Model__DataTypesAssignment_4 )* )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( ( rule__Model__DataTypesAssignment_4 )* )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( rule__Model__DataTypesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getDataTypesAssignment_4()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( rule__Model__DataTypesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:2: rule__Model__DataTypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__DataTypesAssignment_4_in_rule__Model__Group__4__Impl747);
            	    rule__Model__DataTypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDataTypesAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__0788);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__0791);
            rule__Model__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: rule__Model__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ( 'description' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( 'description' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( 'description' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: 'description'
            {
             before(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group_3__0__Impl819); 
             after(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:445:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__1850);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__1853);
            rule__Model__Group_3__2();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ( ( rule__Model__DescriptionAssignment_3_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( rule__Model__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: ( rule__Model__DescriptionAssignment_3_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:459:2: rule__Model__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Model__DescriptionAssignment_3_1_in_rule__Model__Group_3__1__Impl880);
            rule__Model__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:473:1: ( rule__Model__Group_3__2__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:474:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__2910);
            rule__Model__Group_3__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: rule__Model__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group_3__2__Impl938); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0975);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0978);
            rule__FQN__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: ( ( RULE_ID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( RULE_ID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( RULE_ID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1005); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( rule__FQN__Group__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11034);
            rule__FQN__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__FQN__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1061);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01096);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01099);
            rule__FQN__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( ( '.' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( '.' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( '.' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__FQN__Group_1__0__Impl1127); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11158);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ( RULE_ID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( RULE_ID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( RULE_ID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1185); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01218);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01221);
            rule__Entity__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( ( 'entity' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( 'entity' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( 'entity' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__0__Impl1249); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11280);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11283);
            rule__Entity__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( rule__Entity__NameAssignment_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1310);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21340);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21343);
            rule__Entity__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ( '{' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( '{' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( '{' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__2__Impl1371); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31402);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31405);
            rule__Entity__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( ( rule__Entity__Group_3__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( rule__Entity__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:739:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1432);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41463);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41466);
            rule__Entity__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( rule__Entity__FieldsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:2: rule__Entity__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_4_in_rule__Entity__Group__4__Impl1493);
            	    rule__Entity__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( rule__Entity__Group__5__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51524);
            rule__Entity__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( ( '}' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( '}' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( '}' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__5__Impl1552); 
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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01595);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01598);
            rule__Entity__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: rule__Entity__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( ( 'description' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( 'description' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( 'description' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: 'description'
            {
             before(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group_3__0__Impl1626); 
             after(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11657);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__11660);
            rule__Entity__Group_3__2();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( ( ( rule__Entity__DescriptionAssignment_3_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( ( rule__Entity__DescriptionAssignment_3_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( ( rule__Entity__DescriptionAssignment_3_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( rule__Entity__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ( rule__Entity__DescriptionAssignment_3_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:2: rule__Entity__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_3_1_in_rule__Entity__Group_3__1__Impl1687);
            rule__Entity__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( rule__Entity__Group_3__2__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:2: rule__Entity__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__21717);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: rule__Entity__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ';'
            {
             before(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group_3__2__Impl1745); 
             after(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__BuiltInType__Group__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: rule__BuiltInType__Group__0 : rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1 ;
    public final void rule__BuiltInType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:2: rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__0__Impl_in_rule__BuiltInType__Group__01782);
            rule__BuiltInType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BuiltInType__Group__1_in_rule__BuiltInType__Group__01785);
            rule__BuiltInType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__BuiltInType__Group__0"


    // $ANTLR start "rule__BuiltInType__Group__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: rule__BuiltInType__Group__0__Impl : ( ( rule__BuiltInType__NameAssignment_0 ) ) ;
    public final void rule__BuiltInType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( ( rule__BuiltInType__NameAssignment_0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ( rule__BuiltInType__NameAssignment_0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ( rule__BuiltInType__NameAssignment_0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__BuiltInType__NameAssignment_0 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( rule__BuiltInType__NameAssignment_0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:2: rule__BuiltInType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BuiltInType__NameAssignment_0_in_rule__BuiltInType__Group__0__Impl1812);
            rule__BuiltInType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BuiltInType__Group__0__Impl"


    // $ANTLR start "rule__BuiltInType__Group__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: rule__BuiltInType__Group__1 : rule__BuiltInType__Group__1__Impl ;
    public final void rule__BuiltInType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: ( rule__BuiltInType__Group__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:2: rule__BuiltInType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__1__Impl_in_rule__BuiltInType__Group__11842);
            rule__BuiltInType__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__BuiltInType__Group__1"


    // $ANTLR start "rule__BuiltInType__Group__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: rule__BuiltInType__Group__1__Impl : ( ( rule__BuiltInType__DescriptionAssignment_1 ) ) ;
    public final void rule__BuiltInType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( ( ( rule__BuiltInType__DescriptionAssignment_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( ( rule__BuiltInType__DescriptionAssignment_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( ( rule__BuiltInType__DescriptionAssignment_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ( rule__BuiltInType__DescriptionAssignment_1 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: ( rule__BuiltInType__DescriptionAssignment_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:2: rule__BuiltInType__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInType__DescriptionAssignment_1_in_rule__BuiltInType__Group__1__Impl1869);
            rule__BuiltInType__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__BuiltInType__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01903);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01906);
            rule__Field__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( rule__Field__NameAssignment_0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1933);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11963);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11966);
            rule__Field__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ( ':' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ':' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ':' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Field__Group__1__Impl1994); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22025);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22028);
            rule__Field__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( rule__Field__TypeAssignment_2 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__Field__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( rule__Field__TypeAssignment_2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:2: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl2055);
            rule__Field__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__Field__Group__3__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32085);
            rule__Field__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: rule__Field__Group__3__Impl : ( ( rule__Field__Alternatives_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ( ( rule__Field__Alternatives_3 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( rule__Field__Alternatives_3 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( rule__Field__Alternatives_3 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__Field__Alternatives_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( rule__Field__Alternatives_3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:2: rule__Field__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2112);
            rule__Field__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group_3_0__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: rule__Field__Group_3_0__0 : rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1 ;
    public final void rule__Field__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:2: rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0__0__Impl_in_rule__Field__Group_3_0__02150);
            rule__Field__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0__1_in_rule__Field__Group_3_0__02153);
            rule__Field__Group_3_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0__0"


    // $ANTLR start "rule__Field__Group_3_0__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: rule__Field__Group_3_0__0__Impl : ( ( rule__Field__Group_3_0_0__0 )? ) ;
    public final void rule__Field__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( ( ( rule__Field__Group_3_0_0__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( ( rule__Field__Group_3_0_0__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( ( rule__Field__Group_3_0_0__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( rule__Field__Group_3_0_0__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3_0_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( rule__Field__Group_3_0_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:2: rule__Field__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0_0__0_in_rule__Field__Group_3_0__0__Impl2180);
                    rule__Field__Group_3_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_3_0_0()); 

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
    // $ANTLR end "rule__Field__Group_3_0__0__Impl"


    // $ANTLR start "rule__Field__Group_3_0__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: rule__Field__Group_3_0__1 : rule__Field__Group_3_0__1__Impl ;
    public final void rule__Field__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rule__Field__Group_3_0__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:2: rule__Field__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0__1__Impl_in_rule__Field__Group_3_0__12211);
            rule__Field__Group_3_0__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0__1"


    // $ANTLR start "rule__Field__Group_3_0__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: rule__Field__Group_3_0__1__Impl : ( ( rule__Field__Group_3_0_1__0 )? ) ;
    public final void rule__Field__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( ( rule__Field__Group_3_0_1__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( ( rule__Field__Group_3_0_1__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( ( rule__Field__Group_3_0_1__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( rule__Field__Group_3_0_1__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3_0_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( rule__Field__Group_3_0_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:2: rule__Field__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0_1__0_in_rule__Field__Group_3_0__1__Impl2238);
                    rule__Field__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_3_0_1()); 

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
    // $ANTLR end "rule__Field__Group_3_0__1__Impl"


    // $ANTLR start "rule__Field__Group_3_0_0__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__Field__Group_3_0_0__0 : rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1 ;
    public final void rule__Field__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:2: rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__0__Impl_in_rule__Field__Group_3_0_0__02273);
            rule__Field__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_0__1_in_rule__Field__Group_3_0_0__02276);
            rule__Field__Group_3_0_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_0__0"


    // $ANTLR start "rule__Field__Group_3_0_0__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: rule__Field__Group_3_0_0__0__Impl : ( 'description' ) ;
    public final void rule__Field__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( ( 'description' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( 'description' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( 'description' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: 'description'
            {
             before(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group_3_0_0__0__Impl2304); 
             after(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); 

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
    // $ANTLR end "rule__Field__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__Field__Group_3_0_0__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rule__Field__Group_3_0_0__1 : rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2 ;
    public final void rule__Field__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:2: rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__1__Impl_in_rule__Field__Group_3_0_0__12335);
            rule__Field__Group_3_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_0__2_in_rule__Field__Group_3_0_0__12338);
            rule__Field__Group_3_0_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_0__1"


    // $ANTLR start "rule__Field__Group_3_0_0__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: rule__Field__Group_3_0_0__1__Impl : ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) ) ;
    public final void rule__Field__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ( rule__Field__DescriptionAssignment_3_0_0_1 )
            {
             before(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: ( rule__Field__DescriptionAssignment_3_0_0_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:2: rule__Field__DescriptionAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Field__DescriptionAssignment_3_0_0_1_in_rule__Field__Group_3_0_0__1__Impl2365);
            rule__Field__DescriptionAssignment_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); 

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
    // $ANTLR end "rule__Field__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__Field__Group_3_0_0__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: rule__Field__Group_3_0_0__2 : rule__Field__Group_3_0_0__2__Impl ;
    public final void rule__Field__Group_3_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( rule__Field__Group_3_0_0__2__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:2: rule__Field__Group_3_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__2__Impl_in_rule__Field__Group_3_0_0__22395);
            rule__Field__Group_3_0_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_0__2"


    // $ANTLR start "rule__Field__Group_3_0_0__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: rule__Field__Group_3_0_0__2__Impl : ( ';' ) ;
    public final void rule__Field__Group_3_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group_3_0_0__2__Impl2423); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); 

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
    // $ANTLR end "rule__Field__Group_3_0_0__2__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: rule__Field__Group_3_0_1__0 : rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1 ;
    public final void rule__Field__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:2: rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__0__Impl_in_rule__Field__Group_3_0_1__02460);
            rule__Field__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__1_in_rule__Field__Group_3_0_1__02463);
            rule__Field__Group_3_0_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_1__0"


    // $ANTLR start "rule__Field__Group_3_0_1__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: rule__Field__Group_3_0_1__0__Impl : ( '[' ) ;
    public final void rule__Field__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( ( '[' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( '[' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( '[' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: '['
            {
             before(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Field__Group_3_0_1__0__Impl2491); 
             after(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__Field__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: rule__Field__Group_3_0_1__1 : rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2 ;
    public final void rule__Field__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:2: rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__1__Impl_in_rule__Field__Group_3_0_1__12522);
            rule__Field__Group_3_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__2_in_rule__Field__Group_3_0_1__12525);
            rule__Field__Group_3_0_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_1__1"


    // $ANTLR start "rule__Field__Group_3_0_1__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__Field__Group_3_0_1__1__Impl : ( ( rule__Field__LowerAssignment_3_0_1_1 ) ) ;
    public final void rule__Field__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( ( rule__Field__LowerAssignment_3_0_1_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( rule__Field__LowerAssignment_3_0_1_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( rule__Field__LowerAssignment_3_0_1_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__Field__LowerAssignment_3_0_1_1 )
            {
             before(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( rule__Field__LowerAssignment_3_0_1_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:2: rule__Field__LowerAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Field__LowerAssignment_3_0_1_1_in_rule__Field__Group_3_0_1__1__Impl2552);
            rule__Field__LowerAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); 

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
    // $ANTLR end "rule__Field__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: rule__Field__Group_3_0_1__2 : rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3 ;
    public final void rule__Field__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: ( rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:2: rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__2__Impl_in_rule__Field__Group_3_0_1__22582);
            rule__Field__Group_3_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__3_in_rule__Field__Group_3_0_1__22585);
            rule__Field__Group_3_0_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_1__2"


    // $ANTLR start "rule__Field__Group_3_0_1__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: rule__Field__Group_3_0_1__2__Impl : ( ',' ) ;
    public final void rule__Field__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( ( ',' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ',' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ',' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group_3_0_1__2__Impl2613); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); 

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
    // $ANTLR end "rule__Field__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: rule__Field__Group_3_0_1__3 : rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4 ;
    public final void rule__Field__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: ( rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:2: rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__3__Impl_in_rule__Field__Group_3_0_1__32644);
            rule__Field__Group_3_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__4_in_rule__Field__Group_3_0_1__32647);
            rule__Field__Group_3_0_1__4();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_1__3"


    // $ANTLR start "rule__Field__Group_3_0_1__3__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: rule__Field__Group_3_0_1__3__Impl : ( ( rule__Field__Alternatives_3_0_1_3 ) ) ;
    public final void rule__Field__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( ( ( rule__Field__Alternatives_3_0_1_3 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( ( rule__Field__Alternatives_3_0_1_3 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( ( rule__Field__Alternatives_3_0_1_3 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ( rule__Field__Alternatives_3_0_1_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( rule__Field__Alternatives_3_0_1_3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:2: rule__Field__Alternatives_3_0_1_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_0_1_3_in_rule__Field__Group_3_0_1__3__Impl2674);
            rule__Field__Alternatives_3_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); 

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
    // $ANTLR end "rule__Field__Group_3_0_1__3__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__4"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: rule__Field__Group_3_0_1__4 : rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5 ;
    public final void rule__Field__Group_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:2: rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__4__Impl_in_rule__Field__Group_3_0_1__42704);
            rule__Field__Group_3_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__5_in_rule__Field__Group_3_0_1__42707);
            rule__Field__Group_3_0_1__5();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_1__4"


    // $ANTLR start "rule__Field__Group_3_0_1__4__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: rule__Field__Group_3_0_1__4__Impl : ( ']' ) ;
    public final void rule__Field__Group_3_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: ( ( ']' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( ']' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( ']' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ']'
            {
             before(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_3_0_1__4__Impl2735); 
             after(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); 

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
    // $ANTLR end "rule__Field__Group_3_0_1__4__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__5"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: rule__Field__Group_3_0_1__5 : rule__Field__Group_3_0_1__5__Impl ;
    public final void rule__Field__Group_3_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ( rule__Field__Group_3_0_1__5__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:2: rule__Field__Group_3_0_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__5__Impl_in_rule__Field__Group_3_0_1__52766);
            rule__Field__Group_3_0_1__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Field__Group_3_0_1__5"


    // $ANTLR start "rule__Field__Group_3_0_1__5__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: rule__Field__Group_3_0_1__5__Impl : ( ';' ) ;
    public final void rule__Field__Group_3_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group_3_0_1__5__Impl2794); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); 

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
    // $ANTLR end "rule__Field__Group_3_0_1__5__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( RULE_ID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( RULE_ID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( RULE_ID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_12842); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__DescriptionAssignment_3_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: rule__Model__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Model__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__DescriptionAssignment_3_12873); 
             after(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Model__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Model__DataTypesAssignment_4"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: rule__Model__DataTypesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Model__DataTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( ( ruleEntity ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ruleEntity )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ruleEntity )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__DataTypesAssignment_42904);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__DataTypesAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: ( ( RULE_ID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( RULE_ID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( RULE_ID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12935); 
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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__DescriptionAssignment_3_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: rule__Entity__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_3_12966); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Entity__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_4"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( ( ruleField ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ruleField )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ruleField )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_42997);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__FieldsAssignment_4"


    // $ANTLR start "rule__BuiltInType__NameAssignment_0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: rule__BuiltInType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BuiltInType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( RULE_ID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( RULE_ID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( RULE_ID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: RULE_ID
            {
             before(grammarAccess.getBuiltInTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BuiltInType__NameAssignment_03028); 
             after(grammarAccess.getBuiltInTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BuiltInType__NameAssignment_0"


    // $ANTLR start "rule__BuiltInType__DescriptionAssignment_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: rule__BuiltInType__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BuiltInType__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: RULE_STRING
            {
             before(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BuiltInType__DescriptionAssignment_13059); 
             after(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BuiltInType__DescriptionAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( ( RULE_ID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( RULE_ID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( RULE_ID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_03090); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: rule__Field__TypeAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( ( ( ruleFQN ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ruleFQN ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ruleFQN ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ruleFQN )
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( ruleFQN )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ruleFQN
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Field__TypeAssignment_23125);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__Field__DescriptionAssignment_3_0_0_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: rule__Field__DescriptionAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Field__DescriptionAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__DescriptionAssignment_3_0_0_13160); 
             after(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 

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
    // $ANTLR end "rule__Field__DescriptionAssignment_3_0_0_1"


    // $ANTLR start "rule__Field__LowerAssignment_3_0_1_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: rule__Field__LowerAssignment_3_0_1_1 : ( RULE_INT ) ;
    public final void rule__Field__LowerAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ( ( RULE_INT ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ( RULE_INT )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ( RULE_INT )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__LowerAssignment_3_0_1_13191); 
             after(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 

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
    // $ANTLR end "rule__Field__LowerAssignment_3_0_1_1"


    // $ANTLR start "rule__Field__UpperUnlimitedAssignment_3_0_1_3_0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 : ( ( '*' ) ) ;
    public final void rule__Field__UpperUnlimitedAssignment_3_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: ( ( ( '*' ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( '*' ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( '*' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( '*' )
            {
             before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( '*' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: '*'
            {
             before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Field__UpperUnlimitedAssignment_3_0_1_3_03227); 
             after(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 

            }

             after(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 

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
    // $ANTLR end "rule__Field__UpperUnlimitedAssignment_3_0_1_3_0"


    // $ANTLR start "rule__Field__UpperAssignment_3_0_1_3_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: rule__Field__UpperAssignment_3_0_1_3_1 : ( RULE_INT ) ;
    public final void rule__Field__UpperAssignment_3_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ( RULE_INT ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( RULE_INT )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( RULE_INT )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__UpperAssignment_3_0_1_3_13266); 
             after(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 

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
    // $ANTLR end "rule__Field__UpperAssignment_3_0_1_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__0_in_ruleBuiltInType276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__0_in_rule__Field__Alternatives_3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Alternatives_3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UpperUnlimitedAssignment_3_0_1_3_0_in_rule__Field__Alternatives_3_0_1_3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UpperAssignment_3_0_1_3_1_in_rule__Field__Alternatives_3_0_1_3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1537 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2597 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__2__Impl628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3659 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DataTypesAssignment_4_in_rule__Model__Group__4__Impl747 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__0788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__0791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_3__0__Impl819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__1850 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_3_1_in_rule__Model__Group_3__1__Impl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_3__2__Impl938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0975 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1061 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FQN__Group_1__0__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__0__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11280 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21340 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__2__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31402 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41463 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_4_in_rule__Entity__Group__4__Impl1493 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__5__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group_3__0__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11657 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_3_1_in_rule__Entity__Group_3__1__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__21717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group_3__2__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__0__Impl_in_rule__BuiltInType__Group__01782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__1_in_rule__BuiltInType__Group__01785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__NameAssignment_0_in_rule__BuiltInType__Group__0__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__1__Impl_in_rule__BuiltInType__Group__11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__DescriptionAssignment_1_in_rule__BuiltInType__Group__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01903 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Field__Group__1__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22025 = new BitSet(new long[]{0x000000000020A000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__0__Impl_in_rule__Field__Group_3_0__02150 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__1_in_rule__Field__Group_3_0__02153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__0_in_rule__Field__Group_3_0__0__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__1__Impl_in_rule__Field__Group_3_0__12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__0_in_rule__Field__Group_3_0__1__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__0__Impl_in_rule__Field__Group_3_0_0__02273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__1_in_rule__Field__Group_3_0_0__02276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group_3_0_0__0__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__1__Impl_in_rule__Field__Group_3_0_0__12335 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__2_in_rule__Field__Group_3_0_0__12338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DescriptionAssignment_3_0_0_1_in_rule__Field__Group_3_0_0__1__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__2__Impl_in_rule__Field__Group_3_0_0__22395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group_3_0_0__2__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__0__Impl_in_rule__Field__Group_3_0_1__02460 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__1_in_rule__Field__Group_3_0_1__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group_3_0_1__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__1__Impl_in_rule__Field__Group_3_0_1__12522 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__2_in_rule__Field__Group_3_0_1__12525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LowerAssignment_3_0_1_1_in_rule__Field__Group_3_0_1__1__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__2__Impl_in_rule__Field__Group_3_0_1__22582 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__3_in_rule__Field__Group_3_0_1__22585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group_3_0_1__2__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__3__Impl_in_rule__Field__Group_3_0_1__32644 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__4_in_rule__Field__Group_3_0_1__32647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_0_1_3_in_rule__Field__Group_3_0_1__3__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__4__Impl_in_rule__Field__Group_3_0_1__42704 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__5_in_rule__Field__Group_3_0_1__42707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_3_0_1__4__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__5__Impl_in_rule__Field__Group_3_0_1__52766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group_3_0_1__5__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_12842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__DescriptionAssignment_3_12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__DataTypesAssignment_42904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_3_12966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_42997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BuiltInType__NameAssignment_03028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BuiltInType__DescriptionAssignment_13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Field__TypeAssignment_23125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__DescriptionAssignment_3_0_0_13160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__LowerAssignment_3_0_1_13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__UpperUnlimitedAssignment_3_0_1_3_03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__UpperAssignment_3_0_1_3_13266 = new BitSet(new long[]{0x0000000000000002L});

}