package com.pellcorp.mydsl.linker;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import com.pellcorp.mydsl.builtInTypes.BuiltInTypes;
import com.pellcorp.mydsl.myDsl.Model;

public class MyDslLazyLinker extends LazyLinker {
	@Override
	protected void doLinkModel(EObject model, IDiagnosticConsumer consumer) {
		if (model instanceof Model) {
			doLink((Model) model);
		}

		super.doLinkModel(model, consumer);
	}

	public void doLink(Model model) {
		BuiltInTypes.ensureBuiltInTypes(model);
	}
	
	/**
	 * required so that the linker still works.
	 */
	@Override
	public boolean isClearAllReferencesRequired(Resource resource) {
		return false;
	}
}
