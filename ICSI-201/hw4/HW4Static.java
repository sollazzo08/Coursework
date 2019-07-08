package homework;

public class HW4Static
{
 
   public static void main(String[] args)
   {
     
  
     System.out.println("---------------------");    
     System.out.println("Initial Array");
     MyArrayListStatic.print();
     
     System.out.println("---------------------");    
     System.out.println("Update Array: Change value in index 2 to 7");
     MyArrayListStatic.uptdate(2, 7); //change value in index 
     MyArrayListStatic.print();
     
     System.out.println("---------------------");    
     System.out.println("Add value 3 to the end of the array");
     MyArrayListStatic.add(3); //Add value 3 to the end of the array
     MyArrayListStatic.print();
     
     System.out.println("---------------------");    
     System.out.println("Insert value 9 into index 3");
     MyArrayListStatic.insert(3,9); //Insert value 9 into index 3 
     MyArrayListStatic.print();
     
     System.out.println("---------------------");    
     System.out.println("Delete the value in index 3");
     MyArrayListStatic.delete(3); //Delete the value in index 3
     MyArrayListStatic.print();
     
   }

   
   
}