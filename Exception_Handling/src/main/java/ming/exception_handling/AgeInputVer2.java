package ming.exception_handling;


import java.util.*;
    public class AgeInputVer2 {
     private static final String DEFAULT_MESSAGE = "Your age: ";
     private Scanner scanner;
     
     public AgeInputVer2(){ 
        scanner = new Scanner(System.in); 
     }
     
     //public int getAge() { 
        //return getAge(DEFAULT_MESSAGE); 
    //}
    
public int getAge(String prompt)throws Exception{
        int age=0; 
        boolean keepGoing = true;
        while (keepGoing){
            System.out.print(prompt);
            
                try {
                    age = scanner.nextInt();
                    if (age < 0) { 
                      throw new Exception("Negative age is invalid"); }
                    keepGoing = false;

                } 
                
                catch (InputMismatchException e){
                 scanner.next(); //remove the leftover garbage 
                                 //from the input buffer
                System.out.println("Invalid Entry.Please enter digits only.");
               }
                catch (Exception e) {
                    System.out.println("Error: " + e.getMessage()); 
                }

  }
 return age;
}

 }
