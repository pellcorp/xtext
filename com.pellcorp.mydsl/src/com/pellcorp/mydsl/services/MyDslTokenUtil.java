package com.pellcorp.mydsl.services;

import java.util.List;

import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.impl.TokenUtil;

import com.google.common.collect.Lists;

public class MyDslTokenUtil extends TokenUtil {
	public String serializeNode(INode node) {
		if (node instanceof ILeafNode) {
			ILeafNode leaf = (ILeafNode) node;
			String text = leaf.getText();
			return text;
		}
		
		List<ILeafNode> leafNodes = Lists.newArrayList(node.getLeafNodes());
		int begin = 0, end = leafNodes.size() - 1;
		while (begin <= end && isWhitespaceOrCommentNode(leafNodes.get(begin))) {
			begin++;
		}
		
		while (begin <= end && isWhitespaceOrCommentNode(leafNodes.get(end))) {
			end--;
		}
		
		if (begin == end) {
			ILeafNode leaf = leafNodes.get(begin);
			
			if (isWhitespaceOrCommentNode(leaf)) {
				return "";
			} else {
				String text = leaf.getText();
				return text;
			}
		}
		
		StringBuilder b = new StringBuilder();
		for (int i = begin; i <= end; i++) {
			ILeafNode leaf = leafNodes.get(i);
			String ltext = leaf.getText();
			b.append(ltext);
		}
		String text = b.toString();
		return text;
	}
}
