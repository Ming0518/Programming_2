package ming.exception_handling;


import java.util.*;

public class DivisionTest {
     
 public static void main (String [] args) throws Exception{
          
  int num=0, div=0, result,err=0;
  boolean keepGoing = true;
  
  Scanner input = new Scanner(System.in);
  
  while (keepGoing){
        try{
    System.out.print("Enter the numerator> ");        
        num = input.nextInt();
        
    System.out.print("Enter the divisor> ");        
        div = input.nextInt();
            if(div==0){
                err=1;
                throw new Exception("You can't divide by 0");  
            }
            err=0;
            keepGoing = false;
            }
        
        catch(InputMismatchException e){
           input.next();
            err=1;
            System.out.println("You entered bad data.\nPlease try again.");
                                        }
        catch (Exception e) {
                    System.out.println("Error: " + e.getMessage()); 
                }
        if(err!=1){
    result = num/div;
    System.out.println (num +" / " +div+ " = " + result); 
   }
  } 
 }
}

