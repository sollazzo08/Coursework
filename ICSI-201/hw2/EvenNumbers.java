package homework;

/*
 * This program uses the command-line arguments to determine the amount of even numbers between
 * the range of two numbers 
 */

public class EvenNumbers
{
  public static void main(String[] args)
  {
    
      int x = Integer.parseInt(args[0]);  // Initializing x to array args element 0 and 
      int y = Integer.parseInt(args[1]);  //  y to element 1,also changes data type from string to Int                               
     // if user enters the correct input 
     // if first input is less then second input, 
     // then execute statement inside if statement  
   
    if(x<y)
    {
      for(int i = x; i <= y; i++)  // loops through the range of (first input - second input)
        if(i % 2 == 0)			   // checks if the integer is an even numbers, if so then prints it out 
        {
          System.out.println(i);
        }
    }
    else
    {
      System.out.println("Invalid Input."); // if first input entered is larger than second input then execute else statement 
    }
      
      
   }
}
 