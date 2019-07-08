package homework;
import java.util.Scanner;

/* 
 * This program prompts user to enter a positive number, then 
 * tells you whether the number is odd or even 
 */

public class OddorEven
{
  public static void main(String[] args)
  {
    
   
  Scanner keyboard = new Scanner (System.in); // Scanner object created to read in input 
  int user_input;						      // user input for integers 		
  System.out.println("Please enter a postive integer:");
  user_input = keyboard.nextInt();
   if(user_input % 2 == 0)
      System.out.println("Your number is even\n");
   else if(user_input < 0)
      System.out.print("goodbye");
   else  
      System.out.println("Your number is odd\n");
  
 while(user_input > 0)  // while user enters a positive number, run loop
 {
 System.out.println("Please enter a postive integer:");
  user_input = keyboard.nextInt();  // reads in user input 
   if(user_input % 2 == 0)          // if user input is even then print out even 
      System.out.println("Your number is even\n");
   else if(user_input < 0) 			// if user input is negative then end program 
      System.out.print("goodbye!");
   else  							// is user input is odd the print out odd 
      System.out.println("Your number is odd\n");

    }
 
  }

}