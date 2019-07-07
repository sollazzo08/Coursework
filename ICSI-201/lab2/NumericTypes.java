package lab2;
// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

import java.util.Scanner;
import java.lang.String;


public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final double NUMBER = 2 ;               // Number of scores
      final int SCORE1 = 100;                 // First test score
      final int SCORE2 = 95;                  // Second test score
      final int BOILING_IN_F = 212;           // Boiling temperature
      int fToC;                               // Temperature Celsius
      double average;                         // Arithmetic average
      String output;                          // Line of output
      String Firstname, Lastname, fullName;   // TASK #2 declare variables used here
      char firstInitial;                      // TASK #3 declare variables used here
                                              // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (5 * (BOILING_IN_F - 32))/9;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      // Read the user's first name
      // Prompt the user for last name
      // Read the user's last name
      // Concatenate the user's first and last names
      // Print out the user's full name
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter your first name:");
      Firstname = keyboard.nextLine();
      System.out.print("Please enter your last name:");
      Lastname = keyboard.nextLine();
      fullName = Firstname + " " + Lastname;
      System.out.print(fullName);
      
 

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      // Print out the user's first initial
      // Convert the user's full name to uppercase
      // Print out the user's full name in uppercase
      
      
      int stringsize;
      firstInitial = Firstname.charAt(0);
      System.out.println(firstInitial);
      String upper = fullName.toUpperCase();
      System.out.println(upper);
      stringsize = fullName.length();
      System.out.println(stringsize);
      

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      // Read the diameterke
      
      // Calculate the radius
      // Calculate the e
      // Print out the volume
      
      double diameter, volume;
      double radius;
      System.out.print("Enter the diameter of a sphere: ");
      diameter = keyboard.nextDouble();
      System.out.print("The volume of the sphere is: ");
      radius = (diameter/2);
      volume = (4.0/3) * Math.PI * Math.pow(radius, 3);;
      System.out.print(volume);  
  
   }
}