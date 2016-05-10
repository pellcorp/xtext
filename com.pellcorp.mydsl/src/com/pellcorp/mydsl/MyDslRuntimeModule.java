/*
 * generated by Xtext
 */
package com.pellcorp.mydsl;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.serializer.tokens.IValueSerializer;

import com.pellcorp.mydsl.linker.MyDslLazyLinker;
import com.pellcorp.mydsl.services.MyDslTransientValueService;
import com.pellcorp.mydsl.services.MyDslValueConverter;
import com.pellcorp.mydsl.services.MyDslValueSerializer;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class MyDslRuntimeModule extends com.pellcorp.mydsl.AbstractMyDslRuntimeModule {
	@Override
	public Class<? extends ILinker> bindILinker() {
		// Add Built-in Types to model before linking.
		return MyDslLazyLinker.class;
	}
	
	@Override
	public Class<? extends ITransientValueService> bindITransientValueService() {
		return MyDslTransientValueService.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return MyDslValueConverter.class;
	}
	
	
	public Class<? extends IValueSerializer> bindIValueSerializer() {
		return MyDslValueSerializer.class;
	}
}
