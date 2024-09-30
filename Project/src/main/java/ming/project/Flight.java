
package ming.project;


public class Flight {
    int place;
    
            public Flight(int a){
            place = a;

}
    public  int seats1(int seats1){
            if(seats1==0){
                System.out.print("No availanle ");
           
            }
                       
        else {
            System.out.print("Ticket Available ");
                seats1= seats1-1;
                }
                 return seats1;           
        }
 

  public int seats2(int seats2){

            if(seats2==0){
            System.out.print("Ticket Available ");
             
            }
            
            else{
                System.out.print("No availanle ");
                    seats2 = seats2 - 1;
            }
        
        
        return seats2;

            
}
}