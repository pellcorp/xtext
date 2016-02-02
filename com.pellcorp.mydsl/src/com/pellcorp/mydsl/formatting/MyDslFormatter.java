/*
 * generated by Xtext
 */
package com.pellcorp.mydsl.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import com.google.inject.Inject;
import com.pellcorp.mydsl.services.MyDslGrammarAccess;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class MyDslFormatter extends AbstractDeclarativeFormatter {
	@Inject
	private MyDslGrammarAccess f; 
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		  c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
	        c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
	        c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

	        for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
	            c.setLinewrap().before(pair.getFirst());
	            c.setLinewrap().after(pair.getFirst());
	            c.setLinewrap().before(pair.getSecond());
	            c.setLinewrap().after(pair.getSecond());
	            
	            c.setIndentationIncrement().after(pair.getFirst());
	            c.setIndentationDecrement().before(pair.getSecond());
	        }
	        
	        for (Keyword semicolon : f.findKeywords(";")) {
	            c.setLinewrap().after(semicolon);
	            c.setNoSpace().before(semicolon);
	        }
	        
	        for (Keyword comma : f.findKeywords(",")) {
	            c.setNoSpace().before(comma);
	            c.setSpace(" ").after(comma);
	        }
	
	}
}