package com.pellcorp.mydsl.services;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class MyDslValueConverter extends DefaultTerminalConverters {
	@ValueConverter(rule = "MyID")
	public IValueConverter<String> MyID() {
		return new IValueConverter<String>() {
			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				if (string.startsWith("^")) {
					string = string.substring(1);
				}
				return string;
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value;
			}
		};
	}
}
