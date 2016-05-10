/*
 * generated by Xtext
 */
package com.pellcorp.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.pellcorp.mydsl.myDsl.BuiltInType;
import com.pellcorp.mydsl.myDsl.ChampionChallenger;
import com.pellcorp.mydsl.myDsl.ChampionChallengerPort;
import com.pellcorp.mydsl.myDsl.Entity;
import com.pellcorp.mydsl.myDsl.Field;
import com.pellcorp.mydsl.myDsl.Model;
import com.pellcorp.mydsl.myDsl.MyDslPackage;
import com.pellcorp.mydsl.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.BUILT_IN_TYPE:
				sequence_BuiltInType(context, (BuiltInType) semanticObject); 
				return; 
			case MyDslPackage.CHAMPION_CHALLENGER:
				sequence_ChampionChallenger(context, (ChampionChallenger) semanticObject); 
				return; 
			case MyDslPackage.CHAMPION_CHALLENGER_PORT:
				sequence_ChampionChallengerPort(context, (ChampionChallengerPort) semanticObject); 
				return; 
			case MyDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case MyDslPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=MyID description=STRING)
	 */
	protected void sequence_BuiltInType(EObject context, BuiltInType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DATA_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DATA_TYPE__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DATA_TYPE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DATA_TYPE__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBuiltInTypeAccess().getNameMyIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=MyID type=[DataType|FQN] percentage=INT)
	 */
	protected void sequence_ChampionChallengerPort(EObject context, ChampionChallengerPort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT__TYPE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT__PERCENTAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT__PERCENTAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChampionChallengerPortAccess().getNameMyIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChampionChallengerPortAccess().getTypeDataTypeFQNParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getChampionChallengerPortAccess().getPercentageINTTerminalRuleCall_6_0(), semanticObject.getPercentage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=MyID description=STRING? championPort=ChampionChallengerPort challengerPorts+=ChampionChallengerPort*)
	 */
	protected void sequence_ChampionChallenger(EObject context, ChampionChallenger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MyID description=STRING? fields+=Field*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MyID type=[DataType|FQN] (description=STRING? (lower=INT (upperUnlimited?='*' | upper=INT))?)?)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? dataTypes+=Entity*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
