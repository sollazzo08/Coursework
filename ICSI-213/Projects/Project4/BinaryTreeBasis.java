package project4;


/**
 * Represents a binary tree with basic operations such as 
 *		1. Creates an empty binary tree.
 * 		2. Creates a one-node binary tree whose root contains a root item.
 *		3. Removes all of the nodes from a binary tree, leaving an empty tree.
 * 		4. Determines whether a binary tree is empty.
 * 		5. Retrieves the data item in the root of a nonempty binary tree. Throws TreeException if the tree 
 * 	 	   is empty.
 * 		6. Sets the data item in the root of a binary tree. Throws UnsupportedOperationException if the 
 * 	 	   method is not implemented.
 * @author Qi Wang
 * @version 1.0
 */
public class BinaryTreeBasis<T extends Comparable<T>> {
	  /**
	   * The root of this tree
	   */
	  protected TreeNode<T> root;

	  /**
	   * Creates an empty binary tree.
	   */
	  public BinaryTreeBasis() {
		  this.root = null;
	  }
      
	  /**
	   * Creates a one-node binary tree whose root contains a root item.
	   * @param rootItem The item of the root
	   */
	  public BinaryTreeBasis(T rootItem) {
	     this.root = new TreeNode<T>(rootItem, null, null);
	  } 

	  /**
	   * Returns true if the tree is empty, else returns false.
	   * @return A value specifying if the tree is empty
	   */
	  public boolean isEmpty() {
		  return this.root == null;
	  } 

	  /**
	   * Removes all nodes from the tree.
	   */
	  public void makeEmpty() {
	    this.root = null;
	  }

	  /**
	   * Returns the element in the tree's root.
	   * @return A reference to the item of the root
	   * @throws TreeException if the tree is empty
	   */
	  public T getRoot() throws TreeException {
	    if (this.root == null) {
	      throw new TreeException("TreeException: Empty tree");
	    }else {
	      return this.root.getElement();
	    }
	  }

	  /**
	   * Changes the root element of this binary tree. An UnsupportedOperationException object is 
	   * thrown if operation is not supported.
	   * @param newItem A reference to the new root
	   * @throws  UnsupportedOperationException if operation is not supported.
	   */
	  public void setRoot(T newItem) throws UnsupportedOperationException{
		  this.root.setElement(newItem);
	  }
	}  
