package project2;

/**
 *  Doubly Linked list Data Structure Class, overrides methods from ADT
 *  Implements ADT ListInterface
 */

public class LinkedString implements ListInterface {
	
	/*
	 * A reference to the head Node of the doubly linked list 
	 */
	
	private Node head;
	
	/*
	 * Keeps track of the number of Nodes in a doubly linked list
	 */
	
	private int count = 0;
	
	/**
	 * Default constructor, builds an empty doubly linked list
	 */
	
	public LinkedString() {

		this.head = null;
	    this.count = 0;
	}
	
	/**
	 * Second constructor, takes in a character array and builds a doubly linked list from it. 
	 * @param arr a character array 
	 */
	
	public LinkedString(char[] arr) {
	
		Node new_letter = null;
		
		for( int i = 0; i < arr.length; i++) {
			
			if(i == 0) {
				this.head = new Node(arr[i],null,null);
			}
			else if(i == 1) {
				this.head.setNext(new Node(arr[i],null,this.head));
				new_letter = this.head.getNext();
			}
			else {
				new_letter.setNext(new Node(arr[i],null,new_letter));
				new_letter = new_letter.getNext();
			}		
			this.count++;
		}
	}	

	/**
	 *  Third constructor, takes in a string and converts it to character array then sends it to second constructor
	 * @param str a string 
	 */
	
	public LinkedString(String str) {
		
		this(str.toCharArray());
	
	}
	
	/**
	 * Determines whether or not the list is empty. 
	 * @return a boolean value specifying whether or not the linked list is empty. 
	 */
	
	@Override
	public boolean isEmpty() {
			return this.count == 0;
	}
	
	/**
	 * Finds a character at a specified index in the linked string.
	 * @param x is the index 
	 * @return a position of the character chosen
	 */
	
	@Override
	public char charAt(int i) {
		
		Node current = this.head;
		int k = 0;
		Character p;
		if(i==0) {
			p = (Character) current.getElement();
			return p;
		}else {
			while(k != i) {
			current = current.getNext();
			k++;
			}
			p = (Character) current.getElement();
			return p;
		}

		
	}

	/**
	 * Concatenates the specified linked character string to the end of this linked character string.
	 * @param str1 linked character string
	 * @return Concatenation of the two linked character strings.
	 */
	
	@Override
	public LinkedString concat(LinkedString str1) {

		
		
	if(str1.head == null) {
		count = str1.length();
		return str1;
	}
	else {
		Node current = this.head;
		while(current.getNext()!= null) 
			current = current.getNext();
			current.setNext(str1.head);
			this.count = this.count + str1.length();
			return this;
		}	
	}
		
	/**
	 * Finds the length of the linked character string
	 * @return the length of this linked character string
	 */
	
	@Override
	public int length() {
		
		return this.count;
	}
	
	/**
	 * Creates a new substring of the current linked character string
	 * @param start position of character 
	 * @param end position of character
	 * @return a new linked character string that is a substring of this linked charcter string
	 */
	
	@Override
	public LinkedString subString(int start, int end) {
		
		String substr = "";
		
		for(int i = start; i <= end; i++) 
			substr = substr + charAt(i);
			LinkedString lksubstr = new LinkedString(substr);
			return lksubstr;
		}
	
		
	
	
	
	/**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
	
	@Override
	public String toString(){
		  
		Node curr = this.head;
		String result = "";
		result = result + curr.getElement();
		  while (curr.getNext()!= null) {
		  curr = curr.getNext();
		  result = result + curr.getElement();
		  }
		  
		  return result;
	  
	  }
	
}