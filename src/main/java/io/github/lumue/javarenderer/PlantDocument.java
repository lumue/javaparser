package io.github.lumue.javarenderer;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * write a collection of statements, surrounded by plantuml start and end tags
 * Created by lm on 29.10.16.
 */
public class PlantDocument implements PlantStatement {

	public static final byte[] NEWLINE_BYTES = {'\n'};

	private static class PlantPrefix extends SimpleStatement {

		private PlantPrefix() {
			super("@startuml");
		}
	}
	private static class PlantSuffix extends SimpleStatement {

		private PlantSuffix() {
			super("@enduml");
		}
	}
	private final static PlantPrefix PLANT_PREFIX=new PlantPrefix();

	private final static PlantSuffix PLANT_SUFFIX=new PlantSuffix();
	private final List<PlantStatement> statementList;

	public PlantDocument(List<PlantStatement> statementList) {
		this.statementList = new ArrayList<>(statementList.size()+2);
		this.statementList.add(PLANT_PREFIX);
		this.statementList.addAll(statementList);
		this.statementList.add(PLANT_SUFFIX);
	}

	@Override
	public void write(OutputStream outputStream) {
		this.statementList.forEach(statement -> {
			statement.write(outputStream);
			try {
				outputStream.write(NEWLINE_BYTES);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
