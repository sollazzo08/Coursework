package project4;
/**
 * Represents an address object
 * @author michael
 *
 */
public class Address {
/**
 * The street of the object
 */
private String street;
/**
 * The city of the object
 */
private String city;
/**
 * The state of the object 
 */
private String state;
/**
 * The zipcode of the object
 */
private String zipCode;


	/**
	 * Constructs an address object with street, city, state, and zipcode
	 * @param street a string object
	 * @param city a string object 
	 * @param state a string object 
	 * @param zipCode a string object 
	 */
	public Address(String street, String city, String state, String zipCode) {
	
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode =zipCode;

	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Gets the street element
	 * @return street address
	 */
	public String getStreet() {
		
		return this.street;
	}
	/**
	 * Sets the street element
	 * @param street a string object
	 */
	public void setStreet(String street) {
		
		this.street = street;
		
	}
	/**
	 * Gets the city element
	 * @return the city name
	 */
	public String getCity() {
		
		return this.city;
	}
	/**
	 * Sets the city element
	 * @param city a string object
	 */
	public void setCity(String city) {
		
		this.city = city;
	}
	/**
	 * Gets the state element
	 * @return the state 
	 */
	public String getState() {
		
		return this.state;
	}
	/**
	 * Sets the state element
	 * @param state a string object 
	 */
	public void setState(String state) {
		
		this.state = state;
	}
	/**
	 * Gets the zipcode element
	 * @return the zipcode
	 */
	public String getZipCode() {
	
	return this.zipCode;
	}
	/**
	 * Sets the zipcode element
	 * @param zipCode a string object
	 */
	public void setZipeCode(String zipCode) {
		
		this.zipCode = zipCode;
	}

	/**
	 * Returns a string representation of this address.
	 * @return a String representation of this address.
	 */
	public String toString(){
		return(street + "\n" + city + " " + state + " " + zipCode);
	}
}
