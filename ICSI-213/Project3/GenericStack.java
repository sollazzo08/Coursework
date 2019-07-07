package project3;

import java.util.ArrayList;
/**
 * This class represents the method of a stack class
 * @author michael
 * @param <E> Any primitive or reference type
 */
public class GenericStack<E> implements GenericStackInterface<E> {
	/**
	 * An array list 
	 */
	private ArrayList<E> list;
	/**
	 * Constructs a stack 
	 */
	public GenericStack() {

		list = new ArrayList<E>();
	}
	/**
	 * Gets the size of an array
	 */
	@Override
	public int getSize() {

		return list.size();
	}
	/**
	 * Checks what is in the top of the stack
	 */
	@Override
	public E peek() throws StackException {
		if (!list.isEmpty()) {
			return list.get(this.list.size()-1);
		} else {
			throw new StackException("Stack exception on " + "peek -stack empty");
		}
	}
	/**
	 * Adds an element to the top of the stack 
	 */
	@Override
	public void push(E obj) throws StackException {

		list.add(obj);
	}
	/**
	 * Removes the element at the top of the stack 
	 */
	@Override
	public E pop() throws StackException {
		if(list.size() > 0) {
		   return this.list.remove(list.size()-1);
		}
		   else {
			
			throw new StackException("StackException on " + "pop: stack empty");
		   }
	}
	/**
	 * Checks if the stack is empty 
	 */
	@Override
	public boolean isEmpty() {

		return list.size() == 0;
	}

}
