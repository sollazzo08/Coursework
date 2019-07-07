package project1;

import java.io.FileNotFoundException;
import java.io.IOException;

import inclass.ListException;
import inclass.ListIndexOutOfBoundsException;
/**
 * Demonstrates the use of array-based ADT list.
 * @author Michael Sollazzo
 */
public class ADTDriver {
	/**
	 * Tests the array-based ADT list.
	 * @param args A reference to a string array that can store command-line arguments
	 * @param args A reference to the path of the file shoppingList.txt
	 * @throws ListException If size() == 0
	 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	 * @throws FileNotFoundException if a file is not found
	 */
	public static void main(String[] args) throws ListIndexOutOfBoundsException, ListException, IOException {
		
			ADTBagUtility.start(args[0]);

	}
}