package project4;
import java.util.ArrayList;
/**
 * Represents an address book that holds person records
 * @author michael
 *
 */
public class AddressBook<T extends Comparable<T>> implements ADTAddressBook<PersonRecord> {
	
	/**	
	 * Instance of a binary search tree
	 */
	private BinarySearchTree<PersonRecord> bst;
	
   /**
	* Constructs an empty address book.
	*/
	public AddressBook(){
		this.bst = null;
	}
	/**
	 * Constructs address book with person records.
	 * @param list a list containing person records
	 */
	public AddressBook(ArrayList<PersonRecord> list){
		this.bst = new BinarySearchTree<PersonRecord>(list.get(0));
		for (int i=1;i<list.size();i++){
			bst.insert(list.get(i));
		}
	}
	/**
	 * Constructs an address book with person records.
	 * @param tree a tree containing person records
	 */
	public AddressBook(BinarySearchTree<PersonRecord> bst){
		this.bst = bst;
	}
	 /**
	  * Uses insert method from Binary search tree to add a person record to the book 
	  */
	
	public void add(PersonRecord key) {
		
		bst.insert(key);
		
	}
	/**
	 * Uses insert delete from Binary search tree to delete a person record to the book 
	 *
	 */
	public void delete(PersonRecord key) {
		bst.delete(key);
	}
	/**
	 * Uses retrieve method from Tree Node class to get a person record to the book 
	 */
	public PersonRecord retrieve(PersonRecord p) {
		return bst.retrieve(p);
	}
	/**
	 * Uses search method from Binary search tree to search a person record to the book 
	 */
	public boolean search(PersonRecord p) {
		
		return bst.search(p);
	}
		
}
