package com.pellcorp.mydsl.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.ValueSerializer;

@SuppressWarnings("restriction")
public class MyDslValueSerializer extends ValueSerializer {
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, INode node, Acceptor errors) {
		String name = ruleCall.getRule().getName();
		if ("MyID".equals(name)) {
			String s = super.serializeAssignedValue(context, ruleCall, value, null, errors);
			return s;
		} else {
			return super.serializeAssignedValue(context, ruleCall, value, node, errors);
		}
	}
}
