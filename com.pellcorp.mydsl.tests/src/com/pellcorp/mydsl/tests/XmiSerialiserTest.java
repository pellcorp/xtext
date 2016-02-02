package com.pellcorp.mydsl.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
		InputStream modelStream = XmiSerialiserTest.class.getResourceAsStream("/com/pellcorp/mydsl/tests/test.mydsl");
		
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		XtextResource resource = (XtextResource) rs.createResource(URI.createURI("dummy:/model.mydsl"));
		resource.load(modelStream, rs.getLoadOptions());
		
		Model model = (Model) resource.getContents().get(0);
		
		assertEquals(1, model.getDataTypes().size());
		
		Resource xmiResource = rs.createResource(URI.createURI("dummy:/test.xmi"));
		xmiResource.getContents().add(model);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		xmiResource.save(os, null);
		xmiResource.unload();
		resource.unload();
		
		Resource xmiResource2 = rs.createResource(URI.createURI("dummy:/test2.xmi"));
		
		// here is where I get Unresolved reference '//@builtInTypes.0'
		xmiResource2.load(new ByteArrayInputStream(os.toByteArray()), rs.getLoadOptions());
	}
	
	
}
