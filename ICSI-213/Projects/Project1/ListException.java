package project1;

/**
 * Defines an exception that is thrown when an index is out of bound.
 */
public class ListException extends Exception {
	
	/**
	 * Constructs an object with specific message.
	 * @param message A string literal specifying the details of this exception
	 */
	public ListException(String message) {
		super(message);
	}
}