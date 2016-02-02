package com.pellcorp.mydsl.tests;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.pellcorp.mydsl.MyDslInjectorProvider;
import com.pellcorp.mydsl.myDsl.Model;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
public class XmiSerialiserTest extends Assert {
	@Inject
	Injector injector;
	
	@Test
	public void loadMyDsl() throws Exception {
		InputStream modelStream = XmiSerialiserTest.class.getResourceAsStream("/com/pellcorp/mydsl/tests/test_1000_entities_with_3_fields_each.mydsl");
		
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		XtextResource resource = (XtextResource) rs.createResource(URI.createURI("dummy:/model.mydsl"));
		resource.load(modelStream, rs.getLoadOptions());
		
		Model model = (Model) resource.getContents().get(0);
		//resource.unload();
		
		assertEquals(1000, model.getDataTypes().size());
		
		Resource xmiResource = rs.createResource(URI.createFileURI("/tmp/test.xmi"));
		xmiResource.getContents().add(model);
		xmiResource.save(null);
		xmiResource.unload();
		
		
	}
	
}
