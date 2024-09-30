package ming.project2;

import java.util.*;
public class List {
    Scanner scan= new Scanner(System.in);
    Flight[][] flights = new Flight[32][13];      
    payment_ticket pay = new payment_ticket();
    String name, email,date,month,phone,place,cabin,time;
    int search,searchp,searchc,count=1000,seats1,seats2,num;
    double cls, total;
    boolean check;
    
    LinkedList<passengers_details> PassList = new LinkedList<passengers_details>();
    LinkedList<ticket_details> TickList = new LinkedList<ticket_details>();
	Iterator <passengers_details> PassItera = PassList.iterator();
        Iterator <ticket_details> TickItera = TickList.iterator();

  
    void InputInfo() {
        System.out.println("\t\t\tINPUT PASSENGERS INFORMATION");
                System.out.println("___________________________________________________________________");
        System.out.print("Please enter your name : ");     
            name = scan.next() + scan.nextLine(); 
                
                     
                    
        System.out.print("Please enter your phone number : ");
                    phone = scan.nextLine();
                        
                        
        System.out.print("Please enter your email adress : ");
                    email = scan.nextLine();
            
            PassList.add(new passengers_details(name,email,phone,count));
            
         System.out.println("___________________________________________________________________");
         System.out.println("\t\t\tENTER TICKET INFORMATION");
         System.out.println("___________________________________________________________________");
                
         System.out.println("1. Kedah to KL (11.30 - 13.00) ");
         System.out.println("2. Kl to Kedah (14.00 - 15.30) ");
         System.out.println("___________________________________________________________________");
         System.out.print("Please enter the state you want to visit : ");
                searchp = scan.nextInt();                   
                       
        System.out.print("Please enter the date(1-31) : ");
                   scan.nextLine();
                    date = scan.nextLine();
                    
                    System.out.print("Please enter the month(1-12): ");
                            month = scan.nextLine();                 
                          
            if(searchp==1){
                place = "Kedah to KL" ; 
                time = "11.30 - 13.00";
            }
            
            else if(searchp==2){
                place = "Kl to Kedah" ; 
                time = "14.00 - 15.30";
            }
                    
        System.out.print("Please enter number of passengers : ");
                    num = scan.nextInt();
         
        System.out.println("___________________________________________________________________");
        System.out.print("1. Economy \n2. Premium\n ");
        System.out.println("___________________________________________________________________");
            System.out.print("Please enter the cabin class you want: ");
                     searchc = scan.nextInt();
                        scan.nextLine();            
             
            if(searchc==1){
                cls = 100;
                cabin = "Economy";
            }
            
            else if(searchc==2){
                cls = 150;
                cabin = "Premium";
            }
            
            flights[Integer.parseInt(date)][Integer.parseInt(month)] = new Flight();
            
            if(searchp==1 && searchc==1){     
                flights[Integer.parseInt(date)][Integer.parseInt(month)].seats11(num);
            }
            
            else if(searchp==1 && searchc==2){
                flights[Integer.parseInt(date)][Integer.parseInt(month)].seats12(num);
            }
            
            else if(searchp==2 && searchc==1){
                flights[Integer.parseInt(date)][Integer.parseInt(month)].seats21(num);
            }
            
            else if(searchp==2 && searchc==2){
                flights[Integer.parseInt(date)][Integer.parseInt(month)].seats22(num);
            }
            
                 total =  cls * num;
        
        System.out.println("___________________________________________________________________");         
        System.out.println("Your ticket price is : " + total);         
                 pay.paymentMethod();
                 
         System.out.println("___________________________________________________________________");        
         System.out.println("Your ticket number is : " + count);
                        
         
            TickList.add(new ticket_details(place,cabin,date,month,time,num,count));            
                  count++;      
        
    }    
    
    public void UpdateInfo(){
    check = true;
		System.out.print("Please Enter The Ticket Number You Want To Change: ");
                     search = scan.nextInt();
                        
                        
         ListIterator<passengers_details> PassListItera = PassList.listIterator();
		while(PassListItera.hasNext()) {
			passengers_details passdetails = PassListItera.next();
		
        if(passdetails.getTicketNum()== search) {  
            
        System.out.print("Please enter your name : ");
                    name = scan.nextLine(); 
                    name = scan.nextLine();
                    
        System.out.print("Please enter your phone number : ");
                    phone = scan.nextLine();
                        
        System.out.print("Please enter your email adress : ");
                    email = scan.nextLine();
            
            PassListItera.set(new passengers_details(name,email,phone,search));
			
				check = false;
				}
			}
                
                if(check){
                    System.out.println("No Data!!\nPlease Make sure you enter correct Ticket Number. ");
                }
}  
    
    public void DisplayInfo() {
		PassItera = PassList.iterator();
                TickItera = TickList.iterator();
                int count = 1;
                System.out.println("\t\t\tPASSENGERS INFORMATION");
                System.out.println("___________________________________________________________________");
                System.out.printf("%-15s%-22s%-20s%s\n", "Ticket Number", "Passengers Name","Phone Number","Email");
                
		while(PassItera.hasNext()) {
                    
                        System.out.print(count + ".");
                            passengers_details passdetails = PassItera.next();
                            System.out.print(passdetails);
                                count++;
			}
                
                count = 1 ;
                System.out.println("___________________________________________________________________");
                System.out.println("\t\t\tTICKET INFORMATION");
                System.out.println("___________________________________________________________________");
                System.out.printf("%-15s%-15s%-10s%-10s%-15s%s\n","Ticket Number","Destination" ,"Cabin", "Date","Time","Number Of Passengers");
                while(TickItera.hasNext()) {
                    
                        System.out.print(count + ".");
                            ticket_details tickdetails = TickItera.next();
                            System.out.print(tickdetails);
                                count++;
			}
		}
    
    public void SearchInfo(){
        check = true;
        int count = 1;
		System.out.print("Please Enter The Ticket Number You Want To Search: ");
                    search = scan.nextInt(); 
                        
                        
		System.out.println("___________________________________________________________________");
		PassItera = PassList.iterator();
		
		while(PassItera.hasNext()) {
			passengers_details passdetails = PassItera.next();
			
			if(passdetails.getTicketNum()== search) {
                            System.out.println("___________________________________________________________________");
                            System.out.println("\t\t\tPASSENGERS INFORMATION");
                            System.out.println("___________________________________________________________________");
                            System.out.printf("%-15s%-22s%-20s%s\n", "Ticket Number", "Passengers Name","Phone Number","Email");
                            System.out.print(count + ".");
				System.out.print(passdetails);
                                count++;
			}
                }
                        
                TickItera = TickList.iterator();
		
		while(TickItera.hasNext()) {
			ticket_details tickdetails = TickItera.next();
			
			if(tickdetails.getTicketNum()== search) {
                            count = 1 ;
                            System.out.println("___________________________________________________________________");
                            System.out.println("\t\t\tTICKET INFORMATION");
                            System.out.println("___________________________________________________________________");
                            System.out.printf("%-15s%-15s%-10s%-10s%-15s%s\n","Ticket Number","Destination" ,"Cabin", "Date","Time","Number Of Passengers");
                            System.out.print(count + ".");
				System.out.print(tickdetails);
				check = false;
                                count++;
			}
			
		}
		if(check) {
			System.out.println("No Data!!\nPlease Make sure you enter correct Ticket Number. ");
		}
		}
    
    
    
    public void DeleteInfo(){
        check = true;
		System.out.print("Please Enter The Ticket Number You Want To Cancel: ");
                    search = scan.nextInt();
                       
		System.out.println("___________________________________________________________________");
                
		ListIterator<passengers_details> PassListItera = PassList.listIterator();
                
		while(PassListItera.hasNext()) {
			passengers_details passdetails = PassListItera.next();

			if(passdetails.getTicketNum()== search) {
                            PassListItera.remove();
                            
			}
                }
                        
                ListIterator<ticket_details> TickListItera = TickList.listIterator();
		while(TickListItera.hasNext()) {
			ticket_details tickdetails = TickListItera.next();
			
			if(tickdetails.getTicketNum()== search) {
                            
                                    if(tickdetails.getTicketPlace().equals("Kedah to KL")  && tickdetails.getTicketClass().equals("Economy")){
                                        flights[Integer.parseInt(tickdetails.getTicketDate())][Integer.parseInt(tickdetails.getTicketMonth())].Cancelseats11(tickdetails.getTicketNu());
                                        
                                    }

                                    else if(tickdetails.getTicketPlace().equals("Kedah to KL")  && tickdetails.getTicketClass().equals("Premium")){
                                        flights[Integer.parseInt(tickdetails.getTicketDate())][Integer.parseInt(tickdetails.getTicketMonth())].Cancelseats12(tickdetails.getTicketNu());
                                       
                                    }  
                                    
                                    else if(tickdetails.getTicketPlace().equals("Kl to Kedah")  && tickdetails.getTicketClass().equals("Economy")){
                                        flights[Integer.parseInt(tickdetails.getTicketDate())][Integer.parseInt(tickdetails.getTicketMonth())].Cancelseats21(tickdetails.getTicketNu());
                                      
                                    }  
                                    
                                    else if(tickdetails.getTicketPlace().equals("Kl to Kedah")  && tickdetails.getTicketClass().equals("Premium")){
                                        flights[Integer.parseInt(tickdetails.getTicketDate())][Integer.parseInt(tickdetails.getTicketMonth())].Cancelseats22(tickdetails.getTicketNu());
 
                                    }  
                                    
                                TickListItera.remove();
                                System.out.println("Your Ticket is successful cancel.");
				check = false;
                                
			}
			
		}
		if(check) {
			System.out.println("No Data!!\nPlease Make sure you enter correct Ticket Number. ");
		}
		}
    }
