package io.github.lumue.javarenderer;

import java.io.ByteArrayOutputStream;

/**
 * Created by lm on 29.10.16.
 */
public abstract class AbstractPlantElementTest {
	protected String renderStatementAsString(PlantStatement plantStatement) {
		ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
		plantStatement.write(outputStream);
		return outputStream.toString();
	}
}
