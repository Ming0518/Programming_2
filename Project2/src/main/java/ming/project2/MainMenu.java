package ming.project2;

import java.util.*;
public class MainMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        boolean err = true;
        List passlist = new List();
                
        do{
            System.out.println("___________________________________________________________________");
            System.out.println("\t\t\tFlight Ticket Reservation");
            System.out.println("___________________________________________________________________\n" +
                           "1. Booking Ticket\n" +"2. Edit Information\n" + "3. Display Information\n" 
                           + "4. Search Information\n" + "5. Cancel Booking\n" + "0. EXIT");
            System.out.println("___________________________________________________________________");
                   System.out.print("Please enter your choice : ");    
                        choice = scan.nextLine();
                        
                    System.out.println("___________________________________________________________________");
                    
            switch (choice) {
                case "1":
                    passlist.InputInfo();
                    break;
                case "2":
                    passlist.UpdateInfo();
                    break;
                case "3":
                    passlist.DisplayInfo();
                    break;
                case "4":
                    passlist.SearchInfo();
                    break;
                case "5":
                    passlist.DeleteInfo();
                    break;
                case "0":
                    System.out.println("THANKS AND HAVE A NICE DAY");
                    break;
                default:
                    System.out.println("Please enter Number 0-5 only.");
                    break;
            }           
               
        }while(!"0".equals(choice));
                   
        
        
    }
}
