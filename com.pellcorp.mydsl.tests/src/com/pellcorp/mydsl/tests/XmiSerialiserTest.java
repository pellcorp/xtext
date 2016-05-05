package com.pellcorp.mydsl.tests;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
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
		Model model = loadModel("/com/pellcorp/mydsl/tests/test.mydsl");
		
		System.out.println(toString(model));
	}
	
	private Model loadModel(String path) throws Exception {
		InputStream modelStream = XmiSerialiserTest.class.getResourceAsStream("/com/pellcorp/mydsl/tests/test.mydsl");
		
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		XtextResource resource = (XtextResource) rs.createResource(URI.createURI("dummy:/model.mydsl"));
		resource.load(modelStream, rs.getLoadOptions());
		
		if (resource.getParseResult().hasSyntaxErrors()) {
			throw new IllegalArgumentException(toString(resource.getParseResult()));
		}
		
		Model model = (Model) resource.getContents().get(0);
		
		return model;
	}
	
	private String toString(Model model) throws IOException {
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		Resource xmiResource = rs.createResource(URI.createURI("dummy:/model2.mydsl"));
		xmiResource.getContents().add(model);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		xmiResource.save(os, null);
		xmiResource.unload();
		return new String(os.toByteArray(), "UTF-8");
	}
	
	private String toString(IParseResult parseResult) {
		StringBuilder builder = new StringBuilder();
		for (INode error : parseResult.getSyntaxErrors()) {
			builder.append(error.getSyntaxErrorMessage().getMessage());
		}
		return builder.toString();
	}
	
	private byte[] toByteArray(XtextResourceSet rs, Model model) throws IOException {
		Resource xmiResource = rs.createResource(URI.createURI("dummy:/test.xmi"));
		xmiResource.getContents().add(model);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		xmiResource.save(os, null);
		xmiResource.unload();
		return os.toByteArray();
	}
}
