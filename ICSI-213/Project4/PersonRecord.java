package project4;
/**
 * Represents a person record object 
 * @author michael
 *
 */

public class PersonRecord implements Comparable<PersonRecord>{
/**
 * The name of the object
 */
private String name;
/**
 * The address of the object
 */
private Address address;
/**
 * The phone number of the object
 */
private String phoneNumber;
	

/**
 * Constructs a person record with a name, but no address or phone.
 * @param name the person's name
 */
public PersonRecord(String name){
	this(name, null, null);
}
	/**
	 * Constructs a person record object with name, address, and phone number 
	 * @param name a String object 
	 * @param address a Address object
	 * @param phoneNumber a String object
	 */ 
	public PersonRecord(String name, Address address, String phoneNumber) {
	
		this.name = name;
		this.address = address;
		this.phoneNumber =phoneNumber;
	
	}
	/**
	 * Gets the name element
	 * @return the element
	 */
	public String getName() {
		
		return this.name;
	}
	/**
	 * Sets the name element
	 * @param name the element
	 */
	public void setName(String name) {
		
		this.name = name;
	}
	/**
	 * Gets the address element
	 * @return the element
	 */
	public Address getAddress() {
		
		return this.address;
	}
	/**
	 * Sets the address element
	 * @param address the element
	 */
	public void setAddres(Address address) {
		
		this.address = address;
	}
	/**
	 * Gets the phone number element
	 * @return the element
	 */
	public String getPhoneNumber() {
		
		return this.phoneNumber;
	}
	/**
	 * Sets the phone number element
	 * @param phoneNumber the element
	 */
	public void setPhoneNumber(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Returns a string representation of the person record.
	 * @return a string representation of the person record.
	 */
	public String toString(){
		return(name + "\n" + address.toString() + "\n" + phoneNumber);
	}
	
	
	public int compareTo(PersonRecord o) {
		
		return this.name.compareToIgnoreCase(o.getName());
	}
	
	
	
}
