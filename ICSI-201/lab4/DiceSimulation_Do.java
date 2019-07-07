package lab4;
import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/

public class DiceSimulation_Do
{
   public static void main(String[] args)
   {
      final int NUMBER = 10000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      Random generator = new Random();

      int die1Value;       // Value of the first die
      int die2Value;       // Value of the second die
      int count = 0;       // Total number of dice rolls
      int snakeEyes = 0;   // Number of snake eyes rolls
      int twos = 0;        // Number of double two rolls
      int threes = 0;      // Number of double three rolls
      int fours = 0;       // Number of double four rolls
      int fives = 0;       // Number of double five rolls
      int sixes = 0;       // Number of double six rolls

      // TASK #1 Enter your code for the algorithm here
      // Display the results
 
      //do while loop.. executes statements inside brackets first then executes the loop
     do
     {
       count++;
      
      die1Value = generator.nextInt(7); // random number generated and assigned to var. die1
      die2Value = generator.nextInt(7); // random number generated and assigned to var. die2
     
       
      if(die1Value == 1 && die2Value ==1)       //if die1 and die2 equal 1 increment snakeEyes
        snakeEyes++;
      else if(die1Value ==2 && die2Value ==2)   //if die1 and die2 equal 2 increment twos
        twos++; 
      else if(die1Value ==3 && die2Value ==3)   //if die1 and die2 equal 3 increment threes
        threes++;
      else if(die1Value ==4 && die2Value ==4)   //if die1 and die2 equal 4 increment fours
        fours++;
      else if(die1Value ==5 && die2Value ==5)   //if die1 and die2 equal 5 increment fives
        fives++;
      else if(die1Value ==6 && die2Value ==6)   //if die1 and die2 equal 6 increment sixes
        sixes++;
  
      } while(count < NUMBER); // simulates rolling dice 10000 times 
     
     
      System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");
      System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fours " +
                          fours + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fives " +
                          fives + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double sixes " +
                          sixes + " out of " + count +
                          " rolls.");
    
   }
}