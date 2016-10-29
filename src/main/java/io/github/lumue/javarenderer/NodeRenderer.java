package io.github.lumue.javarenderer;

import com.github.javaparser.ast.Node;

/**
 * Render a Node as plantuml statement
 *
 * Created by lm on 29.10.16.
 */
@FunctionalInterface
public interface NodeRenderer<NODE_TYPE extends Node,STATEMENT_TYPE extends PlantStatement>  {

	STATEMENT_TYPE toStatement(NODE_TYPE in);

}
