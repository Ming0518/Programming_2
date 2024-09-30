
package ming.modifiertest;

public class Cubes extends Rectangle {
  private double height;
  public Cubes (double L, double W, double H) {
	super(L,W);
	height = H;
  }
  public double areaOfCubes()  {
    return areaOfRectangle() * height;
  }
  public void display(){
    System.out.println("Length = " + getLength() + " Width = " + width); } 
} //Cubes
