package com.pellcorp.mydsl.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.ValueSerializer;

@SuppressWarnings("restriction")
public class MyDslValueSerializer extends ValueSerializer {
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, INode node, Acceptor errors) {
		String s = super.serializeAssignedValue(context, ruleCall, value, node, errors);
		return s;
	}
}
