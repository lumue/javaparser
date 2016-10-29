package io.github.lumue.javarenderer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lm on 29.10.16.
 */
class SimpleStatement implements PlantStatement {

	private final String statementString;

	SimpleStatement(String statementString) {
		this.statementString = statementString;
	}

	@Override
	public void write(OutputStream outputStream) {
		try {
			outputStream.write(getStatementAsString().getBytes());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private String getStatementAsString() {
		return statementString;
	}
}
