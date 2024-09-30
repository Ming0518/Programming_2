package ming.project;
import java.util.*;
public class Project {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String date, name, email,search;
            double time, num, cls, cabin, price, total, phone;
            int count = 0, choice,tcn,find,place,seats1=50, seats2=50;
            
            ticket_details[] ticket = new ticket_details[100];
            passengers_details[] passengers = new passengers_details[100];
            Flight flights;
            
            NewClass clsss = new NewClass();
            clsss.add();
            
                   do{
                   System.out.println("----------------- FUNCTION -----------------\n" +
                           "1. Booking Ticket\n" +"2. Display Information\n" + "3. Edit Ticket\n" 
                           + "4.Delete Information\n" + "0. EXIT");
                   System.out.print("Please enter your choice : ");
                    choice = scan.nextInt();
                        scan.nextLine();
                        
                    if(choice == 1){
                        
                     System.out.println("1. Kedah to KL");
                     System.out.println("2. Kl to Kedah ");
                     System.out.print("Please enter the state you want to visit : ");
                        place = scan.nextInt();
                           
                        flights= new Flight(place);
                        if(place==1)
                            seats1=flights.seats1(seats1);
                        if(place==2)
                            seats2=flights.seats2(seats2);
                    
                   System.out.print("Please enter the date(dd/mm) : ");
                   scan.nextLine();
                    date = scan.nextLine();
                    
                   System.out.print("Please enter the time for the trip : ");
                    time = scan.nextDouble();
                    
                   System.out.print("Please enter number of passengers : ");
                    num = scan.nextDouble();
                   
                   System.out.print("1. Economy \n2. Premium\n ");
                    System.out.print("Please enter the cabin class you want: ");
                     cls = scan.nextDouble();
                        scan.nextLine();
                    
                            ticket[count] = new ticket_details(date,time,num,cls);
                  
                    System.out.print("Please enter your name : ");
                     name = scan.nextLine();
                    
                   System.out.print("Please enter your phone number : ");
                    phone = scan.nextDouble();
                        scan.nextLine();
                   System.out.print("Please enter your email adress : ");
                    email = scan.nextLine();
                   
                              passengers[count] = new passengers_details(name,email,phone);  
                              
                    payment_ticket pay = new payment_ticket(ticket[count].total);          
                              pay.paymentMethod();
                              
                    System.out.println("Your ticket number is : " + count); 
                        count++;
                    }
                    
                    if(choice == 2){
                        if(count!=0){
                        System.out.print("Please enter your ticket number : ");
                            tcn=scan.nextInt();
                            
                         passengers[tcn].display_passengers();
                         ticket[tcn].display_ticket();
                        }
                        
                        else {
                                System.out.println("Sorry list is empty.");}
                    }
                    
                    if(choice == 3){                     
                        if(count!=0){
                            System.out.println("Please enter your ticket number:");        
                             find = scan.nextInt();
                                
                                ticket[find].edit_ticket(ticket,count);
                                passengers[find].edit_passengers(passengers,count);
                        }
                        else {
                                System.out.println("Sorry list is empty.");}
                    }
                    
                    if(choice == 4){
                        if(count!=0){
                            System.out.print("Number to be deleted?:");
                                find = scan.nextInt();
                                
                                    ticket[find].delete_ticket(ticket ,find,count);
                                    count = passengers[find].delete_passengers(passengers,find,count);

                                }
 
                        else {
                                System.out.println("Sorry list is empty.");}
                    }
                    
                    if(choice == 5){
                        if(count!=0){
                        System.out.print("Please enter your name:");                     
                            search = scan.nextLine();
                            
                            System.out.print("Please enter your ticket number:");                     
                                find = scan.nextInt();
                                
                            for(int i=0; i<count; i++){
                                passengers[i].search_passengers(passengers,search,count,i);
                                ticket[i].search_ticket(ticket,find,count,i);
                            }
                            }
                        
                        else {
                                System.out.println("Sorry list is empty.");}
                    }
                    
                    
                    
                    }while(choice != 0);  
                    
                   }     
    }