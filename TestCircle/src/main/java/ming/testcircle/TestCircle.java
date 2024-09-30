package ming.testcircle;
public class TestCircle {
    public static void main(String[] args) {
            Circle circle1 = new Circle();
        System.out.println("Circle 1: Radius="+circle1.radius +"  Area= "+circle1.getArea());
        System.out.println("Number of Circle objects: " + Circle.numberOfObjects);      
        
            Circle circle2 = new Circle(2.5);  
        System.out.println("Circle 2: Radius="+circle2.radius +"  Area= "+circle2.getArea());
        System.out.println("Number of Circle objects: " + Circle.numberOfObjects);
        System.out.println("Number of Circle objects: " + Circle.getNumberOfObjects());
        
            Circle circle3 = new Circle();  
        System.out.println("Circle 3: Radius="+circle3.radius +"  Area= "+circle3.getArea());
        System.out.println("Number of Circle objects: " + Circle.numberOfObjects);
        System.out.println("Number of Circle objects: " + Circle.getNumberOfObjects());
    }
}

class Circle {
    double radius=1.0;
    static int numberOfObjects;
    Circle(){
      numberOfObjects++;
    }
    Circle(double newRadius){
        radius=newRadius;
        numberOfObjects++;
    }
double getArea(){
       return Math.pow(radius,2)*Math.PI;
    }
static int getNumberOfObjects(){
        return numberOfObjects;
    }
}//end class
