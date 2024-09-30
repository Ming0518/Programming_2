
package ming.pro1;

import java.util.*;
public class MainMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int choice,id=0, count,rescount=0, cuscount=0, ordcount=0, choose,choose2, number_ordered=0;
                String name,cusname,address, email, resname, food, foods1, foods2, foods3,date;
                    Restaurant[] res= new Restaurant[100];
                        Customer[] cus = new Customer[100];
                            Order[] ord = new Order[100];
                                boolean check = true;
                                    double total,pay;
        
        do{
        System.out.println("___________________________________________________________________");
        System.out.println("\t\t\tFunction\n" + "___________________________________________________________________\n" +
                           "1. Customer Registration\n" +"2. Restaurant Registration\n" + "3. Add Customer Order\n" 
                           + "4. Search Customer\n" + "5. List Customers\n" + "6. Exit");
        System.out.print("Please enter your choice : ");    
                        choice = scan.nextInt();
                            
        System.out.println("___________________________________________________________________");
        
       
        switch (choice) {
                case 1:
                    System.out.print("Please Enter Customer Name : "); 
                        cusname = scan.next() + scan.nextLine();
                     
                while(check){  
                    System.out.print("Please Enter Customer ID : "); 
                        id = scan.nextInt();
                            
                    check = false;
                    
                        if(id >= 100000 && id<= 999999){   
                            if( cuscount != 0){
                                for(int i=0; i < cuscount; i++){
                                    if(cus[i].getID() == id){ 
                                        System.out.println("The ID is already excees in system."); 
                                            System.out.println("Please Input another id number");
                                                check = true;
                                                           }  
                                    
                                                     }
                                              }
                                         }
                        
                        else{
                            System.out.println("Please Input 6 digits of id");  
                                check = true;
                        }
                        
                    }

                    System.out.print("Please Enter Home Address : "); 
                        address = scan.next() + scan.nextLine();

                    System.out.print("Please Enter Email Address : "); 
                        email = scan.nextLine();
                        
                        cus[cuscount] = new Customer(cusname, id, address,email,number_ordered);
                        
                        cuscount++;
                        check = true;
                    break;
                    
                case 2:
                    System.out.print("Please Enter Restaurant Name : "); 
                        resname = scan.next() + scan.nextLine();

                    System.out.print("Please Enter Name For Food 1 : "); 
                        foods1 = scan.nextLine();

                    System.out.print("Please Enter Name For Food 2 : "); 
                        foods2 = scan.nextLine();

                    System.out.print("Please Enter Name For Food 3 : "); 
                        foods3 = scan.nextLine();
                        
                        res[rescount] = new Restaurant(resname, foods1, foods2, foods3);
                            rescount++;
                    break;
                case 3:
                    if(cuscount!=0 && rescount!=0){
                    System.out.print("Please Enter Customer ID : "); 
                        id = scan.nextInt();
                        check =true;
                        
                        for(int i=0; i < cuscount; i++){
                            if(cus[i].getID() == id){ 
                                System.out.println("List of restaurant:");
                                        for(int j =0; j<rescount;j++){
                                            System.out.println((j+1) + ". " + res[j].getName());                    
                                        }
                                        
                                        
                                         System.out.print("Please choose the reataurant you want :");
                                                    choose= scan.nextInt();
                                            
                                            name = res[choose-1].getName();
                                            
                                            System.out.print(res[choose-1].DisplayFood());
                                                    
                                                  
                                                System.out.print("\nPlease choose the food you want :");
                                                    choose2 = scan.nextInt();
                                                    
                                                    if(choose2 == 1){
                                                       food = res[choose-1].getFoods1();
                                                    }
                                                    
                                                    else if(choose2 == 2){
                                                        food = res[choose-1].getFoods2();
                                                    }
                                                    
                                                    else{
                                                        food = res[choose-1].getFoods3();
                                                    }
                                                    
                                        System.out.print("Please enter the date(dd/mm/yyyy): ");
                                            date = scan.next() + scan.nextLine();
                                            
                                        System.out.print("Please enter the amount paid: RM ");
                                            pay = scan.nextDouble();    
                                            
                                            cus[i].calculateOrder();
                                            
                                            ord[ordcount] = new Order(id,name,food,date,pay);
                                                    ordcount++;
                                                    check = false;
                                    } 
                        }
                        
                        if(check){
                                System.out.println("Not Found!! Please make sure you input correct ID.");
                            }
                    }
                    
                    if(cuscount==0){
                            System.out.println("You have to register customer first.");
                    }
                    
                    if(rescount==0){
                            System.out.println("You have to register reataurant first.");
                    }
                        
                    break;
                case 4:
                    System.out.print("Please Enter Customer ID : "); 
                        id = scan.nextInt();
                        check =true;
                        total = 0 ;
                        count = 0;
                        
                        for(int i=0; i < cuscount; i++){
                            if(cus[i].getID() == id){
                                if(cus[i].getNumOrder() !=0){
                                System.out.println("___________________________________________________________________");
                                System.out.println("\t\t\tCustomer Information: " ); 
                                System.out.println("___________________________________________________________________");
                                System.out.println("Customer Name : " + cus[i].getName()); 
                                System.out.println("Customer Email Adress : " + cus[i].getEmail());
                                System.out.println("Numbered Of Order : " + cus[i].getNumOrder());
                                System.out.println(" ");
                                
                                    System.out.println("___________________________________________________________________");
                                    System.out.println("\t\t\tOrder History: " );
                                    System.out.println("___________________________________________________________________");
                                        for(int j=0; j < ordcount; j++){
                                            if(ord[j].getID() == id){
                                                System.out.println("Name Reataurant: "  + ord[j].getName());
                                                System.out.println("Food Order: " + ord[j].getFood());
                                                System.out.println("Date: " + ord[j].getDate());
                                                System.out.println(" ");
                                                total = total +  ord[j].getPay();
                                                count++;
                                        }
                                    }
                                    System.out.printf("%s%.2f\n" ,"Average amount paid: ",(total/count));
                                check = false;
                            }
                                else{
                                    System.out.println("___________________________________________________________________");
                                    System.out.println("\t\t\tCustomer Information: " ); 
                                    System.out.println("___________________________________________________________________");
                                    System.out.println("Customer Name : " + cus[i].getName()); 
                                    System.out.println("Customer Email Adress : " + cus[i].getEmail());
                                    check = false;
                                }
                            } 
                        }
                            
                        
                        if(check){
                                System.out.println("Not Found!! Please make sure you input correct ID.");
                        }
                    break;
                case 5:
                   if(ordcount!=0){
                    for(int i=0; i < cuscount; i++){
                        if(cus[i].getNumOrder() != 0){
                    System.out.println("Customer " + (i+1) + ": " ); 
                    System.out.println("Customer Name : " + cus[i].getName()); 
                    System.out.println("Customer ID : " + cus[i].getID());
                    System.out.println("Numbered Of Order : " + cus[i].getNumOrder());
                    System.out.println(" ");
                        }         
                    }
                   }
                   
                   else{
                       System.out.println("There are no customer order yet in system.");
                   }
                        
                    break;
                case 6:
                    System.out.println("THANKS AND HAVE A NICE DAY");
                    break;
                default:
                    System.out.println("Please enter Number 1-6 only.");
                    break;
            }   
        }while(choice != 6);        
    }
}
