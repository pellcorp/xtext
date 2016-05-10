package com.pellcorp.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.pellcorp.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'workspace'", "';'", "'description'", "'percentage'", "'entity'", "'.'", "'{'", "'}'", "':'", "'['", "','", "'*'", "']'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DECIMAL=8;
    public static final int RULE_DATE=7;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        EObject lv_dataTypes_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getWorkspaceKeyword_0());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:106:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModel169); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:110:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:112:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel186); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleModel203); 

                        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:132:3: ( (lv_dataTypes_6_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_dataTypes_6_0= ruleEntity )
            	    {
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_dataTypes_6_0= ruleEntity )
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:134:3: lv_dataTypes_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel226);
            	    lv_dataTypes_6_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataTypes",
            	            		lv_dataTypes_6_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMyID"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:158:1: entryRuleMyID returns [String current=null] : iv_ruleMyID= ruleMyID EOF ;
    public final String entryRuleMyID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMyID = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:159:2: (iv_ruleMyID= ruleMyID EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:160:2: iv_ruleMyID= ruleMyID EOF
            {
             newCompositeNode(grammarAccess.getMyIDRule()); 
            pushFollow(FOLLOW_ruleMyID_in_entryRuleMyID264);
            iv_ruleMyID=ruleMyID();

            state._fsp--;

             current =iv_ruleMyID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyID275); 

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
    // $ANTLR end "entryRuleMyID"


    // $ANTLR start "ruleMyID"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:167:1: ruleMyID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'percentage' | kw= 'entity' ) ;
    public final AntlrDatatypeRuleToken ruleMyID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:170:28: ( (this_ID_0= RULE_ID | kw= 'percentage' | kw= 'entity' ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (this_ID_0= RULE_ID | kw= 'percentage' | kw= 'entity' )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (this_ID_0= RULE_ID | kw= 'percentage' | kw= 'entity' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:171:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMyID315); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:180:2: kw= 'percentage'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleMyID339); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMyIDAccess().getPercentageKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:187:2: kw= 'entity'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleMyID358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMyIDAccess().getEntityKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleFQN"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:200:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:201:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:202:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN399);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN410); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:209:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MyID_0= ruleMyID (kw= '.' this_MyID_2= ruleMyID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MyID_0 = null;

        AntlrDatatypeRuleToken this_MyID_2 = null;


         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:212:28: ( (this_MyID_0= ruleMyID (kw= '.' this_MyID_2= ruleMyID )* ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:213:1: (this_MyID_0= ruleMyID (kw= '.' this_MyID_2= ruleMyID )* )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:213:1: (this_MyID_0= ruleMyID (kw= '.' this_MyID_2= ruleMyID )* )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:214:5: this_MyID_0= ruleMyID (kw= '.' this_MyID_2= ruleMyID )*
            {
             
                    newCompositeNode(grammarAccess.getFQNAccess().getMyIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMyID_in_ruleFQN457);
            this_MyID_0=ruleMyID();

            state._fsp--;


            		current.merge(this_MyID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:224:1: (kw= '.' this_MyID_2= ruleMyID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:225:2: kw= '.' this_MyID_2= ruleMyID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleFQN476); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFQNAccess().getMyIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleMyID_in_ruleFQN498);
            	    this_MyID_2=ruleMyID();

            	    state._fsp--;


            	    		current.merge(this_MyID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:251:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:252:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:253:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity547);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity557); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:260:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= ruleMyID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fields_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:263:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= ruleMyID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:264:1: (otherlv_0= 'entity' ( (lv_name_1_0= ruleMyID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:264:1: (otherlv_0= 'entity' ( (lv_name_1_0= ruleMyID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:264:3: otherlv_0= 'entity' ( (lv_name_1_0= ruleMyID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEntity594); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:268:1: ( (lv_name_1_0= ruleMyID ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:269:1: (lv_name_1_0= ruleMyID )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:269:1: (lv_name_1_0= ruleMyID )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:270:3: lv_name_1_0= ruleMyID
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameMyIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMyID_in_ruleEntity615);
            lv_name_1_0=ruleMyID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"MyID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEntity627); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:290:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntity640); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getDescriptionKeyword_3_0());
                        
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:294:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:295:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:295:1: (lv_description_4_0= RULE_STRING )
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:296:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity657); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity674); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:316:3: ( (lv_fields_6_0= ruleField ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:317:1: (lv_fields_6_0= ruleField )
            	    {
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:317:1: (lv_fields_6_0= ruleField )
            	    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:318:3: lv_fields_6_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleEntity697);
            	    lv_fields_6_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_6_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEntity710); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleBuiltInType"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: entryRuleBuiltInType returns [EObject current=null] : iv_ruleBuiltInType= ruleBuiltInType EOF ;
    public final EObject entryRuleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInType = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:347:2: (iv_ruleBuiltInType= ruleBuiltInType EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:348:2: iv_ruleBuiltInType= ruleBuiltInType EOF
            {
             newCompositeNode(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType746);
            iv_ruleBuiltInType=ruleBuiltInType();

            state._fsp--;

             current =iv_ruleBuiltInType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType756); 

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
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:355:1: ruleBuiltInType returns [EObject current=null] : ( ( (lv_name_0_0= ruleMyID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBuiltInType() throws RecognitionException {
        EObject current = null;

        Token lv_description_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:358:28: ( ( ( (lv_name_0_0= ruleMyID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: ( ( (lv_name_0_0= ruleMyID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: ( ( (lv_name_0_0= ruleMyID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:359:2: ( (lv_name_0_0= ruleMyID ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:359:2: ( (lv_name_0_0= ruleMyID ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: (lv_name_0_0= ruleMyID )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: (lv_name_0_0= ruleMyID )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:361:3: lv_name_0_0= ruleMyID
            {
             
            	        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getNameMyIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMyID_in_ruleBuiltInType802);
            lv_name_0_0=ruleMyID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBuiltInTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"MyID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:377:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_description_1_0= RULE_STRING )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_description_1_0= RULE_STRING )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:379:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBuiltInType819); 

            			newLeafNode(lv_description_1_0, grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBuiltInTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleField"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:403:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:404:2: (iv_ruleField= ruleField EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:405:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField860);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField870); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:412:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_lower_7_0=null;
        Token otherlv_8=null;
        Token lv_upperUnlimited_9_0=null;
        Token lv_upper_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:415:28: ( ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:416:1: ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:416:1: ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:416:2: ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:416:2: ( (lv_name_0_0= ruleMyID ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:417:1: (lv_name_0_0= ruleMyID )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:417:1: (lv_name_0_0= ruleMyID )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:418:3: lv_name_0_0= ruleMyID
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getNameMyIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMyID_in_ruleField916);
            lv_name_0_0=ruleMyID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"MyID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleField928); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: ( ( ruleFQN ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:439:1: ( ruleFQN )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:439:1: ( ruleFQN )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:440:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleField951);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:453:2: ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EOF||LA10_0==RULE_ID||(LA10_0>=15 && LA10_0<=17)||LA10_0==20||LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:453:3: ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? )
                    {
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:453:3: ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? )
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:453:4: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )?
                    {
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:453:4: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:453:6: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleField966); 

                                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0());
                                
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:457:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_description_4_0= RULE_STRING )
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:459:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField983); 

                            			newLeafNode(lv_description_4_0, grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFieldRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_4_0, 
                                    		"STRING");
                            	    

                            }


                            }

                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleField1000); 

                                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2());
                                

                            }
                            break;

                    }

                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:479:3: (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:479:5: otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';'
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleField1015); 

                                	newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0());
                                
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: ( (lv_lower_7_0= RULE_INT ) )
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:484:1: (lv_lower_7_0= RULE_INT )
                            {
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:484:1: (lv_lower_7_0= RULE_INT )
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:485:3: lv_lower_7_0= RULE_INT
                            {
                            lv_lower_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1032); 

                            			newLeafNode(lv_lower_7_0, grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFieldRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lower",
                                    		lv_lower_7_0, 
                                    		"INT");
                            	    

                            }


                            }

                            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleField1049); 

                                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2());
                                
                            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) )
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==24) ) {
                                alt8=1;
                            }
                            else if ( (LA8_0==RULE_INT) ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:505:2: ( (lv_upperUnlimited_9_0= '*' ) )
                                    {
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:505:2: ( (lv_upperUnlimited_9_0= '*' ) )
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (lv_upperUnlimited_9_0= '*' )
                                    {
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (lv_upperUnlimited_9_0= '*' )
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:507:3: lv_upperUnlimited_9_0= '*'
                                    {
                                    lv_upperUnlimited_9_0=(Token)match(input,24,FOLLOW_24_in_ruleField1068); 

                                            newLeafNode(lv_upperUnlimited_9_0, grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getFieldRule());
                                    	        }
                                           		setWithLastConsumed(current, "upperUnlimited", true, "*");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:521:6: ( (lv_upper_10_0= RULE_INT ) )
                                    {
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:521:6: ( (lv_upper_10_0= RULE_INT ) )
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: (lv_upper_10_0= RULE_INT )
                                    {
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: (lv_upper_10_0= RULE_INT )
                                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:523:3: lv_upper_10_0= RULE_INT
                                    {
                                    lv_upper_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1104); 

                                    			newLeafNode(lv_upper_10_0, grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getFieldRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"upper",
                                            		lv_upper_10_0, 
                                            		"INT");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleField1122); 

                                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4());
                                
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleField1134); 

                                	newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:548:7: otherlv_13= ';'
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleField1155); 

                        	newLeafNode(otherlv_13, grammarAccess.getFieldAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleChampionChallengerPort"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: entryRuleChampionChallengerPort returns [EObject current=null] : iv_ruleChampionChallengerPort= ruleChampionChallengerPort EOF ;
    public final EObject entryRuleChampionChallengerPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChampionChallengerPort = null;


        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:563:2: (iv_ruleChampionChallengerPort= ruleChampionChallengerPort EOF )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:564:2: iv_ruleChampionChallengerPort= ruleChampionChallengerPort EOF
            {
             newCompositeNode(grammarAccess.getChampionChallengerPortRule()); 
            pushFollow(FOLLOW_ruleChampionChallengerPort_in_entryRuleChampionChallengerPort1194);
            iv_ruleChampionChallengerPort=ruleChampionChallengerPort();

            state._fsp--;

             current =iv_ruleChampionChallengerPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChampionChallengerPort1204); 

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
    // $ANTLR end "entryRuleChampionChallengerPort"


    // $ANTLR start "ruleChampionChallengerPort"
    // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:571:1: ruleChampionChallengerPort returns [EObject current=null] : ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= 'percentage' otherlv_5= ':' ( (lv_percentage_6_0= RULE_INT ) ) otherlv_7= ';' otherlv_8= '}' ) ;
    public final EObject ruleChampionChallengerPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_percentage_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:574:28: ( ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= 'percentage' otherlv_5= ':' ( (lv_percentage_6_0= RULE_INT ) ) otherlv_7= ';' otherlv_8= '}' ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:575:1: ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= 'percentage' otherlv_5= ':' ( (lv_percentage_6_0= RULE_INT ) ) otherlv_7= ';' otherlv_8= '}' )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:575:1: ( ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= 'percentage' otherlv_5= ':' ( (lv_percentage_6_0= RULE_INT ) ) otherlv_7= ';' otherlv_8= '}' )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:575:2: ( (lv_name_0_0= ruleMyID ) ) otherlv_1= ':' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= 'percentage' otherlv_5= ':' ( (lv_percentage_6_0= RULE_INT ) ) otherlv_7= ';' otherlv_8= '}'
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:575:2: ( (lv_name_0_0= ruleMyID ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: (lv_name_0_0= ruleMyID )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: (lv_name_0_0= ruleMyID )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:577:3: lv_name_0_0= ruleMyID
            {
             
            	        newCompositeNode(grammarAccess.getChampionChallengerPortAccess().getNameMyIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMyID_in_ruleChampionChallengerPort1250);
            lv_name_0_0=ruleMyID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChampionChallengerPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"MyID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleChampionChallengerPort1262); 

                	newLeafNode(otherlv_1, grammarAccess.getChampionChallengerPortAccess().getColonKeyword_1());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:597:1: ( ( ruleFQN ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: ( ruleFQN )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: ( ruleFQN )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:599:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChampionChallengerPortRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleChampionChallengerPort1285);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleChampionChallengerPort1297); 

                	newLeafNode(otherlv_3, grammarAccess.getChampionChallengerPortAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleChampionChallengerPort1309); 

                	newLeafNode(otherlv_4, grammarAccess.getChampionChallengerPortAccess().getPercentageKeyword_4());
                
            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleChampionChallengerPort1321); 

                	newLeafNode(otherlv_5, grammarAccess.getChampionChallengerPortAccess().getColonKeyword_5());
                
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:624:1: ( (lv_percentage_6_0= RULE_INT ) )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:625:1: (lv_percentage_6_0= RULE_INT )
            {
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:625:1: (lv_percentage_6_0= RULE_INT )
            // ../com.pellcorp.mydsl/src-gen/com/pellcorp/mydsl/parser/antlr/internal/InternalMyDsl.g:626:3: lv_percentage_6_0= RULE_INT
            {
            lv_percentage_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleChampionChallengerPort1338); 

            			newLeafNode(lv_percentage_6_0, grammarAccess.getChampionChallengerPortAccess().getPercentageINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChampionChallengerPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"percentage",
                    		lv_percentage_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleChampionChallengerPort1355); 

                	newLeafNode(otherlv_7, grammarAccess.getChampionChallengerPortAccess().getSemicolonKeyword_7());
                
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleChampionChallengerPort1367); 

                	newLeafNode(otherlv_8, grammarAccess.getChampionChallengerPortAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChampionChallengerPort"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel156 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_15_in_ruleModel169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel186 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel203 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel226 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMyID_in_entryRuleMyID264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyID275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMyID315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMyID339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMyID358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleFQN457 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleFQN476 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleFQN498 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntity594 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleEntity615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEntity627 = new BitSet(new long[]{0x0000000000138010L});
    public static final BitSet FOLLOW_15_in_ruleEntity640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity657 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity674 = new BitSet(new long[]{0x0000000000130010L});
    public static final BitSet FOLLOW_ruleField_in_ruleEntity697 = new BitSet(new long[]{0x0000000000130010L});
    public static final BitSet FOLLOW_20_in_ruleEntity710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleBuiltInType802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBuiltInType819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleField916 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleField928 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleField951 = new BitSet(new long[]{0x000000000040C002L});
    public static final BitSet FOLLOW_15_in_ruleField966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1000 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleField1015 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1032 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleField1049 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_24_in_ruleField1068 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1104 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleField1122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleField1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChampionChallengerPort_in_entryRuleChampionChallengerPort1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChampionChallengerPort1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleChampionChallengerPort1250 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleChampionChallengerPort1262 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleChampionChallengerPort1285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChampionChallengerPort1297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleChampionChallengerPort1309 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleChampionChallengerPort1321 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleChampionChallengerPort1338 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleChampionChallengerPort1355 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleChampionChallengerPort1367 = new BitSet(new long[]{0x0000000000000002L});

}