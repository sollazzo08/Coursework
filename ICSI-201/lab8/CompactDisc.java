package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompactDisc
{
   public static void main(String[] args)throws IOException
   {
	   
	  //Creates FileReader object to read in data from a file
      FileReader file = new FileReader("Classics.txt");
      BufferedReader input = new BufferedReader(file);
      String title;
      String artist;

      // ADD LINES FOR TASK #3 HERE
      // Declare an array of Song objects, called cd,
      // with a size of 6
      
      Song[] cd = new Song[6];


      for (int i = 0; i < cd.length; i++)
      {
         title = input.readLine();
         artist = input.readLine();

         // ADD LINES FOR TASK #3 HERE
         // Fill the array by creating a new song with
         // the title and artist and storing it in the
         // appropriate position in the array
        
     cd[i] = new Song(title,artist); //uses constructor to fill the area with classic.txt data
         
      }

      System.out.println("Contents of Classics:\n");
      for (int i = 0; i < cd.length; i++)
      {
         // ADD LINES FOR TASK #3 HERE
         // Print the contents of the array to the console
    	  
    	  // outputs the current state of the object 
    	  System.out.println(cd[i].toString()); 
      }
      
      
      input.close();
      file.close();
   }
   
}
