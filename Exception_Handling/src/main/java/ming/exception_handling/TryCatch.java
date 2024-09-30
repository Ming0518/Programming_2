package ming.exception_handling;

import java.util.*;
public class TryCatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int  num = 0, err=0;
try {
   System.out.print("Enter an integer ");
	num = scan.nextInt();

} 
catch (InputMismatchException e){

  System.out.println("Invalid input! Please enter digits only");
  err=1;
  System.out.println(e.getMessage());
	e.printStackTrace();
}

if(err!=1)
System.out.println("The number you entered is " + num);

    }
}
