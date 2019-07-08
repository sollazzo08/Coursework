package ExtraLab;

import java.io.*;

public class ReadAFile
{
  public static void main(String[] args) throws FileNotFoundException, IOException
  {
    // 1. opening the file for reading
    FileReader f = new FileReader("Grades.txt");
    BufferedReader in = new BufferedReader(f);
    
    // 2. reading lines of text from the file
    String line = in.readLine();  
    while (line != null) 
    {
      System.out.println(line); 
      line = in.readLine();
    }
    
    // 3. closing the file
    f.close(); 
  }
  
}
