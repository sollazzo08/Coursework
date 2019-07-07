package project2;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Helper class for the driver program
 */
public class LinkedStringUtility {

	 /**	
	 *  Tests the reference-based doubly linked list.
	 * @param Filename a text file with data
	 * @throws FileNotFoundException
	 */
	
	public static void start() throws FileNotFoundException, ListException, ListIndexOutOfBoundsException{
		
		//Creates an array list that stores doubly linked lists
		ArrayList<LinkedString> stringList = new ArrayList<LinkedString>();
			
		
		createList(stringList);
	
		displayList(stringList);
	
	}	
	
	/**
	 * Creates a list of LinkedString objects
	 * @param stringLists a reference to the doubly linked lists
	 * @param file a text file with data 
	 * @throws FileNotFoundException
	 */
	
	public static void createList(ArrayList<LinkedString> stringLists)throws FileNotFoundException, ListException, ListIndexOutOfBoundsException {
		
		File f = new File("/Users/michael/eclipse-workspace/DataStructures/src/project2/stringList.txt");
		Scanner input = new Scanner(f);
		
		int i = 0;
		while(input.hasNext()) {
			
			//Here is where I add the character input from file to form a doubly linked list 
			stringLists.add(i, new LinkedString(input.next()));
			i++;
		}
		input.close();	
	}	
	
	/**
	 * Displays data in order
	 * @param stringList a reference to the doubly linked lists
	 * @throws FileNotFoundException 
	 */
	
	public static void displayList(ArrayList<LinkedString> stringList) throws  ListIndexOutOfBoundsException, ListException {
		
		 //The linked strings inside the array list
		 LinkedString lk1 = stringList.get(0);
	     LinkedString lk2 = stringList.get(1);
	     stringList.add(2, stringList.get(0));
	     LinkedString lk3 =stringList.get(2);
	    
	     System.out.println("Below are the linked string objects(only 2) stored in the array list in order and lengths: ");
	     System.out.print(lk1);
	     System.out.println(" with length of " + lk1.length() + ".");
	     System.out.print(lk2);
	     System.out.println(" with length of " + lk2.length() + ".");
	     LinkedString w = lk3.concat(lk2);
	 	 System.out.println();
	 	 System.out.println("Below are the two doubly string linked strings concatenated together: ");
	 	 System.out.print(w);
		 System.out.println(" with length of " + w.length() + ".");
		 System.out.println();
		 System.out.println("Below is the last letter from each of the linked list:");
		 System.out.println("Char at position 4: " + lk1.charAt(4));
		 System.out.println("Original String: " + lk1);
		 System.out.println("Char are position 3: " + lk2.charAt(3));
		 System.out.println("Original String: " + lk2);
		 System.out.println();
		 System.out.println("Below are substrings of the linked strings:");
		 System.out.println("Substring of Hellomike from 2 to 4: " + lk1.subString(2, 4));
		 System.out.println("Original string: " + lk1);
		 System.out.println("Substring of Mike from 0 to 2: " + lk2.subString(0, 2));
		 System.out.println("Original string: " + lk2);
		 
	}
}
