
package ming.testinheritance;

public class Rectangle {
   private double length;
   private double width;
     
   public Rectangle(double L, double W)  {
       length = L;
       width = W;
   }
   public double getLength() {
       return length;
   }
   public double getWidth() {
       return width;
   }
   
   public double area() {
       return length * width;
   }
   
   public String toString() {
     return ("length = " + length  + "\nwidth = " + width);
   }

} // end for Rectangle class

