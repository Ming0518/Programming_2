/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.list;

/**
 *
 * @author user
 */
import java.util.Vector;
public class TestVector {
    public static void main(String[] args) {
    Vector vector = new Vector();
    
    System.out.println("Before adding elements:");
	 System.out.println("Capacity = "+vector.capacity());
	 System.out.println("Size = "+vector.size());
	 vector.addElement(1);
	 vector.addElement(2);
        vector.addElement(3);
	 vector.insertElementAt(4,1);
	 System.out.println("After adding elements:");
	 System.out.println("Capacity = "+vector.capacity());
	 System.out.println("Size = "+vector.size());
 
         
    }
}
