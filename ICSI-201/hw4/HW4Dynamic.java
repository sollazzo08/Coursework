package homework;

public class HW4Dynamic {


 
   public static void main(String[] args)
   {
	   // array 
	   int[] a = {2,8,5,4,6};  
	   // created object list
	   MyArrayListDynamic list = new MyArrayListDynamic (a);
  
     System.out.println("---------------------");    
     System.out.println("Initial Array");
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Update Array: Change value in index 2 to 7");
     list.update(2,7); // change value in index 2
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Add value 3 to the end of the array");
     list.add(3); //Add value 3 to the end of the array
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Insert value 9 into index 3");
     list.insert(3,9); //Insert value 9 into index 3 
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Delete the value in index 3");
     list.delete(3); //Delete the value in index 3
     list.print();
     
     
     System.out.println("---------------------");    
     System.out.println("Sorting the array using BubbleSort");
     list.bubbleSort();  // sorts array in order 
     list.print();
   }

   
   
}