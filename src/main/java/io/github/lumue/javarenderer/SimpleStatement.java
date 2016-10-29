package io.github.lumue.javarenderer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lm on 29.10.16.
 */
class SimpleStatement extends AbstractStatementTemplate implements PlantStatement {

	private final String statementString;

	SimpleStatement(String statementString) {
		this.statementString = statementString;
	}

	@Override
	protected String getStatementAsString() {
		return statementString;
	}
}
