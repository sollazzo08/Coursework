package project1;

import java.io.*;
import java.util.Scanner;

import inclass.ListException;
import inclass.ListIndexOutOfBoundsException;
/**
 * Contains helper methods the array-based ADT list. 
 * @author Michael Sollazzo
 */
public class ADTBagUtility {
		/**
		* Creates a bag of items, and change items in the bag, and displays items. 
		* @param filename a text file with data of the bag
		* @throws ListException 
		* @throws ListIndexOutOfBoundsException 
		* @throws IOException
	    */
	
		public static void start(String fileName) throws ListIndexOutOfBoundsException, ListException, IOException{
		ADTBagArrayBased bag = new ADTBagArrayBased();
		
		fillList(bag, fileName);
	
		//Removes an item at random
		bag.removeRandom();
		
		//Removes last item
		bag.removeLast();
		
		//Empties bag
		//bag.makeEmpty();
		
		displayList(bag);
		
		}
	
		/**
		 * Stores items into a bag.
		 * @param list A reference to a bag
		 * @param fileName a text file with data of the bag
		 * @throws IOException 
		 * @throws ListException 
		 * @throws ListIndexOutOfBoundsException 
		 */
		
		public static void fillList(ADTBagArrayBased list, String fileName) throws IOException, ListIndexOutOfBoundsException, ListException{ 
		
			Scanner input = new Scanner(new File(fileName));

			while(input.hasNextLine()){
			//adds item into bag 
			list.insert(input.nextLine()); 		
		    }
			input.close();
			
		}
		/**
		 * Displays items in the bag.
		 * @param list A reference to a bag
		 * @throws ListException 
		 * @throws ListIndexOutOfBoundsException 
		 */
		public static void displayList(ADTBagArrayBased list) throws ListIndexOutOfBoundsException, ListException{ 
			 for(int i = 0; i < list.size(); i++){
				   System.out.println(list.get(i));
			 }
		}
		}
	
