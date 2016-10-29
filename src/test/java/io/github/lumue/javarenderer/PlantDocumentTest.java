package io.github.lumue.javarenderer;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by lm on 29.10.16.
 */
public class PlantDocumentTest extends AbstractPlantElementTest {

	private final static String EXPECTED_EMPTY_DOCUMENT="@startuml\n@enduml\n";

	@Test
	public void testEmptyDocument() throws Exception{
		PlantDocument plantDocument = new PlantDocument(Collections.emptyList());
		String actual = renderStatementAsString(plantDocument);
		assertThat(actual,equalTo(EXPECTED_EMPTY_DOCUMENT));
	}

}
