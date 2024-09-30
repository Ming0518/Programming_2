
package ming.testinheritance;

public class Box extends Rectangle
{
    private double height;
     
    public Box(double L, double W, double H){
       super(L,W);
       height = H;
    }
         public double getHeight(){
       return height;
    }
    public double area() {
       return  2  * ( getLength() * getWidth() + getLength() * height 
	+ getWidth() * height);
    } 
    public double volume() {
       return super.area() * height;
    }
    
    public String toString()  {
       return super.toString() + "\nheight = " + height;
    }

} // end for class Box extends
