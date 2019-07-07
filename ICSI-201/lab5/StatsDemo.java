package lab5;
import java.io.BufferedReader; 

import java.util.Scanner;

//TASK #1 Add the file I/O import statement here
import java.io.*;
/**
This class reads numbers from a file, calculates the
mean and standard deviation, and writes the results
to a file.
*/

public class StatsDemo
{
// TASK #1 Add the throws clause
	
		
public static void main(String[] args) throws IOException
{
   double numValue;
   double sum = 0;      // The sum of the numbers
   int count = 0;       // The number of numbers added
   double mean = 0;     // The average of the numbers
   double stdDev = 0;   // The standard deviation
   String line;         // To hold a line from the file
   double difference;   // The value and mean difference
   double variance;		//value of sum divided by count, used to find StdDev

   // Create an object of type Scanner
   Scanner keyboard = new Scanner (System.in);
   String fileName;     // The user input file name

   // Prompt the user and read in the file name
 
   System.out.println("This program calculates " +
                      "statistics on a file " +
                      "containing a series of numbers");
   System.out.print("Enter the file name:  ");
   fileName = keyboard.nextLine();
  

   // ADD LINES FOR TASK #2 HERE
   // Create a FileReader object passing it the filename
   // Create a BufferedReader object passing FileReader
   // object
   // Perform a priming read to read the first line of
   // the file
   // Loop until you are at the end of the file
   // Convert the line to a double value and add the
   // value to sum
   // Increment the counter
   // Read a new line from the file
   // Close the input file
   // Store the calculated mean
  
   
   FileReader file = new FileReader("Numbers.txt");            
   BufferedReader br = new BufferedReader(file);
   
   
   while((line = br.readLine())!= null)
   {
	   numValue = Double.parseDouble(line);
	   sum = (sum + numValue);
	   //System.out.println(line);
	   count++;
   }
  
   mean = (sum/count);
   br.close();
  
 

   // ADD LINES FOR TASK #3 HERE
   // Reconnect FileReader object passing it the
   // filename
   // Reconnect BufferedReader object passing
   // FileReader object
   // Reinitialize the sum of the numbers
   // Reinitialize the number of numbers added
   // Perform a priming read to read the first line of
   // the file
   // Loop until you are at the end of the file
   // Convert the line into a double value and
   // subtract the mean
   // Add the square of the difference to the sum
   // Increment the counter
   // Read a new line from the file
   // Close the input file
   // Store the calculated standard deviation

   // ADD LINES FOR TASK #1 HERE
   // Create a FileWriter object using "Results.txt"
   // Create a PrintWriter object passing the
   // FileWriter object
   // Print the results to the output file
   // Close the output file
  
  
  FileReader file2 = new FileReader("Numbers.txt");             // Create a FileReader object passing it the filename.
  BufferedReader br2 = new BufferedReader(file2);
  sum = 0;
  count = 0;

  while((line = br2.readLine())!= null)
  {    
	   difference = Double.parseDouble(line) - mean;
	   sum = sum + Math.pow(difference, 2);
	  
	   count++;
  }
  
  
  variance = (sum/count);
  stdDev = Math.sqrt(variance);
  System.out.printf("Mean: " + "%.3f\n", mean);
  System.out.printf("Standard Deviation: " + "%.3f\n",stdDev);
 br2.close();
 
 
 FileWriter fwriter = new FileWriter("Results.txt", true);
 PrintWriter outputFile = new PrintWriter(fwriter);
 outputFile.printf("%.3f\n", stdDev);
 outputFile.printf("%.3f\n", mean);
 outputFile.close();
  
}
}	
	
