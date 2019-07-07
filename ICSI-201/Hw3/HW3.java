/*
 Michael Sollazzo
 Lab Section Fri-8:15, Ashish
 Homework #3 Methods and Objects
 
 This program uses the classes Rectangle and Points to find the area of a 
 rectangle, coordinates, and shrink. 
 
 */


package homework;

import java.awt.Rectangle;

import javax.swing.Box;

import java.awt.Point;

public class HW3
{
  
   public static void main(String[] args)
   { 
        //Creates a rectangle with top left hand point at location 0,0.
        // and width=100 and height=200
        Rectangle box = new Rectangle(0,0,100,200);
        
         
        //TASK #1 - Object as an input parameter 
        System.out.println("Task #1, AREA is: " + getArea(box) );
     
        //TASK #2 - Object as a return type
        Point[] pts = getPoints(box);
        if (pts != null)
        {
          System.out.println("Task #2, Lower Left Point is: " + pts[0] );
          System.out.println("Task #2, Top Left Point is: " + pts[1] );
          System.out.println("Task #2, Top Right Point is: " + pts[2] );
          System.out.println("Task #2, Lower Right Point is: " + pts[3] );
        }
        else
          System.out.println("Task #2, the Rectangle points are unknown");
        
        //Task #3 - Mutable Object
        int old_width = box.width;
        int old_height = box.height;
        shrink(box);
        System.out.println("Task #3, width changed from " + old_width + " to " + box.width);
        System.out.println("Task #3, height changed from " + old_height + " to " + box.height);
        
        //Task #4 - Aliasing
        Rectangle new_box = copy_and_shrink(box);
        System.out.println("Task #4, the area of the old box is: " + getArea(box) );
        System.out.println("Task #4, the area of the new box is: "+ getArea(new_box) );
        
   }
  
   //TASK #1 - Object as an input parameter
   //        - Complete the method to calculate the area of a rectangle.
   public static double getArea(Rectangle rect)
   {
       //-----YOUR TASK #1 CODE GOES HERE!-----
	   double area = (rect.width)*(rect.height);
	   
	   
       return area; //Do not forget to change the return value
   }
   
   //TASK #2 - Object as a return type
   //        - Complete the method to return all four points that define the rectangle
   public static Point[] getPoints(Rectangle rect)
   {
    Point[] pts = new Point[4];
    pts[0] = new Point(rect.x,rect.y - rect.height); // Assigning the first point (lower left point pt0)
    //-----YOUR TASK #2 CODE GOES HERE!-----
    
    pts[1] = new Point(rect.x,rect.y);
    pts[2] = new Point(rect.x + rect.width, rect.y);
    pts[3] = new Point(rect.x + rect.width, rect.y - rect.height);
    
     return pts; //Do not forget to change the return value
   }
   
   //TASK #3 - Mutable Object  (notice that we do not need to return the object)
   public static void shrink(Rectangle rect)
   {
       //-----YOUR TASK #3 CODE GOES HERE!-----   
	   
	   rect.setSize(rect.width/2, rect.height/2);
      //Notice - we do not have to return anything!
   }
   
   //TASK #4 - Object Aliasing
   public static Rectangle copy_and_shrink(Rectangle original_rectangle)
   {
	   Rectangle new_rectangle = new Rectangle(original_rectangle);
      //-----YOUR TASK #4 CODE GOES HERE!-----
	   
      new_rectangle.setSize(new_rectangle.width/2, new_rectangle.height/2);
  
     return new_rectangle;

      //Do not forget to change the return value
   }
   
}
