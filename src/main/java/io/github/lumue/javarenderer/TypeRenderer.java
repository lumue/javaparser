package io.github.lumue.javarenderer;

import com.github.javaparser.ast.type.Type;

/**
 * Created by lm on 29.10.16.
 */
public class TypeRenderer implements NodeRenderer<Type,TypeStatement> {
	@Override
	public TypeStatement toStatement(Type in) {
		return null;
	}
}
