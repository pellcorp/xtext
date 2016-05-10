/*
 * generated by Xtext
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.pellcorp.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMyID
entryRuleMyID 
:
{ before(grammarAccess.getMyIDRule()); }
	 ruleMyID
{ after(grammarAccess.getMyIDRule()); } 
	 EOF 
;

// Rule MyID
ruleMyID
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMyIDAccess().getAlternatives()); }
(rule__MyID__Alternatives)
{ after(grammarAccess.getMyIDAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFQN
entryRuleFQN 
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFQNAccess().getGroup()); }
(rule__FQN__Group__0)
{ after(grammarAccess.getFQNAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleEntity
entryRuleEntity 
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityAccess().getGroup()); }
(rule__Entity__Group__0)
{ after(grammarAccess.getEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBuiltInType
entryRuleBuiltInType 
:
{ before(grammarAccess.getBuiltInTypeRule()); }
	 ruleBuiltInType
{ after(grammarAccess.getBuiltInTypeRule()); } 
	 EOF 
;

// Rule BuiltInType
ruleBuiltInType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBuiltInTypeAccess().getGroup()); }
(rule__BuiltInType__Group__0)
{ after(grammarAccess.getBuiltInTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleField
entryRuleField 
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldAccess().getGroup()); }
(rule__Field__Group__0)
{ after(grammarAccess.getFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleChampionChallengerPort
entryRuleChampionChallengerPort 
:
{ before(grammarAccess.getChampionChallengerPortRule()); }
	 ruleChampionChallengerPort
{ after(grammarAccess.getChampionChallengerPortRule()); } 
	 EOF 
;

// Rule ChampionChallengerPort
ruleChampionChallengerPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getGroup()); }
(rule__ChampionChallengerPort__Group__0)
{ after(grammarAccess.getChampionChallengerPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__MyID__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMyIDAccess().getPercentageKeyword_1()); }

	'percentage' 

{ after(grammarAccess.getMyIDAccess().getPercentageKeyword_1()); }
)

    |(
{ before(grammarAccess.getMyIDAccess().getEntityKeyword_2()); }

	'entity' 

{ after(grammarAccess.getMyIDAccess().getEntityKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Alternatives_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getGroup_3_0()); }
(rule__Field__Group_3_0__0)
{ after(grammarAccess.getFieldAccess().getGroup_3_0()); }
)

    |(
{ before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); }

	';' 

{ after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Alternatives_3_0_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); }
(rule__Field__UpperUnlimitedAssignment_3_0_1_3_0)
{ after(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); }
)

    |(
{ before(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); }
(rule__Field__UpperAssignment_3_0_1_3_1)
{ after(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); }

	'workspace' 

{ after(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
(rule__Model__NameAssignment_1)
{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getModelAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGroup_3()); }
(rule__Model__Group_3__0)?
{ after(grammarAccess.getModelAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDataTypesAssignment_4()); }
(rule__Model__DataTypesAssignment_4)*
{ after(grammarAccess.getModelAccess().getDataTypesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Model__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_3__0__Impl
	rule__Model__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); }

	'description' 

{ after(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_3__1__Impl
	rule__Model__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); }
(rule__Model__DescriptionAssignment_3_1)
{ after(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__FQN__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getMyIDParserRuleCall_0()); }
	ruleMyID
{ after(grammarAccess.getFQNAccess().getMyIDParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getGroup_1()); }
(rule__FQN__Group_1__0)*
{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FQN__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getMyIDParserRuleCall_1_1()); }
	ruleMyID
{ after(grammarAccess.getFQNAccess().getMyIDParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }

	'entity' 

{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
(rule__Entity__NameAssignment_1)
{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_3()); }
(rule__Entity__Group_3__0)?
{ after(grammarAccess.getEntityAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); }
(rule__Entity__FieldsAssignment_4)*
{ after(grammarAccess.getEntityAccess().getFieldsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Entity__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_3__0__Impl
	rule__Entity__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); }

	'description' 

{ after(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_3__1__Impl
	rule__Entity__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); }
(rule__Entity__DescriptionAssignment_3_1)
{ after(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__BuiltInType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BuiltInType__Group__0__Impl
	rule__BuiltInType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltInType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); }
(rule__BuiltInType__NameAssignment_0)
{ after(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BuiltInType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BuiltInType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltInType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); }
(rule__BuiltInType__DescriptionAssignment_1)
{ after(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Field__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getNameAssignment_0()); }
(rule__Field__NameAssignment_0)
{ after(grammarAccess.getFieldAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__1__Impl
	rule__Field__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getFieldAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__2__Impl
	rule__Field__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypeAssignment_2()); }
(rule__Field__TypeAssignment_2)
{ after(grammarAccess.getFieldAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getAlternatives_3()); }
(rule__Field__Alternatives_3)
{ after(grammarAccess.getFieldAccess().getAlternatives_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Field__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0__0__Impl
	rule__Field__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getGroup_3_0_0()); }
(rule__Field__Group_3_0_0__0)?
{ after(grammarAccess.getFieldAccess().getGroup_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getGroup_3_0_1()); }
(rule__Field__Group_3_0_1__0)?
{ after(grammarAccess.getFieldAccess().getGroup_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Field__Group_3_0_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_0__0__Impl
	rule__Field__Group_3_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); }

	'description' 

{ after(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_0__1__Impl
	rule__Field__Group_3_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); }
(rule__Field__DescriptionAssignment_3_0_0_1)
{ after(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); }

	';' 

{ after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Field__Group_3_0_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_1__0__Impl
	rule__Field__Group_3_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); }

	'[' 

{ after(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_1__1__Impl
	rule__Field__Group_3_0_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); }
(rule__Field__LowerAssignment_3_0_1_1)
{ after(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_1__2__Impl
	rule__Field__Group_3_0_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); }

	',' 

{ after(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_1__3__Impl
	rule__Field__Group_3_0_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); }
(rule__Field__Alternatives_3_0_1_3)
{ after(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_1__4__Impl
	rule__Field__Group_3_0_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); }

	']' 

{ after(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_3_0_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_3_0_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_3_0_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); }

	';' 

{ after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}

















rule__ChampionChallengerPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__0__Impl
	rule__ChampionChallengerPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getNameAssignment_0()); }
(rule__ChampionChallengerPort__NameAssignment_0)
{ after(grammarAccess.getChampionChallengerPortAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__1__Impl
	rule__ChampionChallengerPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__2__Impl
	rule__ChampionChallengerPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getTypeAssignment_2()); }
(rule__ChampionChallengerPort__TypeAssignment_2)
{ after(grammarAccess.getChampionChallengerPortAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__3__Impl
	rule__ChampionChallengerPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getChampionChallengerPortAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__4__Impl
	rule__ChampionChallengerPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getPercentageKeyword_4()); }

	'percentage' 

{ after(grammarAccess.getChampionChallengerPortAccess().getPercentageKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__5__Impl
	rule__ChampionChallengerPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_5()); }

	':' 

{ after(grammarAccess.getChampionChallengerPortAccess().getColonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__6__Impl
	rule__ChampionChallengerPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getPercentageAssignment_6()); }
(rule__ChampionChallengerPort__PercentageAssignment_6)
{ after(grammarAccess.getChampionChallengerPortAccess().getPercentageAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__7__Impl
	rule__ChampionChallengerPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getChampionChallengerPortAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChampionChallengerPort__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChampionChallengerPort__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getChampionChallengerPortAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}





















rule__Model__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameMyIDParserRuleCall_1_0()); }
	ruleMyID{ after(grammarAccess.getModelAccess().getNameMyIDParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__DescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__DataTypesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); }
	ruleEntity{ after(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameMyIDParserRuleCall_1_0()); }
	ruleMyID{ after(grammarAccess.getEntityAccess().getNameMyIDParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__DescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FieldsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); }
	ruleField{ after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltInType__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltInTypeAccess().getNameMyIDParserRuleCall_0_0()); }
	ruleMyID{ after(grammarAccess.getBuiltInTypeAccess().getNameMyIDParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltInType__DescriptionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getNameMyIDParserRuleCall_0_0()); }
	ruleMyID{ after(grammarAccess.getFieldAccess().getNameMyIDParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__DescriptionAssignment_3_0_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__LowerAssignment_3_0_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); }
	RULE_INT{ after(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__UpperUnlimitedAssignment_3_0_1_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); }
(
{ before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); }

	'*' 

{ after(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); }
)

{ after(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__UpperAssignment_3_0_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); }
	RULE_INT{ after(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}





rule__ChampionChallengerPort__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getNameMyIDParserRuleCall_0_0()); }
	ruleMyID{ after(grammarAccess.getChampionChallengerPortAccess().getNameMyIDParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); }
	ruleFQN{ after(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ChampionChallengerPort__PercentageAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChampionChallengerPortAccess().getPercentageINTTerminalRuleCall_6_0()); }
	RULE_INT{ after(grammarAccess.getChampionChallengerPortAccess().getPercentageINTTerminalRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_DATE : '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9';

RULE_INT : '-'? ('0'..'9')+;

RULE_DECIMAL : '-'? ('0'..'9')+ '.' ('0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


