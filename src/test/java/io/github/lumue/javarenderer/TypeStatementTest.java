package io.github.lumue.javarenderer;

import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by lm on 29.10.16.
 */
public class TypeStatementTest extends AbstractPlantElementTest{
	private final String EXPECTED_EMPTY_TYPE="class EmptyType";
	@Test
	public void testEmptyType() throws Exception{
		TypeStatement typeStatement = new TypeStatement("EmptyType",Collections.emptyList());
		String actual = renderStatementAsString(typeStatement);
		assertThat(actual,equalTo(EXPECTED_EMPTY_TYPE));
	}
}
