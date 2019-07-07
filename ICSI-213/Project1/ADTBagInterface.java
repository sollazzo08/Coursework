package project1;

import inclass.ListException;
import inclass.ListIndexOutOfBoundsException;
/**
 * Specifications on the design of operations of an ADT list. 
 * @author Michael Sollazzo
 */
public interface ADTBagInterface {

	/**
	 * Determines whether or not the bag is empty.
	 * @return A Boolean value specifying whether or not the bag is empty
	 */
	public boolean isEmpty();
	/**	
	 * Determines whether or not a bag is full. 
	 * @return A Boolean value specifying whether or not the bag is full
	 */
	public boolean isFull();
	/**
	 * Checks to see how many items are in the bag.
	 * @return An Integer specifying the numbers of items in the bag
	 */
	public int size();
	/**
	 * Empties all items in the bag.
	 */
	public void makeEmpty();
	/**
	 * Removes an item from the bag at random.
	 */
	public void removeRandom();
	/**
	 * Removes the last item in the bag. 
	 */
	public void removeLast();
	/**
	 * Retrieves an item at a specific index from the bag. 
	 * @param index Specific position in bag
	 * @return an item at index from the bag
	 * @throws ListException
	 * @throws ListIndexOutOfBoundsException 
	 */
	public Object get(int index) throws ListIndexOutOfBoundsException, ListException;
	/**
	 * Retrieves an item from the bag. 
	 * @param item an item from the bag
	 * @return an item
	 * @throws ListException 
	 */
	public Object get(Object item) throws ListException;
	/**
	 * Adds an item to the end of the bag. 
	 * @param item an item from the bag
	 * @throws ListException 
	 */
	public void insert(Object item) throws ListException;
	

	
}
