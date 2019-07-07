package project2;
/*/
 * Represents a node in a doubly linked list
 */
public class Node {
	/*
	 * The element in the node
	 */
	private Object element;
	/*
	 * The link to the next node 
	 */
	private Node next;
	/*/
	 * The link to the previous node
	 */
	private Node previous;
	
	/**
	 * First constructor, builds an empty node
	 */
	public Node() {
		
		this(null, null, null);
	}
	/**
	 * Second constructor, builds a node with an element and a null link to a previous and next node
	 * @param element a element in the node
	 */
	public Node(Object element) {
		this(element, null, null);
	}
	/**
	 * Third constructor, builds a node with an element and a link to a previous and next node
	 * @param element a element in the node
	 * @param next the next node
	 * @param previous the previous node
	 */
	public Node(Object element, Node next, Node previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
	/**
	 * Returns the element of this node.
	 * @return The element of this node
	 */
	public Object getElement() {
	
		return this.element;
	}
	/**
	 * Changes the element of this node.
	 * @param obj A reference to an element
	 */
	public void setElement(Object obj) {
		
		this.element = obj;
		
	}
	/**
	 * Returns the element of previous node.
	 * @return The element of previous node
	 */
	public Node getPrevious(){
		
		return this.previous;
	}
	/**
	 * Changes the element of previous node.
	 * @param n A reference to an element
	 */
	public void setPrevious(Node n) {
		
		this.previous = n;
		
	}
	/**
	 * Returns the next reference of this node.
	 * @return A reference to the next node of this node
	 */
	public Node getNext() {
		
		return this.next;
	}
	/**
	 * Changes the next reference of this node
	 * @param n A reference to the next node of this node
	 */
	public void setNext(Node n) {
		
		this.next = n;
		
	}

}
 