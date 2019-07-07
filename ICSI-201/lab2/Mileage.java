package lab2;
/* Michael Sollazzo 
   September 19th
  
   This Program calculates the Miles per gallon for the user.
*/
import java.lang.String;
import java.util.Scanner;


public class Mileage
{
  public static void main(String[] args)
  {
    double MilesDriven, GasUsed, MilesPerGallon; // variables
    System.out.println("This program will calculate mileage.");
    
    Scanner keyboard = new Scanner(System.in); // needed for user input 
    System.out.print("How many miles driven: "); // prompt user for miles
    MilesDriven = keyboard.nextDouble(); // returns input as double 
    System.out.print("How many gallones used: ");//prompt user for gallons 
    GasUsed = keyboard.nextDouble();
    MilesPerGallon = (MilesDriven/GasUsed); // miles per gallon formula 
    System.out.print("Miles per gallon: " + MilesPerGallon); // MPG output 
    
  }
}