package testdomain;

/**
 * Created by lm on 29.10.16.
 */
public class Person {

	private final String name;

	private final Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

}
