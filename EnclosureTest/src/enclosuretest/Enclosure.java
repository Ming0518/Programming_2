package enclosuretest;


public interface Enclosure {
  public double perimeter();
  public double area();
}

class Circle implements Enclosure {
  double radius;
  
  Circle(double radius) {
    this.radius = radius;
  }
  
  public double perimeter(){
      return 2 * Math.PI * radius;
  }
  
  public double area(){
      return Math.PI * radius * radius;
  }
 }

class Square implements Enclosure{
  double width;
  
  Square(double width) {
    this.width = width;
  }
  
 public double perimeter(){
      return 4 * width;
  }
 
  public double area(){
      return width * width;
  }
 }