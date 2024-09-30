
package ming.project2;
import java.util.*;
public class payment_ticket {
    
 static Scanner scan = new Scanner(System.in);

   int paymentMethod;
    
   public void paymentMethod() {

   System.out.println("___________________________________________________________________");
   System.out.println("Method payment available for Paradise Airline\n"
                       +"Online banking (1)\n"
                       +"Debit card (2)");
   System.out.println("___________________________________________________________________");
   
   System.out.print("Please choose a method payment: ");
        paymentMethod = scan.nextInt();
            
            
            boolean check = true;
            
            while(check){
     switch (paymentMethod) {
         case 1:
             System.out.println("The passenger want to make the payment via Online banking");
             System.out.println("Transaction successful!");
             check = false;
             break;
         case 2:
             System.out.println("The passenger want to make the payment via Debit card");
             System.out.println("Transaction successful!");
             check = false;
             break;
         default:
             System.out.println("This method payment is not available! Transaction unsuccessful.");
             break;
     }
            }
    
   } 
}