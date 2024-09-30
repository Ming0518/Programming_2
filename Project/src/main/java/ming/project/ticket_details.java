
package ming.project;
import java.util.*;
class ticket_details{
        static Scanner scan = new Scanner(System.in);

    String  date ;
    double time, num, cls, cabin, price, total;
    
ticket_details( String dt, double tm, double num1,double cs){
		//place= nm;
                date= dt;
                time = tm;
                num = num1;
                cls = cs;
	}
    
public void cabin_class(){
        if(cls == 1)
            cabin = 150 ;
        
        else if(cls == 2)
            cabin = 200 ;
    }
    
public void calculate_ticket(){
        total = (price + cabin) * num;
} 

void display_ticket(){
            //System.out.println("Place Travel         : " + place);
            System.out.println("Date Travel          : " + date);
            System.out.println("Time Travel          : " + time);
            System.out.println("Number of Passengers : " + num);
            System.out.println("Cabin Class          : " + cls);           

	}

 void search_ticket (ticket_details ticket[],int a,int count, int i){

     if (count == a){
      System.out.println("Your ticket number is "+ i); 
      ticket[i].display_ticket();
     }
 }

        
void edit_ticket (ticket_details ticket[], int count){
           boolean find=false;
           
            if (count == 0)
                  System.out.println("Sorry list is empty.");
                  
            else {

            //System.out.print("Please enter the new state you want to visit : ");
                    //place = scan.nextLine();
                    
            System.out.print("Please enter the new date(dd/mm) : ");
                    date = scan.nextLine();
                    
            System.out.print("Please enter the new time for the trip : ");
                    time = scan.nextDouble();
                    
            System.out.print("Please enter new number of passengers : ");
                    num = scan.nextDouble();
                   
            System.out.print("1. Economy \n2. Premium\n ");
                System.out.print("Please enter the new cabin class you want: ");
                     cls = scan.nextDouble();
                     scan.nextLine();  
                     
                       find=true;
           }
                 if (find==false)
                  System.out.println("Sorry menu you want to delete is not in the list.");

        }

        
void delete_ticket (ticket_details ticket[], int find, int count){
           int j;
                  int bil=count;
                  boolean delete=false;
                  
                  if (bil==0)
                    System.out.println("Sorry there are no any ticket in our system");
                    
                 else {
                       for(j=find;j<count-1;j++){
                          ticket[j]=ticket[j+1];
                        delete=true;
                     break;
                     }
                   }
                  if (delete==false)
                  System.out.println("Sorry the list is empty");

           }//end delete
 }