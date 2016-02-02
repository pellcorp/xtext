package com.pellcorp.mydsl.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

public class MyDslTransientValueService extends DefaultTransientValueService {
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		boolean isTransient = super.isTransient(owner, feature, index);

		if (!isTransient) {
			if (feature.getName().equals("builtInTypes") 
					|| feature.getName().equals("hiddenBuiltInTypes")
					|| feature.getName().equals("builtInFunctions")) {
				return true;
			}
		}
		
		return isTransient;
	}
}
