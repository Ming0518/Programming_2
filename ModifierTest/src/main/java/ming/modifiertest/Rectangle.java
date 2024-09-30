package ming.modifiertest;

public class Rectangle {
  private double length;
  protected double width;
  public Rectangle(double L, double W){
    length = L;
    width = W;
  }
  public double areaOfRectangle(){
    return length * width;
  }
  public double getLength() {
    return length; }
} //Rectangle




