package homework;
import java.util.Random;
import java.util.Scanner;

/*
 * This program allows the user to play a numbers guessing game 
 * with the computer and outputs the difference between the users
 * guess and the computers guess
 */

public class NumberGuessingGame
  
{
  public static void main(String[] args)
  {
	  
  
   Scanner keyboard = new Scanner(System.in);  // Scanner object created, to read in input   
   Random generator = new Random();            // Random object created, to generate random numbers 
   int comp_guess = generator.nextInt(11) +1;  // Random number is assigned to comp_guess between 1 and 10 
   int user_guess;							   // user guess variable 			
   String input; 							   // Holds user input 
   char repeat;                 			   // holds character 
   int difference;							

   
   // do while- loops, prompts user to play again
   do{
   
    System.out.println("Welcome to the Number Guessing Game");
    System.out.println("It's simple, Try and guess a number between 1 and 10(included).");
    System.out.println("If you can guess my number then you win!");
    System.out.print("Enter your number here:");
      user_guess = keyboard.nextInt();         // reads in users guess
      difference = (user_guess - comp_guess); // calculates difference between user and comp guess 
      
      /*
       * compares user guess and comp guess 
       * if they are equal user wins 
       * if they are not equal then you lose and
       * difference between two guess is calculated and shown 
       */
      
      if ( user_guess == comp_guess)           
    System.out.println("YOU WIN");
      else {
    System.out.print("YOU LOSE\nYou were off by ");
    // abs value method is used to make sure difference is always postive 
    System.out.println(Math.abs(difference) + ", my number was " + (comp_guess) + "."); ; 
    System.out.println("Would you like to play again (Y/N)?");
      }
   
      keyboard.nextLine();  // clears buffer 
      
      input = keyboard.nextLine();   // Input holds the string that is read in by Scanner object
      repeat = input.charAt(0); 	 // holds the converted string input to a character
   
   }while(repeat == 'Y' || repeat == 'y'); 
    
   System.out.println("Goodbye!");
   
  }
}