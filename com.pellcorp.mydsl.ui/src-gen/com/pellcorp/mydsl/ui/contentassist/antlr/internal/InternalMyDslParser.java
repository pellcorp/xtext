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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'percentage'", "'entity'", "';'", "'workspace'", "'description'", "'.'", "'{'", "'}'", "':'", "'['", "','", "']'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__25=25;
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


    // $ANTLR start "entryRuleMyID"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleMyID : ruleMyID EOF ;
    public final void entryRuleMyID() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleMyID EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleMyID EOF
            {
             before(grammarAccess.getMyIDRule()); 
            pushFollow(FOLLOW_ruleMyID_in_entryRuleMyID121);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getMyIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyID128); 

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
    // $ANTLR end "entryRuleMyID"


    // $ANTLR start "ruleMyID"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleMyID : ( ( rule__MyID__Alternatives ) ) ;
    public final void ruleMyID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__MyID__Alternatives ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__MyID__Alternatives ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__MyID__Alternatives ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__MyID__Alternatives )
            {
             before(grammarAccess.getMyIDAccess().getAlternatives()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__MyID__Alternatives )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__MyID__Alternatives
            {
            pushFollow(FOLLOW_rule__MyID__Alternatives_in_ruleMyID154);
            rule__MyID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleFQN"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleFQN EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN181);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN188); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__FQN__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__FQN__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN214);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( ruleEntity EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity243);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity250); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__Entity__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__Entity__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity276);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleBuiltInType : ruleBuiltInType EOF ;
    public final void entryRuleBuiltInType() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleBuiltInType EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleBuiltInType EOF
            {
             before(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType303);
            ruleBuiltInType();

            state._fsp--;

             after(grammarAccess.getBuiltInTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType310); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleBuiltInType : ( ( rule__BuiltInType__Group__0 ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( rule__BuiltInType__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__BuiltInType__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__BuiltInType__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__BuiltInType__Group__0 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__BuiltInType__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:2: rule__BuiltInType__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__0_in_ruleBuiltInType336);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ruleField EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField363);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField370); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__Field__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__Field__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__Field__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField396);
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


    // $ANTLR start "entryRuleChampionChallengerPort"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: entryRuleChampionChallengerPort : ruleChampionChallengerPort EOF ;
    public final void entryRuleChampionChallengerPort() throws RecognitionException {
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ( ruleChampionChallengerPort EOF )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ruleChampionChallengerPort EOF
            {
             before(grammarAccess.getChampionChallengerPortRule()); 
            pushFollow(FOLLOW_ruleChampionChallengerPort_in_entryRuleChampionChallengerPort425);
            ruleChampionChallengerPort();

            state._fsp--;

             after(grammarAccess.getChampionChallengerPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChampionChallengerPort432); 

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
    // $ANTLR end "entryRuleChampionChallengerPort"


    // $ANTLR start "ruleChampionChallengerPort"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ruleChampionChallengerPort : ( ( rule__ChampionChallengerPort__Group__0 ) ) ;
    public final void ruleChampionChallengerPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:2: ( ( ( rule__ChampionChallengerPort__Group__0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__ChampionChallengerPort__Group__0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__ChampionChallengerPort__Group__0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( rule__ChampionChallengerPort__Group__0 )
            {
             before(grammarAccess.getChampionChallengerPortAccess().getGroup()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( rule__ChampionChallengerPort__Group__0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:248:2: rule__ChampionChallengerPort__Group__0
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__0_in_ruleChampionChallengerPort458);
            rule__ChampionChallengerPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChampionChallengerPortAccess().getGroup()); 

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
    // $ANTLR end "ruleChampionChallengerPort"


    // $ANTLR start "rule__MyID__Alternatives"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: rule__MyID__Alternatives : ( ( RULE_ID ) | ( 'percentage' ) | ( 'entity' ) );
    public final void rule__MyID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( ( RULE_ID ) | ( 'percentage' ) | ( 'entity' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ( RULE_ID )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ( RULE_ID )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:266:1: RULE_ID
                    {
                     before(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MyID__Alternatives494); 
                     after(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:6: ( 'percentage' )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:6: ( 'percentage' )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: 'percentage'
                    {
                     before(grammarAccess.getMyIDAccess().getPercentageKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__MyID__Alternatives512); 
                     after(grammarAccess.getMyIDAccess().getPercentageKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:279:6: ( 'entity' )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:279:6: ( 'entity' )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: 'entity'
                    {
                     before(grammarAccess.getMyIDAccess().getEntityKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__MyID__Alternatives532); 
                     after(grammarAccess.getMyIDAccess().getEntityKeyword_2()); 

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
    // $ANTLR end "rule__MyID__Alternatives"


    // $ANTLR start "rule__Field__Alternatives_3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: rule__Field__Alternatives_3 : ( ( ( rule__Field__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__Field__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: ( ( ( rule__Field__Group_3_0__0 ) ) | ( ';' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==RULE_ID||(LA2_0>=13 && LA2_0<=14)||LA2_0==17||LA2_0==20||LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Field__Group_3_0__0 ) )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Field__Group_3_0__0 ) )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Field__Group_3_0__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_3_0()); 
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Field__Group_3_0__0 )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Field__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0__0_in_rule__Field__Alternatives_3567);
                    rule__Field__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:6: ( ';' )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:6: ( ';' )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ';'
                    {
                     before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); 
                    match(input,15,FOLLOW_15_in_rule__Field__Alternatives_3586); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: rule__Field__Alternatives_3_0_1_3 : ( ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) ) | ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) ) );
    public final void rule__Field__Alternatives_3_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ( ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) ) | ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 )
                    {
                     before(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); 
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:2: rule__Field__UpperUnlimitedAssignment_3_0_1_3_0
                    {
                    pushFollow(FOLLOW_rule__Field__UpperUnlimitedAssignment_3_0_1_3_0_in_rule__Field__Alternatives_3_0_1_3620);
                    rule__Field__UpperUnlimitedAssignment_3_0_1_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:6: ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) )
                    {
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:6: ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( rule__Field__UpperAssignment_3_0_1_3_1 )
                    {
                     before(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); 
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( rule__Field__UpperAssignment_3_0_1_3_1 )
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:2: rule__Field__UpperAssignment_3_0_1_3_1
                    {
                    pushFollow(FOLLOW_rule__Field__UpperAssignment_3_0_1_3_1_in_rule__Field__Alternatives_3_0_1_3638);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:346:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0669);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0672);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: rule__Model__Group__0__Impl : ( 'workspace' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( ( 'workspace' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( 'workspace' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( 'workspace' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: 'workspace'
            {
             before(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__0__Impl700); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1731);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1734);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( rule__Model__NameAssignment_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:391:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl761);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2791);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2794);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: rule__Model__Group__2__Impl : ( ';' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group__2__Impl822); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3853);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3856);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( ( rule__Model__Group_3__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: ( rule__Model__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:451:2: rule__Model__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl883);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( rule__Model__Group__4__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4914);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: rule__Model__Group__4__Impl : ( ( rule__Model__DataTypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ( ( ( rule__Model__DataTypesAssignment_4 )* ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ( rule__Model__DataTypesAssignment_4 )* )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ( rule__Model__DataTypesAssignment_4 )* )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( rule__Model__DataTypesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getDataTypesAssignment_4()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( rule__Model__DataTypesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:479:2: rule__Model__DataTypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__DataTypesAssignment_4_in_rule__Model__Group__4__Impl941);
            	    rule__Model__DataTypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:503:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:504:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__0982);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__0985);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: rule__Model__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( ( 'description' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( 'description' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( 'description' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: 'description'
            {
             before(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group_3__0__Impl1013); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11044);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11047);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( ( ( rule__Model__DescriptionAssignment_3_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ( rule__Model__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( rule__Model__DescriptionAssignment_3_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: rule__Model__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Model__DescriptionAssignment_3_1_in_rule__Model__Group_3__1__Impl1074);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( rule__Model__Group_3__2__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21104);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: rule__Model__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group_3__2__Impl1132); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01169);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01172);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: rule__FQN__Group__0__Impl : ( ruleMyID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ruleMyID
            {
             before(grammarAccess.getFQNAccess().getMyIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__FQN__Group__0__Impl1199);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getFQNAccess().getMyIDParserRuleCall_0()); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ( rule__FQN__Group__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11228);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1255);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01290);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01293);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( ( '.' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( '.' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( '.' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__FQN__Group_1__0__Impl1321); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11352);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: rule__FQN__Group_1__1__Impl : ( ruleMyID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ruleMyID
            {
             before(grammarAccess.getFQNAccess().getMyIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__FQN__Group_1__1__Impl1379);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getFQNAccess().getMyIDParserRuleCall_1_1()); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01412);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01415);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( ( 'entity' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( 'entity' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( 'entity' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__0__Impl1443); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11474);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11477);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( rule__Entity__NameAssignment_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1504);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21534);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21537);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ( ( '{' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( '{' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( '{' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__2__Impl1565); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31596);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31599);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ( rule__Entity__Group_3__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( rule__Entity__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1626);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41657);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41660);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__Entity__FieldsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=13 && LA8_0<=14)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:2: rule__Entity__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_4_in_rule__Entity__Group__4__Impl1687);
            	    rule__Entity__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( rule__Entity__Group__5__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51718);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( ( '}' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( '}' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( '}' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__5__Impl1746); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01789);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01792);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: rule__Entity__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ( ( 'description' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( 'description' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( 'description' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: 'description'
            {
             before(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group_3__0__Impl1820); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11851);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__11854);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( ( ( rule__Entity__DescriptionAssignment_3_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( ( rule__Entity__DescriptionAssignment_3_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( ( rule__Entity__DescriptionAssignment_3_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( rule__Entity__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( rule__Entity__DescriptionAssignment_3_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:2: rule__Entity__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_3_1_in_rule__Entity__Group_3__1__Impl1881);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( rule__Entity__Group_3__2__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:975:2: rule__Entity__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__21911);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: rule__Entity__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ';'
            {
             before(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group_3__2__Impl1939); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: rule__BuiltInType__Group__0 : rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1 ;
    public final void rule__BuiltInType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:2: rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__0__Impl_in_rule__BuiltInType__Group__01976);
            rule__BuiltInType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BuiltInType__Group__1_in_rule__BuiltInType__Group__01979);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: rule__BuiltInType__Group__0__Impl : ( ( rule__BuiltInType__NameAssignment_0 ) ) ;
    public final void rule__BuiltInType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ( ( rule__BuiltInType__NameAssignment_0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ( rule__BuiltInType__NameAssignment_0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ( rule__BuiltInType__NameAssignment_0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( rule__BuiltInType__NameAssignment_0 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( rule__BuiltInType__NameAssignment_0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:2: rule__BuiltInType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BuiltInType__NameAssignment_0_in_rule__BuiltInType__Group__0__Impl2006);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: rule__BuiltInType__Group__1 : rule__BuiltInType__Group__1__Impl ;
    public final void rule__BuiltInType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( rule__BuiltInType__Group__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:2: rule__BuiltInType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__1__Impl_in_rule__BuiltInType__Group__12036);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: rule__BuiltInType__Group__1__Impl : ( ( rule__BuiltInType__DescriptionAssignment_1 ) ) ;
    public final void rule__BuiltInType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ( ( ( rule__BuiltInType__DescriptionAssignment_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( ( rule__BuiltInType__DescriptionAssignment_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( ( rule__BuiltInType__DescriptionAssignment_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( rule__BuiltInType__DescriptionAssignment_1 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( rule__BuiltInType__DescriptionAssignment_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:2: rule__BuiltInType__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInType__DescriptionAssignment_1_in_rule__BuiltInType__Group__1__Impl2063);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02097);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02100);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( rule__Field__NameAssignment_0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2127);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12157);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12160);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( ( ':' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( ':' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( ':' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Field__Group__1__Impl2188); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22219);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22222);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( ( rule__Field__TypeAssignment_2 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( rule__Field__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( rule__Field__TypeAssignment_2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:2: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl2249);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( rule__Field__Group__3__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32279);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: rule__Field__Group__3__Impl : ( ( rule__Field__Alternatives_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( ( ( rule__Field__Alternatives_3 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( ( rule__Field__Alternatives_3 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( ( rule__Field__Alternatives_3 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( rule__Field__Alternatives_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( rule__Field__Alternatives_3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:2: rule__Field__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2306);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: rule__Field__Group_3_0__0 : rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1 ;
    public final void rule__Field__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:2: rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0__0__Impl_in_rule__Field__Group_3_0__02344);
            rule__Field__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0__1_in_rule__Field__Group_3_0__02347);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: rule__Field__Group_3_0__0__Impl : ( ( rule__Field__Group_3_0_0__0 )? ) ;
    public final void rule__Field__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( ( ( rule__Field__Group_3_0_0__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( rule__Field__Group_3_0_0__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( rule__Field__Group_3_0_0__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( rule__Field__Group_3_0_0__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3_0_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( rule__Field__Group_3_0_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:2: rule__Field__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0_0__0_in_rule__Field__Group_3_0__0__Impl2374);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: rule__Field__Group_3_0__1 : rule__Field__Group_3_0__1__Impl ;
    public final void rule__Field__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: ( rule__Field__Group_3_0__1__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:2: rule__Field__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0__1__Impl_in_rule__Field__Group_3_0__12405);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: rule__Field__Group_3_0__1__Impl : ( ( rule__Field__Group_3_0_1__0 )? ) ;
    public final void rule__Field__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( ( ( rule__Field__Group_3_0_1__0 )? ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( ( rule__Field__Group_3_0_1__0 )? )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( ( rule__Field__Group_3_0_1__0 )? )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( rule__Field__Group_3_0_1__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3_0_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ( rule__Field__Group_3_0_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:2: rule__Field__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0_1__0_in_rule__Field__Group_3_0__1__Impl2432);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: rule__Field__Group_3_0_0__0 : rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1 ;
    public final void rule__Field__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:2: rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__0__Impl_in_rule__Field__Group_3_0_0__02467);
            rule__Field__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_0__1_in_rule__Field__Group_3_0_0__02470);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: rule__Field__Group_3_0_0__0__Impl : ( 'description' ) ;
    public final void rule__Field__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: ( ( 'description' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( 'description' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( 'description' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: 'description'
            {
             before(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Field__Group_3_0_0__0__Impl2498); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: rule__Field__Group_3_0_0__1 : rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2 ;
    public final void rule__Field__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:2: rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__1__Impl_in_rule__Field__Group_3_0_0__12529);
            rule__Field__Group_3_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_0__2_in_rule__Field__Group_3_0_0__12532);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: rule__Field__Group_3_0_0__1__Impl : ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) ) ;
    public final void rule__Field__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( rule__Field__DescriptionAssignment_3_0_0_1 )
            {
             before(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( rule__Field__DescriptionAssignment_3_0_0_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:2: rule__Field__DescriptionAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Field__DescriptionAssignment_3_0_0_1_in_rule__Field__Group_3_0_0__1__Impl2559);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: rule__Field__Group_3_0_0__2 : rule__Field__Group_3_0_0__2__Impl ;
    public final void rule__Field__Group_3_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( rule__Field__Group_3_0_0__2__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:2: rule__Field__Group_3_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__2__Impl_in_rule__Field__Group_3_0_0__22589);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: rule__Field__Group_3_0_0__2__Impl : ( ';' ) ;
    public final void rule__Field__Group_3_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group_3_0_0__2__Impl2617); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: rule__Field__Group_3_0_1__0 : rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1 ;
    public final void rule__Field__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: ( rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:2: rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__0__Impl_in_rule__Field__Group_3_0_1__02654);
            rule__Field__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__1_in_rule__Field__Group_3_0_1__02657);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: rule__Field__Group_3_0_1__0__Impl : ( '[' ) ;
    public final void rule__Field__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( ( '[' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( '[' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( '[' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: '['
            {
             before(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group_3_0_1__0__Impl2685); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: rule__Field__Group_3_0_1__1 : rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2 ;
    public final void rule__Field__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: ( rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:2: rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__1__Impl_in_rule__Field__Group_3_0_1__12716);
            rule__Field__Group_3_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__2_in_rule__Field__Group_3_0_1__12719);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: rule__Field__Group_3_0_1__1__Impl : ( ( rule__Field__LowerAssignment_3_0_1_1 ) ) ;
    public final void rule__Field__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( ( ( rule__Field__LowerAssignment_3_0_1_1 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( ( rule__Field__LowerAssignment_3_0_1_1 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( ( rule__Field__LowerAssignment_3_0_1_1 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( rule__Field__LowerAssignment_3_0_1_1 )
            {
             before(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: ( rule__Field__LowerAssignment_3_0_1_1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:2: rule__Field__LowerAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Field__LowerAssignment_3_0_1_1_in_rule__Field__Group_3_0_1__1__Impl2746);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: rule__Field__Group_3_0_1__2 : rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3 ;
    public final void rule__Field__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: ( rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:2: rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__2__Impl_in_rule__Field__Group_3_0_1__22776);
            rule__Field__Group_3_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__3_in_rule__Field__Group_3_0_1__22779);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: rule__Field__Group_3_0_1__2__Impl : ( ',' ) ;
    public final void rule__Field__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ( ( ',' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ',' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ',' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_3_0_1__2__Impl2807); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: rule__Field__Group_3_0_1__3 : rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4 ;
    public final void rule__Field__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: ( rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:2: rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__3__Impl_in_rule__Field__Group_3_0_1__32838);
            rule__Field__Group_3_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__4_in_rule__Field__Group_3_0_1__32841);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__Field__Group_3_0_1__3__Impl : ( ( rule__Field__Alternatives_3_0_1_3 ) ) ;
    public final void rule__Field__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( ( rule__Field__Alternatives_3_0_1_3 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( rule__Field__Alternatives_3_0_1_3 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( rule__Field__Alternatives_3_0_1_3 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__Field__Alternatives_3_0_1_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: ( rule__Field__Alternatives_3_0_1_3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:2: rule__Field__Alternatives_3_0_1_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_0_1_3_in_rule__Field__Group_3_0_1__3__Impl2868);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: rule__Field__Group_3_0_1__4 : rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5 ;
    public final void rule__Field__Group_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:2: rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__4__Impl_in_rule__Field__Group_3_0_1__42898);
            rule__Field__Group_3_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__5_in_rule__Field__Group_3_0_1__42901);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: rule__Field__Group_3_0_1__4__Impl : ( ']' ) ;
    public final void rule__Field__Group_3_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( ']' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( ']' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( ']' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ']'
            {
             before(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group_3_0_1__4__Impl2929); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Field__Group_3_0_1__5 : rule__Field__Group_3_0_1__5__Impl ;
    public final void rule__Field__Group_3_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__Field__Group_3_0_1__5__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__Field__Group_3_0_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__5__Impl_in_rule__Field__Group_3_0_1__52960);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: rule__Field__Group_3_0_1__5__Impl : ( ';' ) ;
    public final void rule__Field__Group_3_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group_3_0_1__5__Impl2988); 
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


    // $ANTLR start "rule__ChampionChallengerPort__Group__0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: rule__ChampionChallengerPort__Group__0 : rule__ChampionChallengerPort__Group__0__Impl rule__ChampionChallengerPort__Group__1 ;
    public final void rule__ChampionChallengerPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( rule__ChampionChallengerPort__Group__0__Impl rule__ChampionChallengerPort__Group__1 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:2: rule__ChampionChallengerPort__Group__0__Impl rule__ChampionChallengerPort__Group__1
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__0__Impl_in_rule__ChampionChallengerPort__Group__03034);
            rule__ChampionChallengerPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__1_in_rule__ChampionChallengerPort__Group__03037);
            rule__ChampionChallengerPort__Group__1();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__0"


    // $ANTLR start "rule__ChampionChallengerPort__Group__0__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: rule__ChampionChallengerPort__Group__0__Impl : ( ( rule__ChampionChallengerPort__NameAssignment_0 ) ) ;
    public final void rule__ChampionChallengerPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: ( ( ( rule__ChampionChallengerPort__NameAssignment_0 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( ( rule__ChampionChallengerPort__NameAssignment_0 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( ( rule__ChampionChallengerPort__NameAssignment_0 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( rule__ChampionChallengerPort__NameAssignment_0 )
            {
             before(grammarAccess.getChampionChallengerPortAccess().getNameAssignment_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( rule__ChampionChallengerPort__NameAssignment_0 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:2: rule__ChampionChallengerPort__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__NameAssignment_0_in_rule__ChampionChallengerPort__Group__0__Impl3064);
            rule__ChampionChallengerPort__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChampionChallengerPortAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__0__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: rule__ChampionChallengerPort__Group__1 : rule__ChampionChallengerPort__Group__1__Impl rule__ChampionChallengerPort__Group__2 ;
    public final void rule__ChampionChallengerPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( rule__ChampionChallengerPort__Group__1__Impl rule__ChampionChallengerPort__Group__2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:2: rule__ChampionChallengerPort__Group__1__Impl rule__ChampionChallengerPort__Group__2
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__1__Impl_in_rule__ChampionChallengerPort__Group__13094);
            rule__ChampionChallengerPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__2_in_rule__ChampionChallengerPort__Group__13097);
            rule__ChampionChallengerPort__Group__2();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__1"


    // $ANTLR start "rule__ChampionChallengerPort__Group__1__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: rule__ChampionChallengerPort__Group__1__Impl : ( ':' ) ;
    public final void rule__ChampionChallengerPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ( ':' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( ':' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( ':' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ':'
            {
             before(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ChampionChallengerPort__Group__1__Impl3125); 
             after(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__1__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: rule__ChampionChallengerPort__Group__2 : rule__ChampionChallengerPort__Group__2__Impl rule__ChampionChallengerPort__Group__3 ;
    public final void rule__ChampionChallengerPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: ( rule__ChampionChallengerPort__Group__2__Impl rule__ChampionChallengerPort__Group__3 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:2: rule__ChampionChallengerPort__Group__2__Impl rule__ChampionChallengerPort__Group__3
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__2__Impl_in_rule__ChampionChallengerPort__Group__23156);
            rule__ChampionChallengerPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__3_in_rule__ChampionChallengerPort__Group__23159);
            rule__ChampionChallengerPort__Group__3();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__2"


    // $ANTLR start "rule__ChampionChallengerPort__Group__2__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: rule__ChampionChallengerPort__Group__2__Impl : ( ( rule__ChampionChallengerPort__TypeAssignment_2 ) ) ;
    public final void rule__ChampionChallengerPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( ( rule__ChampionChallengerPort__TypeAssignment_2 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( rule__ChampionChallengerPort__TypeAssignment_2 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( rule__ChampionChallengerPort__TypeAssignment_2 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( rule__ChampionChallengerPort__TypeAssignment_2 )
            {
             before(grammarAccess.getChampionChallengerPortAccess().getTypeAssignment_2()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( rule__ChampionChallengerPort__TypeAssignment_2 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:2: rule__ChampionChallengerPort__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__TypeAssignment_2_in_rule__ChampionChallengerPort__Group__2__Impl3186);
            rule__ChampionChallengerPort__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChampionChallengerPortAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__2__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__3"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: rule__ChampionChallengerPort__Group__3 : rule__ChampionChallengerPort__Group__3__Impl rule__ChampionChallengerPort__Group__4 ;
    public final void rule__ChampionChallengerPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: ( rule__ChampionChallengerPort__Group__3__Impl rule__ChampionChallengerPort__Group__4 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:2: rule__ChampionChallengerPort__Group__3__Impl rule__ChampionChallengerPort__Group__4
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__3__Impl_in_rule__ChampionChallengerPort__Group__33216);
            rule__ChampionChallengerPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__4_in_rule__ChampionChallengerPort__Group__33219);
            rule__ChampionChallengerPort__Group__4();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__3"


    // $ANTLR start "rule__ChampionChallengerPort__Group__3__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: rule__ChampionChallengerPort__Group__3__Impl : ( '{' ) ;
    public final void rule__ChampionChallengerPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( '{' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( '{' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( '{' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: '{'
            {
             before(grammarAccess.getChampionChallengerPortAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__ChampionChallengerPort__Group__3__Impl3247); 
             after(grammarAccess.getChampionChallengerPortAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__3__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__4"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: rule__ChampionChallengerPort__Group__4 : rule__ChampionChallengerPort__Group__4__Impl rule__ChampionChallengerPort__Group__5 ;
    public final void rule__ChampionChallengerPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( rule__ChampionChallengerPort__Group__4__Impl rule__ChampionChallengerPort__Group__5 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:2: rule__ChampionChallengerPort__Group__4__Impl rule__ChampionChallengerPort__Group__5
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__4__Impl_in_rule__ChampionChallengerPort__Group__43278);
            rule__ChampionChallengerPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__5_in_rule__ChampionChallengerPort__Group__43281);
            rule__ChampionChallengerPort__Group__5();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__4"


    // $ANTLR start "rule__ChampionChallengerPort__Group__4__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: rule__ChampionChallengerPort__Group__4__Impl : ( 'percentage' ) ;
    public final void rule__ChampionChallengerPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( ( 'percentage' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( 'percentage' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( 'percentage' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: 'percentage'
            {
             before(grammarAccess.getChampionChallengerPortAccess().getPercentageKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ChampionChallengerPort__Group__4__Impl3309); 
             after(grammarAccess.getChampionChallengerPortAccess().getPercentageKeyword_4()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__4__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__5"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: rule__ChampionChallengerPort__Group__5 : rule__ChampionChallengerPort__Group__5__Impl rule__ChampionChallengerPort__Group__6 ;
    public final void rule__ChampionChallengerPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( rule__ChampionChallengerPort__Group__5__Impl rule__ChampionChallengerPort__Group__6 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:2: rule__ChampionChallengerPort__Group__5__Impl rule__ChampionChallengerPort__Group__6
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__5__Impl_in_rule__ChampionChallengerPort__Group__53340);
            rule__ChampionChallengerPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__6_in_rule__ChampionChallengerPort__Group__53343);
            rule__ChampionChallengerPort__Group__6();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__5"


    // $ANTLR start "rule__ChampionChallengerPort__Group__5__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: rule__ChampionChallengerPort__Group__5__Impl : ( ':' ) ;
    public final void rule__ChampionChallengerPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( ':' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( ':' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( ':' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ':'
            {
             before(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__ChampionChallengerPort__Group__5__Impl3371); 
             after(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__5__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__6"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: rule__ChampionChallengerPort__Group__6 : rule__ChampionChallengerPort__Group__6__Impl rule__ChampionChallengerPort__Group__7 ;
    public final void rule__ChampionChallengerPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: ( rule__ChampionChallengerPort__Group__6__Impl rule__ChampionChallengerPort__Group__7 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:2: rule__ChampionChallengerPort__Group__6__Impl rule__ChampionChallengerPort__Group__7
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__6__Impl_in_rule__ChampionChallengerPort__Group__63402);
            rule__ChampionChallengerPort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__7_in_rule__ChampionChallengerPort__Group__63405);
            rule__ChampionChallengerPort__Group__7();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__6"


    // $ANTLR start "rule__ChampionChallengerPort__Group__6__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: rule__ChampionChallengerPort__Group__6__Impl : ( ( rule__ChampionChallengerPort__PercentageAssignment_6 ) ) ;
    public final void rule__ChampionChallengerPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( ( ( rule__ChampionChallengerPort__PercentageAssignment_6 ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( rule__ChampionChallengerPort__PercentageAssignment_6 ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( rule__ChampionChallengerPort__PercentageAssignment_6 ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( rule__ChampionChallengerPort__PercentageAssignment_6 )
            {
             before(grammarAccess.getChampionChallengerPortAccess().getPercentageAssignment_6()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( rule__ChampionChallengerPort__PercentageAssignment_6 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:2: rule__ChampionChallengerPort__PercentageAssignment_6
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__PercentageAssignment_6_in_rule__ChampionChallengerPort__Group__6__Impl3432);
            rule__ChampionChallengerPort__PercentageAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getChampionChallengerPortAccess().getPercentageAssignment_6()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__6__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__7"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: rule__ChampionChallengerPort__Group__7 : rule__ChampionChallengerPort__Group__7__Impl rule__ChampionChallengerPort__Group__8 ;
    public final void rule__ChampionChallengerPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: ( rule__ChampionChallengerPort__Group__7__Impl rule__ChampionChallengerPort__Group__8 )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:2: rule__ChampionChallengerPort__Group__7__Impl rule__ChampionChallengerPort__Group__8
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__7__Impl_in_rule__ChampionChallengerPort__Group__73462);
            rule__ChampionChallengerPort__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__8_in_rule__ChampionChallengerPort__Group__73465);
            rule__ChampionChallengerPort__Group__8();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__7"


    // $ANTLR start "rule__ChampionChallengerPort__Group__7__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__ChampionChallengerPort__Group__7__Impl : ( ';' ) ;
    public final void rule__ChampionChallengerPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( ';' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( ';' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( ';' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ';'
            {
             before(grammarAccess.getChampionChallengerPortAccess().getSemicolonKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__ChampionChallengerPort__Group__7__Impl3493); 
             after(grammarAccess.getChampionChallengerPortAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__7__Impl"


    // $ANTLR start "rule__ChampionChallengerPort__Group__8"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: rule__ChampionChallengerPort__Group__8 : rule__ChampionChallengerPort__Group__8__Impl ;
    public final void rule__ChampionChallengerPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: ( rule__ChampionChallengerPort__Group__8__Impl )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:2: rule__ChampionChallengerPort__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ChampionChallengerPort__Group__8__Impl_in_rule__ChampionChallengerPort__Group__83524);
            rule__ChampionChallengerPort__Group__8__Impl();

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__8"


    // $ANTLR start "rule__ChampionChallengerPort__Group__8__Impl"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: rule__ChampionChallengerPort__Group__8__Impl : ( '}' ) ;
    public final void rule__ChampionChallengerPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ( '}' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( '}' )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( '}' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: '}'
            {
             before(grammarAccess.getChampionChallengerPortAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__ChampionChallengerPort__Group__8__Impl3552); 
             after(grammarAccess.getChampionChallengerPortAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__Group__8__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: rule__Model__NameAssignment_1 : ( ruleMyID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ruleMyID
            {
             before(grammarAccess.getModelAccess().getNameMyIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__Model__NameAssignment_13606);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameMyIDParserRuleCall_1_0()); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__Model__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Model__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__DescriptionAssignment_3_13637); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: rule__Model__DataTypesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Model__DataTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: ( ( ruleEntity ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( ruleEntity )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( ruleEntity )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__DataTypesAssignment_43668);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: rule__Entity__NameAssignment_1 : ( ruleMyID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ruleMyID
            {
             before(grammarAccess.getEntityAccess().getNameMyIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__Entity__NameAssignment_13699);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameMyIDParserRuleCall_1_0()); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: rule__Entity__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_3_13730); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: ( ( ruleField ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( ruleField )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( ruleField )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_43761);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: rule__BuiltInType__NameAssignment_0 : ( ruleMyID ) ;
    public final void rule__BuiltInType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ruleMyID
            {
             before(grammarAccess.getBuiltInTypeAccess().getNameMyIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__BuiltInType__NameAssignment_03792);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getBuiltInTypeAccess().getNameMyIDParserRuleCall_0_0()); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: rule__BuiltInType__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BuiltInType__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: RULE_STRING
            {
             before(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BuiltInType__DescriptionAssignment_13823); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: rule__Field__NameAssignment_0 : ( ruleMyID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ruleMyID
            {
             before(grammarAccess.getFieldAccess().getNameMyIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__Field__NameAssignment_03854);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameMyIDParserRuleCall_0_0()); 

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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: rule__Field__TypeAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ( ( ( ruleFQN ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ( ( ruleFQN ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ( ( ruleFQN ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ruleFQN )
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( ruleFQN )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ruleFQN
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Field__TypeAssignment_23889);
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: rule__Field__DescriptionAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Field__DescriptionAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: ( ( RULE_STRING ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( RULE_STRING )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( RULE_STRING )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__DescriptionAssignment_3_0_0_13924); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: rule__Field__LowerAssignment_3_0_1_1 : ( RULE_INT ) ;
    public final void rule__Field__LowerAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( ( RULE_INT ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( RULE_INT )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( RULE_INT )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__LowerAssignment_3_0_1_13955); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 : ( ( '*' ) ) ;
    public final void rule__Field__UpperUnlimitedAssignment_3_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( ( ( '*' ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( ( '*' ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( ( '*' ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( '*' )
            {
             before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( '*' )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: '*'
            {
             before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 
            match(input,25,FOLLOW_25_in_rule__Field__UpperUnlimitedAssignment_3_0_1_3_03991); 
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
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: rule__Field__UpperAssignment_3_0_1_3_1 : ( RULE_INT ) ;
    public final void rule__Field__UpperAssignment_3_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( ( RULE_INT ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( RULE_INT )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( RULE_INT )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__UpperAssignment_3_0_1_3_14030); 
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


    // $ANTLR start "rule__ChampionChallengerPort__NameAssignment_0"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: rule__ChampionChallengerPort__NameAssignment_0 : ( ruleMyID ) ;
    public final void rule__ChampionChallengerPort__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( ( ruleMyID ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ruleMyID )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ruleMyID )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ruleMyID
            {
             before(grammarAccess.getChampionChallengerPortAccess().getNameMyIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMyID_in_rule__ChampionChallengerPort__NameAssignment_04065);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getChampionChallengerPortAccess().getNameMyIDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__NameAssignment_0"


    // $ANTLR start "rule__ChampionChallengerPort__TypeAssignment_2"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: rule__ChampionChallengerPort__TypeAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ChampionChallengerPort__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ( ( ruleFQN ) ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( ( ruleFQN ) )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( ( ruleFQN ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: ( ruleFQN )
            {
             before(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeCrossReference_2_0()); 
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: ( ruleFQN )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ruleFQN
            {
             before(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ChampionChallengerPort__TypeAssignment_24100);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__TypeAssignment_2"


    // $ANTLR start "rule__ChampionChallengerPort__PercentageAssignment_6"
    // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: rule__ChampionChallengerPort__PercentageAssignment_6 : ( RULE_INT ) ;
    public final void rule__ChampionChallengerPort__PercentageAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( ( RULE_INT ) )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( RULE_INT )
            {
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( RULE_INT )
            // ../com.pellcorp.mydsl.ui/src-gen/com/pellcorp/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: RULE_INT
            {
             before(grammarAccess.getChampionChallengerPortAccess().getPercentageINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChampionChallengerPort__PercentageAssignment_64135); 
             after(grammarAccess.getChampionChallengerPortAccess().getPercentageINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__ChampionChallengerPort__PercentageAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_entryRuleMyID121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyID128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Alternatives_in_ruleMyID154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__0_in_ruleBuiltInType336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChampionChallengerPort_in_entryRuleChampionChallengerPort425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChampionChallengerPort432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__0_in_ruleChampionChallengerPort458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MyID__Alternatives494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MyID__Alternatives512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MyID__Alternatives532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__0_in_rule__Field__Alternatives_3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Alternatives_3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UpperUnlimitedAssignment_3_0_1_3_0_in_rule__Field__Alternatives_3_0_1_3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UpperAssignment_3_0_1_3_1_in_rule__Field__Alternatives_3_0_1_3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0669 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__0__Impl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1731 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2791 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__2__Impl822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3853 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DataTypesAssignment_4_in_rule__Model__Group__4__Impl941 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__0982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__0985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_3__0__Impl1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_3_1_in_rule__Model__Group_3__1__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_3__2__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01169 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__FQN__Group__0__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1255 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01290 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FQN__Group_1__0__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__FQN__Group_1__1__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01412 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__0__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11474 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21534 = new BitSet(new long[]{0x0000000000126010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__2__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31596 = new BitSet(new long[]{0x0000000000126010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41657 = new BitSet(new long[]{0x0000000000126010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_4_in_rule__Entity__Group__4__Impl1687 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__5__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group_3__0__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11851 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_3_1_in_rule__Entity__Group_3__1__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__21911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group_3__2__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__0__Impl_in_rule__BuiltInType__Group__01976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__1_in_rule__BuiltInType__Group__01979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__NameAssignment_0_in_rule__BuiltInType__Group__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__1__Impl_in_rule__BuiltInType__Group__12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__DescriptionAssignment_1_in_rule__BuiltInType__Group__1__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12157 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group__1__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22219 = new BitSet(new long[]{0x0000000000428000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__0__Impl_in_rule__Field__Group_3_0__02344 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__1_in_rule__Field__Group_3_0__02347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__0_in_rule__Field__Group_3_0__0__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__1__Impl_in_rule__Field__Group_3_0__12405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__0_in_rule__Field__Group_3_0__1__Impl2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__0__Impl_in_rule__Field__Group_3_0_0__02467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__1_in_rule__Field__Group_3_0_0__02470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Field__Group_3_0_0__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__1__Impl_in_rule__Field__Group_3_0_0__12529 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__2_in_rule__Field__Group_3_0_0__12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DescriptionAssignment_3_0_0_1_in_rule__Field__Group_3_0_0__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__2__Impl_in_rule__Field__Group_3_0_0__22589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group_3_0_0__2__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__0__Impl_in_rule__Field__Group_3_0_1__02654 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__1_in_rule__Field__Group_3_0_1__02657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group_3_0_1__0__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__1__Impl_in_rule__Field__Group_3_0_1__12716 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__2_in_rule__Field__Group_3_0_1__12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LowerAssignment_3_0_1_1_in_rule__Field__Group_3_0_1__1__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__2__Impl_in_rule__Field__Group_3_0_1__22776 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__3_in_rule__Field__Group_3_0_1__22779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_3_0_1__2__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__3__Impl_in_rule__Field__Group_3_0_1__32838 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__4_in_rule__Field__Group_3_0_1__32841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_0_1_3_in_rule__Field__Group_3_0_1__3__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__4__Impl_in_rule__Field__Group_3_0_1__42898 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__5_in_rule__Field__Group_3_0_1__42901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group_3_0_1__4__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__5__Impl_in_rule__Field__Group_3_0_1__52960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group_3_0_1__5__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__0__Impl_in_rule__ChampionChallengerPort__Group__03034 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__1_in_rule__ChampionChallengerPort__Group__03037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__NameAssignment_0_in_rule__ChampionChallengerPort__Group__0__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__1__Impl_in_rule__ChampionChallengerPort__Group__13094 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__2_in_rule__ChampionChallengerPort__Group__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ChampionChallengerPort__Group__1__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__2__Impl_in_rule__ChampionChallengerPort__Group__23156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__3_in_rule__ChampionChallengerPort__Group__23159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__TypeAssignment_2_in_rule__ChampionChallengerPort__Group__2__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__3__Impl_in_rule__ChampionChallengerPort__Group__33216 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__4_in_rule__ChampionChallengerPort__Group__33219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ChampionChallengerPort__Group__3__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__4__Impl_in_rule__ChampionChallengerPort__Group__43278 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__5_in_rule__ChampionChallengerPort__Group__43281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChampionChallengerPort__Group__4__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__5__Impl_in_rule__ChampionChallengerPort__Group__53340 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__6_in_rule__ChampionChallengerPort__Group__53343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ChampionChallengerPort__Group__5__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__6__Impl_in_rule__ChampionChallengerPort__Group__63402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__7_in_rule__ChampionChallengerPort__Group__63405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__PercentageAssignment_6_in_rule__ChampionChallengerPort__Group__6__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__7__Impl_in_rule__ChampionChallengerPort__Group__73462 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__8_in_rule__ChampionChallengerPort__Group__73465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ChampionChallengerPort__Group__7__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChampionChallengerPort__Group__8__Impl_in_rule__ChampionChallengerPort__Group__83524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ChampionChallengerPort__Group__8__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__Model__NameAssignment_13606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__DescriptionAssignment_3_13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__DataTypesAssignment_43668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__Entity__NameAssignment_13699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_3_13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_43761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__BuiltInType__NameAssignment_03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BuiltInType__DescriptionAssignment_13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__Field__NameAssignment_03854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Field__TypeAssignment_23889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__DescriptionAssignment_3_0_0_13924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__LowerAssignment_3_0_1_13955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__UpperUnlimitedAssignment_3_0_1_3_03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__UpperAssignment_3_0_1_3_14030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__ChampionChallengerPort__NameAssignment_04065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ChampionChallengerPort__TypeAssignment_24100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChampionChallengerPort__PercentageAssignment_64135 = new BitSet(new long[]{0x0000000000000002L});

}