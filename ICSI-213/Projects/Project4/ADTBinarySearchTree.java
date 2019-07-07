package project4;
/**
 * Represents the interface for Address Binary search tree 
 * @author michael
 *
 * @param <T>
 */
public interface ADTBinarySearchTree<T extends Comparable<T>> {
	/**
	 * Uses search method from Binary search tree to search a person record to the book 
	 * @param s
	 * @return
	 */
	public boolean search(T s);
	/**
	 * Uses search method from Binary search tree to search a person record to the book 
	 * @param i
	 * @return
	 */
	public boolean insert(T i);
	/**
	 * Uses insert delete from Binary search tree to delete a person record to the book 
	 * @param d
	 * @return
	 */
	public boolean delete(T d);
	/**
	 * Represents the iterator 
	 * @return pre, in, post order 
	 */
	public TreeIterator<T > iterator();
	
	
	
	
}
