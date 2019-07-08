package homework;

public class HW4
{
 
   public static void main(String[] args)
   {
     
     //Array
     int[] a = {2,8,5,4,6};      
  
     System.out.println("---------------------");    
     System.out.println("Initial Array");
     System.out.println(a.length);
     print(a);
     
     System.out.println("---------------------");    
     System.out.println("Delete the value in index 3");
     a = delete(a,3); //Delete the value in index 3
     print(a);
     
     System.out.println("---------------------");    
     System.out.println("Update Array: Change value in index 2 to 7");
     a = update(a, 2, 7); //Change value in index 2 changes from 5 to 7
     print(a);
     
     System.out.println("---------------------");    
     System.out.println("Add value 3 to the end of the array");
     a = add(a,3); //Add value 3 to the end of the array
     print(a);
     
     System.out.println("---------------------");    
     System.out.println("Insert value 9 into index 3");
     a = insert(a,3,9); //Insert value 9 into index 3 
     print(a);
     
    
     
     
   }

   
   
   public static int[] update(int[] array, int index, int value)
   {
      array[index] = value;
      return array;
   }

   
   public static int[] add(int[] array, int value)
   {
	   
      int[] temp = new int[array.length+1];
      	for (int i=0;i<array.length;i++)
        temp[i] = array[i]; //copys array into temp array 
      temp[array.length] = value;
      return temp;
   }
   
   public static int[] insert(int[] array, int index, int value)
   {
       int[] temp = new int[array.length+1];
       for(int i=0;i<index;i++)
         temp[i] = array[i];
       temp[index] = value;
       for(int i=index;i<array.length;i++)
         temp[i+1] = array[i];
       return temp;
   }
   
   public static int[] delete(int[] array, int index)
   {
       int[] temp = new int[array.length-1];
       for(int i=0;i<index;i++)
         temp[i] = array[i]; // copy the array into temp array 
       for(int i=index+1;i<array.length;i++)
         temp[i-1] = array[i];
       return temp;
   }
   
   public static void print(int[] array)
   {
      for(int i=0;i<array.length;i++)
        System.out.println("array["+i+"]: "+array[i]);  
   }
   
}
