package homework;

public class MyArrayListStatic {
	
	 //Array
    private static int[] a = {2,8,5,4,6};   //cant change its static fixed 
	  
    
  //updates the value of an index in the array 
	   public static void uptdate(int index, int value)
	   {
	      a[index] = value;
	     
	   }

	   
	// adds a value the the array
	   public static void add(int value)
	   {
	      int[] temp = new int[a.length+1];
	      for (int i=0;i<a.length;i++)
	        temp[i] = a[i];
	      temp[a.length] = value;
	      a = temp;
	   }
	   
	   
	// inserts a value in the an index of the array
	   public static void insert(int index, int value)
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
	   public static void delete(int index)
	   {
	       int[] temp = new int[a.length-1];
	       for(int i=0;i<index;i++)
	         temp[i] = a[i];
	       for(int i=index+1;i<a.length;i++)
	         temp[i-1] = a[i];
	       a = temp;
	   }
	   
	   
	// prints out content of array
	   public static void print()
	   {
	      for(int i=0;i<a.length;i++)
	        System.out.println("array["+i+"]: "+a[i]);  
	   }
	
	


}
