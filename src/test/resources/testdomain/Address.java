package testdomain;

/**
 * Created by lm on 29.10.16.
 */
public class Address {
	private final String street;
	private final String zip;
	private final City city;
	private final Country country;

	public Address(String street, String zip, City city, Country country) {
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.country = country;
	}
}
