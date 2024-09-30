
package ming.project2;


public class Flight {
    int seats11=50,seats12=50,seats21=50,seats22=50;
    
    public void seats11(int num){
         if(seats11 - num <= 0){
                System.out.println("No available ");
           
            }
                       
        else {
            System.out.println("Ticket Available ");
                seats11= seats11- num;
                }          
        }
 

  public void seats12(int num){

            if(seats12 - num <= 0){
            System.out.println("No available ");
             
            }
            
            else{
                System.out.println("Ticket Available ");
                    seats12 = seats12 - num;
            }
                 
}
   
    
public void seats21(int num){

            if(seats21 - num <= 0){
            System.out.println("No Available ");
             
            }
            
            else{
                System.out.println("Ticket Available ");
                    seats21 = seats21 - num;
            }
                 
}
      
public void seats22(int num){

            if(seats22 - num <= 0){
            System.out.println("No Available ");
             
            }
            
            else{
                System.out.println("Ticktet available ");
                    seats22 = seats22 - num;
            }
            }
  
  public void Cancelseats11(int num){
      seats11= seats11+ num;
  }
  
  public void Cancelseats12(int num){
      seats12= seats12+ num;
  }
  
  public void Cancelseats21(int num){
      seats21= seats21+ num;
  }
  
  public void Cancelseats22(int num){
      seats22= seats22+ num;
  }
}