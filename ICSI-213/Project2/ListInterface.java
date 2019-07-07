package project2;

/**
 * Specifications on the design of operations of an ADT linked character string.
 */

public interface ListInterface {	
	
	/**
	 * Determines whether or not the list is empty. 
	 * @return a boolean value specifying whether or not the linked list is empty. 
	 */
	
	public boolean isEmpty();
	
	/**
	 * Finds a character at a specified index in the linked string.
	 * @param x is the index 
	 * @return a position of the character chosen
	 */
	
	public char charAt(int x);
	
	/**
	 * Concatenates the specified linked character string to the end of this linked character string.
	 * @param str1 linked character string
	 * @return Concatenation of the two linked character strings.
	 */
	
	public LinkedString concat(LinkedString str1);
	
	/**
	 * Finds the length of the linked character string
	 * @return the length of this linked character string
	 */
	
	public int length();
	
	/**
	 * Creates a new substring of the current linked character string
	 * @param x position of character 
	 * @param y position of character
	 * @return a new linked character string that is a substring of this linked charcter string
	 */
	
	public LinkedString subString(int start, int end);	

	//public void add(int index, Object data) throws ListIndexOutOfBoundsException;
}
