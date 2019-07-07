package project4;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTreeBasis<T> implements ADTBinarySearchTree<T>{
	
	 /**
	   * Creates an empty  binary search tree.
	   */
	 public BinarySearchTree() {
		 
		 this.root = null;
	  }
	
	  /**
	   * Creates a one node binary search tree.
	   * @param rootItem The root of this tree
	   */
	 public BinarySearchTree(T rootItem) {
	  this.root = new TreeNode<T>(rootItem,null,null);
	  }
	 /**
		 * Constructs a binary search tree with a root.
		 * @param n the node that will be the tree's root
		 */
		public BinarySearchTree(TreeNode<T> n){
			this.root = n;
		}
		
	/**
	 * 
	 */
	public boolean search(T element) {

		return search(root, element);

 }
		/**
		 * Search binary tree for person record
		 * @param node person record
		 * @param element name
		 * @return person record
		 */
	private boolean search(TreeNode<T> node, T element)
	   {
		
		boolean found =  false;
		
	        while ((node != null ) && !found) {
	        	
	        	T key = node.getElement();
	        	
	        	if(element.compareTo(key) < -1)
	        		node = node.getLeft();
	        	else if (element.compareTo(key) < 1)
	        		node = node.getRight();
	        	else 
	        	{
	        found = true;
	        break;
	    }	
		found = search(node, key);
}
		return found;
}

	/**
	 *  Inserts a person record into a person record
	 * @param node person record 
	 * @param element name
	 * @return person record 
	 * @throws TreeException
	 */
	public boolean insert(T element)  {
		TreeNode<T> r = new TreeNode<T>(element,null,null);
		TreeNode<T> l = new TreeNode<T>(element,null,null);
		if(this.root == null) {
			this.root = new TreeNode<T>(element,null,null);
		    return true;
		}
		TreeNode<T> node =this.root;
		while(node!= null) {
			if(node.getElement().equals(element)) {
				return false;}
		
			else if(element.compareTo(node.getElement()) < 0) {
		    if(node.getLeft() == null) {
			node.setLeft(l);
		    break;
			}
		node = node.getLeft();
	}
	else {
		if(node.getRight() ==null) {
			node.setRight(r);
			break;
		}
		node = node.getRight();
	}
}
		return true;
}

	/**
	 * Deletes a person record from the binary search tree
	 */
	public boolean delete(T element)
	{
		if(isEmpty())
			return false;
		else if(search(element) == false)
			return false;
		else 
		{
			root = delete(root,element);
			return true;
		}
		
	}
	/**
	 * Deletes a person record from the binary search tree
	 * @param root person record
	 * @param element name
	 * @return person record
	 */
	private TreeNode<T> delete(TreeNode<T> root, T element) {
		
		TreeNode<T> p, p2, n;
		
		if(root.getElement() == element) {
			
			TreeNode<T> lt, rt;
			
			lt = root.getLeft();
			rt = root.getRight();
			
			if(lt == null && rt == null)
				return null;
			else if (lt ==null)
			{
				p = rt;
				return p;
			}
			else if(rt == null) 
			{
				p = lt;
				return p;
			}
			else
			{
				 p2 = rt;
                 p = rt;
                 while (p.getLeft() != null)
                     p = p.getLeft();
                 p.setLeft(lt);
                 return p2;
			}
		}
		if (element.compareTo(root.getElement()) < 1) {
			n = delete(root.left, element);
			root.setLeft(n);
		}
		else 
		{
			n = delete(root.getRight(), element);
			root.setRight(n);
		}
		return root;
	}
	/**
	 * Retrieves the specified value
	 * @param k the specified value
	 * @return the specified value if it is found
	 */
	public T retrieve(T k){
		if (root == null){
			throw new TreeException("empty tree");
		}else{
			return root.retrieve(k);
		}
	}
	/**
	 * 
	 */
	@Override
	public void setRoot(T newItem) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 */
	@Override
	public TreeIterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}