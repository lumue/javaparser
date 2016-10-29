package io.github.lumue.javarenderer;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.type.Type;

/**
 * Created by lm on 29.10.16.
 */
public class CompilationUnitRenderer implements NodeRenderer<CompilationUnit,TypeStatement> {

	private final static NodeRenderer<Type,TypeStatement> TYPE_RENDERER=new TypeRenderer();

	@Override
	public TypeStatement toStatement(CompilationUnit in) {
		return null;
	}
}
