package io.github.lumue.javarenderer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lm on 29.10.16.
 */
abstract class AbstractStatementTemplate {
	public void write(OutputStream outputStream) {
		try {
			outputStream.write(getStatementAsString().getBytes());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	protected abstract String getStatementAsString();
}
