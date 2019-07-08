package homework;

public class MyArrayListDynamic {


	 //Array
    private int[] a; 
  
    
     /*
      * Constructor
      * int array is copied into a1
      */
    public MyArrayListDynamic(int [] a1)
    {
    
    	a = new int[a1.length];
    	for(int i=0;i<a1.length;i++)
    	{
    		a[i] = a1[i];
    	}
    	
    }
      

      //updates the value of an index in the array 
	public void update(int index, int value)
	   {
	      a[index] = value;
	     
	   }

	   // adds a value the the array
	   public void add(int value)
	   {
	      int[] temp = new int[a.length+1];
	      for (int i=0;i<a.length;i++)
	        temp[i] = a[i];
	      temp[a.length] = value;
	      a = temp;
	   }
	   
	   // inserts a value in the an index of the array
	   public void insert(int index, int value)
	   {
	       int[] temp = new int[a.length+1];
	       for(int i=0;i<index;i++)
	         temp[i] = a[i];
	       temp[index] = value;
	       for(int i=index;i<a.length;i++)
	         temp[i+1] = a[i];
	       a = temp;
	   }
	   
	   //deletes the value in an index
	   public void delete(int index)
	   {
	       int[] temp = new int[a.length-1];
	       for(int i=0;i<index;i++)
	         temp[i] = a[i];
	       for(int i=index+1;i<a.length;i++)
	         temp[i-1] = a[i];
	       a = temp;
	   }
	   
	   // prints out content of array
	   public void print()
	   {
	      for(int i=0;i<a.length;i++)
	        System.out.println("array["+i+"]: "+a[i]);  
	   }
	   // sorts the array using bubblesort method 
	   public void bubbleSort()
	   {
	      int lastPos;     // Position of last element to compare
	      int index;       // Index of an element to compare
	      int temp;        // Used to swap to elements
	      
	      // The outer loop positions lastPos at the last element
	      // to compare during each pass through the array. Initially
	      // lastPos is the index of the last element in the array.
	      // During each iteration, it is decreased by one.
	      for (lastPos = a.length - 1; lastPos >= 0; lastPos--)
	      {
	         // The inner loop steps through the array, comparing
	         // each element with its neighbor. All of the elements
	         // from index 0 thrugh lastPos are involved in the
	         // comparison. If two elements are out of order, they
	         // are swapped.
	         for (index = 0; index <= lastPos - 1; index++)
	         {
	            // Compare an element with its neighbor.
	            if (a[index] > a[index + 1])
	            {
	               // Swap the two elements.
	               temp = a[index];
	               a[index] = a[index + 1];
	               a[index + 1] = temp;
	            }
	         }
	      }
	   }


}
