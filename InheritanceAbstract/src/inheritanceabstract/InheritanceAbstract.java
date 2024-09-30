package inheritanceabstract;

public class InheritanceAbstract {
public static void main(String[] args) {
        Rectangle rec  = new Rectangle (4.0,3.0);
        Triangle tri  = new Triangle(2.0,4.0);
       
        System.out.println(rec.calculateArea()); 
        System.out.println(tri.calculateArea());  
    }
}  // end Test