/*
 Michael Sollazzo 
 Lab Section Friday-8:15 Ashish Agarwala
 Homework #1
 Task #2
 
 This program takes in command line arugments Alice Bob Carol and
 reverses the order to print on screen
*/

public class UseThree
{  
  public static void main(String[] args){
   
    System.out.print("Hi, "); 
    System.out.print(args[2] + " " + args[1] + " " + args[0]);  //arrays used to pass in arugments, arranged in reverse 
    System.out.println(". How are you?");                       //order  
                                                                 
  }
}