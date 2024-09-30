package ming.project;
import java.util.*;

class passengers_details{
            static Scanner scan = new Scanner(System.in);
    String name, email;
        double phone;

    
    passengers_details(String nms, String em, double ph){
            name= nms;
            phone= ph;
            email = em;
    }
    
void  display_passengers(){
            System.out.println("Passengers name : " + name);
            System.out.println("Passengers phone number : " + phone);
            System.out.println("Passengers email adress : " + email);

	}
        
 void search_passengers (passengers_details passengers[],String nm,int count, int i){

     if (name.equals(nm)){
      System.out.println("Your ticket number is "+ i); 
      passengers[i].display_passengers();
     }
    
    
  }//end search
        
void edit_passengers (passengers_details passengers[], int count ){
               boolean find = false;
           
            if (count == 0)
                  System.out.println("Sorry list is empty.");
                  
            else {
            System.out.print("Please enter your new name : ");
                     name = scan.nextLine();
                    
            System.out.print("Please enter your new phone number : ");
                    phone = scan.nextDouble();
                        scan.nextLine();
                        
            System.out.print("Please enter your new email adress : ");
                    email = scan.nextLine();
                     
                       find=true;
           }
                 if (find==false)
                  System.out.println("Sorry menu you want to delete is not in the list.");

        }

        
int delete_passengers (passengers_details passengers[], int find, int count){
            int j;
            String nom;
                  int bil=count;
                  boolean delete=false;
                  
                  if (bil==0)
                    System.out.println("Sorry there are no any ticket in our system");
                    
                 else {
                       for(j=find;j<count-1;j++){
                          passengers[j]=passengers[j+1];
                        --bil;
                        delete=true;
                     break;
                     }
                   }
                  if (delete==false)
                  System.out.println("Sorry the list is empty.");
                        return bil;
           }//end delete
  }