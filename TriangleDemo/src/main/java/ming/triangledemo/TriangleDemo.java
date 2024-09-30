package ming.triangledemo;

import java.util.*;
public class TriangleDemo
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner scan = new Scanner(System.in);
        
      // Create a Triangle object.
      
      Triangle T2 = new Triangle ();
        
      // Prompt user to input value for height and base   
      double height,base;
      
      System.out.print("Enter height of pyramid: ");
        height = scan.nextDouble();
      System.out.print("Enter base of pyramid: ");
        base = scan.nextDouble();      
        
      //Set the height and base (use mutator) 
      T2.setHeight(height);
      T2.setBase(base);
              
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "+ T2.getHeight());
      System.out.println("The pyramid's base is " + T2.getBase());
      System.out.println("The pyramid's area is " + T2.getArea());
      
   }
}

