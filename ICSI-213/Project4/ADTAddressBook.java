package project4;

public interface ADTAddressBook<T> {
// add, delete, change, retrieve 
	/**
	 * Uses insert method from Binary search tree to add a person record to the book 
	 * @param key person record
	 */
	public void add(T key);
	/**
	 * Uses insert delete from Binary search tree to delete a person record to the book 
	 * @param key person record
	 */
	public void delete(T key);
	/**
	 *  Uses retrieve method from Tree Node class to get a person record to the book 
	 * @param key person record
	 * @return person record
	 */
	public T retrieve(T key);
	/**
	 * Uses search method from Binary search tree to search a person record to the book 
	 * @param key person record
	 * @return record
	 */
	public  boolean search(T key);
}
