package lab8;

import java.util.Scanner;

public class Average 
{
	/*
	 Attributes
	 created array to contain 5 scores
	 */
	private int[] data = new int[5];
	private double mean;
	
 
	  // the constructor
	public Average()
	{
		// Creates scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 5 Scores:");
		
		
		// Loops through array and stores user input inside array.
	for (int index = 0; index < data.length; index++ )
		data[index] = keyboard.nextInt();
	
	 
	 selectionSort(data); // calls sorting method.
	 calculateMean(); 	  // calls method to calc. mean.
	  
	}
	
	
	// method to calculate mean.
	public void calculateMean()
	{
	   double total = 0; //running total.
	   // Loops through array and calculates the mean. 
	  for(int index = 0; index < data.length; index++)
		{
		  
		  total += data[index]; // adds element of array to total. 
	  	  mean = total/data.length;	 
		}
	}

	//method that returns state of object.
    public String toString()
    {
    	//stores output of string into str
    	String str = "Scores in descending order: " + data[0] + " "
    												+ data[1] + " "
    												+ data[2] + " "
    												+ data[3] + " "
    												+ data[4] + "\n"
    			   + "Mean: " + mean;								
    											
    			
    	return str;
    	
    }
    
    // selection sorting method
    public static void selectionSort(int[] array)
    {
    	
    	int startScan, index, minIndex, minValue;

    	// mother loop that steps through the elements in array 
        for (startScan = 0; startScan < (array.length-1); startScan++)
        {
           minIndex = startScan; //first element 
           minValue = array[startScan]; // minvalue in array is set equal to first element
           
           // nested loop that starts at second element 
           for(index = startScan + 1; index < array.length; index++) 
           {
        	   /*
        	    compares first element to each element in array till
        	    it finds the largest element
        	   */
        	  if (array[index] > minValue)
              {
                 minValue = array[index];
                 minIndex = index;
              }
           }
           // swaps the elements
           array[minIndex] = array[startScan];
           array[startScan] = minValue;
    	
    	
    	
        }

    }
    
}
