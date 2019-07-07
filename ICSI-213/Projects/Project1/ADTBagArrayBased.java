package project1;
import java.util.Random;
import inclass.ListException;
import inclass.ListIndexOutOfBoundsException;
/**
 * Implementations of operations of an ADT list.
 * @author Michael Sollazzo
 */
public class ADTBagArrayBased implements ADTBagInterface{

	/**
	 * A reference to an array of items.
	 */
	private Object[] items;
	/**
	 * Creates an empty array of size 50.
	 */
	public ADTBagArrayBased() {
	
		this.items = new Object[50];
	}
	/**
	 *  Determines whether or not the bag is empty.
	 * @return A Boolean value specifying whether or not the bag is empty
	 */
	public boolean isEmpty() {
		
		return this.items.length == 0;
		/*
		boolean status = false;
		
		if(this.items == null)
			status = true;
		else 
			status = false;
		
		return status;
		*/
	}
	/**	
	 * Determines whether or not the bag is full. 
	 * @return A Boolean value specifying whether or not the bag is full
	 */
	public boolean isFull() {
		
		boolean check = false;
		
		if(this.items[this.items.length - 1] != null) 	
			check = true;
		else 
			check = false;
			
		return check;		
	}
	
	/**
	 * Checks to see how many items are in the bag.
	 * @return An Integer specifying the numbers of items in the bag
	 */
	public int size() {
		
		int counter = 0;
		
		for(int x = 0; x < this.items.length; x++)
			if(this.items[x]!= null) {
				counter++;
			}
		
		return counter;
	}

	/**
	 * Empties all items in the bag.
	 */
	public void makeEmpty() {
	for(int x = 0; x < this.items.length; x++) {
		this.items[x] = null;
	}
	System.out.println("Your bag has been emptied.");
	}

	/**
	 * Removes an item from the bag at random.
	 */
	public void removeRandom() {
		//created a variable that stores a random integer 
		Random rand = new Random();
		int x = rand.nextInt(size()) + 0;
		  
		Object[] newArray = new Object[this.items.length - 1];
		int j = 0;
		for (int i = 0; i < this.items.length; i++) {
		    if (i != x) {
		        newArray[j++] = this.items[i];
		    }
		}
		this.items = newArray;
	}
	

	/**
	 * Removes the last item in the bag. 
	 */
	public void removeLast() {
	
			this.items[size()-1] = null;
	
	}

	/**
	 * Retrieves an item at a specific index from the bag. 
	 * @param a index with a Specific position in bag
	 * @return an item at index from the bag
	 * @throws ListException
	 * @throws ListIndexOutOfBoundsException 
	 */
	public Object get(int index)  throws ListIndexOutOfBoundsException, ListException {
		  if(this.size() == 0){
			  throw new ListException("The list is empty, and no elements can be removed.");
		  }else if(index < 0 || index > this.size()){
			  throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.items.length-1));
		  }else{
			 
			  return this.items[index];
		  }
		
	}
	
	/**
	 * Retrieves an item from the bag. 
	 * @param item an item from the bag
	 * @return an item
	 * @throws ListException
	 */
	public Object get(Object item) throws ListException{
		
		if(isEmpty())
			 throw new ListException("The list is empty, and no elements can be retreived.");
		
		for(int x = 0; x < this.items.length; x++) {
			if(this.items[x] == item);
		}
		return item;
		
	}

	/**
	 * Adds an item to the end of the bag. 
	 * @param item an item from the bag
	 * @throws ListException
	 */
	public void insert(Object item) throws ListException{
		
			if(isFull())
				 throw new ListException("The list is full, and no elements can be added.");
			else
			for(int x = 0; x < this.items.length; x++)
				if(this.items[x] == null) {
					this.items[x] = item;
					break;
				}
		
	}


}


