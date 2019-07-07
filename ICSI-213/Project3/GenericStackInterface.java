package project3;
/**
 * ADT representation of GenericStack class
 * @author michael
 *
 * @param <E> Any primitive or reference type
 */
public interface GenericStackInterface<E> {
	/**
	 * Gets the size of an array
	 */
	public int getSize();
	/**
	 * Checks what is in the top of the stack
	 */
	public E peek() throws StackException;
	/**
	 * Adds an element to the top of the stack 
	 */
	public void push(E obj) throws StackException;
	/**
	 * Removes the element at the top of the stack 
	 */
	public E pop() throws StackException;
	/**
	 * Checks if the stack is empty 
	 */
	public boolean isEmpty();

}
