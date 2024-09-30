package ming.project;
import java.util.*;
public class payment_ticket {
    
 static Scanner scan = new Scanner(System.in);

   double paymentMethod;
   
   public payment_ticket(double payMethod) {
      paymentMethod = payMethod;
   }
      
   void paymentMethod() {
   int paymentMethod;
   System.out.println("Method payment available for Paradise Airline\n"
                       +"Online banking (1)\n"
                       +"Debit card (2)");
   System.out.print("Please choose a method payment: ");
   paymentMethod = scan.nextInt();
      if(paymentMethod == 1){
         System.out.println("The passenger want to make the payment via" + paymentMethod);
         System.out.println("Transaction successful!");
      }
      else if(paymentMethod == 2){
         System.out.println("The passenger want to make the payment via" + paymentMethod);
         System.out.println("Transaction successful!");
      }
      else{
         System.out.println("This method payment is not available! Transaction unsuccessful.");
      }
    
   } 
}