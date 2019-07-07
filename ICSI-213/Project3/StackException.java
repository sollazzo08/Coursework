package project3;

/**
 * An exception that is thrown when stack operations such as pop and push fail.
 * 
 * @author Qi Wang
 * @version 1.0
 */
public class StackException extends java.lang.RuntimeException {
	/**
	 * Constructs an exception with a specified message.
	 * 
	 * @param message The specified message of this exception
	 */
	public StackException(String message) {
		super(message);
	}
}