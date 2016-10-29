package io.github.lumue.javarenderer;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lm on 29.10.16.
 */
public class TypeStatement implements PlantStatement{

	private final String typeName;

	private final List<PlantStatement> children=new ArrayList<>();

	public TypeStatement(String typeName, List<PlantStatement> children) {
		this.typeName = typeName;
		this.children.addAll(children);
	}




	@Override
	public void write(OutputStream outputStream) {
		PrintStream printStream=new PrintStream(outputStream);
		printStream.print("class "+typeName);

		if(children.isEmpty()) {
			printStream.flush();
			return;
		}

		printStream.append("{\n").flush();
		children.forEach(child ->{
			printStream.print("\t");
			child.write(printStream);
			printStream.println();
		});
		printStream.append("}").flush();

	}
}
