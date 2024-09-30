
package ming.testinheritance;

public class TestInheritance {
public static void main(String []a) {
	Rectangle objRec = new Rectangle (4, 5);
	Box objBox = new Box(5, 4, 2);
	
	System.out.println(objRec);
	System.out.println(" Area of Rectangle = " + objRec.area());

	System.out.println(objBox);
	System.out.println(" Area of Box = " + objBox.area());
	System.out.println(" Volume of Box = " + objBox.volume());
    }
}

