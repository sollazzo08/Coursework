
/*
 Michael Sollazzo 
 Lab Section Friday-8:15 Ashish Agarwala
 Homework #1
 Task #3
 
 This program takes two double command line arugments wind speed
 and temperture, then it prints out the wind chill. 
 */

public class WindChill
{
  public static void main(String[] args)
  {
    
  double t=Double.parseDouble(args[0]); // double variables assigned to array "args" at postion 0 and 1
  double v=Double.parseDouble(args[1]);
  double windSpeed = (35.74 + 0.6215* t ) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);// equation for Windchill 
  System.out.printf("Windchill: %.2f", windSpeed); //precsion to the 2 decimal places 
  System.out.print("¡F\n");
  }
}

  
  
 
    
  
  