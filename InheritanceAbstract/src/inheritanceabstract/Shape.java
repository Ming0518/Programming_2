package inheritanceabstract;

public abstract class Shape {
   public abstract double calculateArea();
}

class Triangle extends Shape {
    private double height,base;
    
    public Triangle(double h,double b){
        height = h;
        base = b;
    }
            
    public double calculateArea() {
       return (height *base)/2.0;
    }

} //end Triangle

class Rectangle extends Shape {
       private double width, length;
    
    public Rectangle(double w,double l){
        width = w;
        length = l;
    }
    public double calculateArea()  {
         return width * length;
}
} //end Rectangle