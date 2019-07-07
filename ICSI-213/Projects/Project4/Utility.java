package project4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import project1.ADTBagArrayBased;
import project2.LinkedString;
import project2.ListException;
import project2.ListIndexOutOfBoundsException;
/**
 * Helper class for the driver program
 * @author michael
 *
 */
public class Utility {

	/**
	 *  Tests the binary search tree using methods from the BinarySearchTree.java class 
	 * @throws IOException 
	 */
	public static void start() throws IOException {
		
		
		ArrayList<PersonRecord> list = new ArrayList<PersonRecord>();
		createList(list);
		AddressBook<PersonRecord> addressbook = new AddressBook<PersonRecord>(list);
		
		System.out.println("Retrieve a record");
		PersonRecord p = new PersonRecord("JamesButt"); 
		System.out.println(addressbook.retrieve(p)); 
		
		
		System.out.println("Add a record");
		Address ab = new Address("67 Washington dr ", "Highland Mills", "NY", "10930");         
		PersonRecord newPerson = new PersonRecord("JeffStewart", ab, "845-238-8756"); 
		addressbook.add(newPerson); 	
		
		System.out.println("Search for the added record:");
		p = new PersonRecord("JeffStewart"); //creates a PersonRecord with just a name to use for searching
		if (addressbook.search(p)){
			System.out.println("record added successfully!"); //prints a message if the record is found
		}
	}
	
	
	/**
	 * Reads the file and tokenizes the string
	 * @throws IOException 
	 */
	public static void createList(ArrayList<PersonRecord> list) throws IOException{
		
		
		FileReader fr = new FileReader("/Users/michael/eclipse-workspace/DataStructures/src/project4/PersonRecords.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		String[] tokens = new String[6];
		String name;
		Address address;
		String phoneNumber;
		
		while((line = br.readLine())!= null){
		tokens = line.split(",");		
		name = tokens[0];
		address = new Address(tokens[1],tokens[2],tokens[3],tokens[4]);
		phoneNumber = tokens[5];
		list.add(new PersonRecord(name, address, phoneNumber));
		}
		
		br.close();
		fr.close();
		
		
		
		
	}


	
}
