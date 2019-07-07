package project4;

/**
 * Represents a node in a binary tree. Each tree node contains a data portion - a name 
 * and two references, one for each of the node's children.
 * @author Qi Wang
 * @version 1.0
 */
public class TreeNode<T extends Comparable<T>> {


	/**
	 * The data portion of this node
	 */
	private T element;
	/**
	 * The reference to left child of this node
	 */
	public TreeNode<T> left;
	
	/**
	 * The TreeNode<T> to right child of this node
	 */
	public TreeNode<T> right;

	/**
	 * Constructs a default node.
	 */
	public TreeNode() {
		this(null, null, null);
	}
	
	/**
	 * Constructs an empty node.
	 * @param element A reference to the item of this node
	 */
	public TreeNode(T element) {
		this(element, null, null);
	}

	/**
	 * Constructs a node with an element and two descendant nodes. 
	 * @param element A reference to the data of this node
	 * @param left Reference to the left child of this node
	 * @param right Reference to the right child of this node
	 */
	public TreeNode(T element, TreeNode<T> left, TreeNode<T> right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}

	/**
	 * Returns the element of this node.
	 * @return A reference to the element of this node
	 */
	public T getElement() {
		return this.element;
	}

	/**
	 * Changes the element of this node.
	 * @param element The element of this node
	 */
	public void setElement(T element) {
		this.element = element;
	}

	/**
	 * Returns the left child of this node.
	 * @return A reference to the left child of this node
	 */
	public TreeNode<T> getLeft() {
		return this.left;
	}

	/**
	 * Changes the left child of this node.
	 * @param leftChild A reference to the left child of this node
	 */
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	/**
	 * Returns the right child of this node. 
	 * @return A reference to the tight child of this node
	 */
	public TreeNode<T> getRight() {
		return this.right;
	}

	/**
	 * Changes the right child of this node. 
	 * @param rightChild A reference to the right child of this node
	 */
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
	/**
	 * Returns the specified value, throws an exception if it is not found.
	 * @param k the specified value
	 * @return the specified value if it is contained in the node
	 */
	public T retrieve(T k){
		if (k.compareTo(this.element) == 0){
			return this.element;
		}else if (k.compareTo(this.element) < 0){
			if (this.left == null){
				throw new TreeException("record not found");
			}else return this.left.retrieve(k);
		}else if (k.compareTo(this.element) > 0){
			if (this.right == null){
				throw new TreeException("record not found");
			}else return this.right.retrieve(k);
		}
		throw new TreeException("record not found");
	}
}
