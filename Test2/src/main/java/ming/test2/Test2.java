
package ming.test2;
import java.util.*;
public class Test2 {

    
    public static void main(String[] args) {
            System.out.println("**** Pizaa House ******\n") ;
    
    Scanner scan = new Scanner(System.in) ;
    
    System.out.print("Please enter the price of the meal : ") ;
    double price = scan.nextDouble() ;
    
    double tax = 0.0825 ;
    double salestax = price * tax ;
    
    System.out.print("\nPrice of meal : " + price ) ;
    
    System.out.printf("\nSales Tax : %.2f", salestax) ;
    
    System.out.println("\n----------------------") ;
    
    double amount = price + salestax ;
    System.out.printf("Total Amount : %.2f\n",  amount) ;
    
    System.out.print("\nEnter amount tendered : RM") ;
    double tendered = scan.nextDouble() ;
    
    System.out.println("\nAmount tendered : RM" + tendered) ;
    
    System.out.printf("Total Amount : %.2f",  amount) ;
    
    System.out.println("----------------------") ;
    
    double change = tendered - amount ;
    System.out.printf("Change Cash: RM%.2f\n", change) ;
 
    System.out.println("\n**** Thank You******") ;
    

  }

}//end of class Test


