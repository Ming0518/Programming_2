import static cinema.Movie.ticket1Arr;
import static cinema.Movie.ticket2Arr;
import java.util.Scanner;
public class Ticket extends Cinema {
    public Movie movie = new Movie();
    private static Scanner sc = new Scanner(System.in);    
    private String name;
    private String time;
    private String seat;
    private String price;
    private static char b;
    
    public Ticket(String name, String time, String seat, String price){
        this.name = name;
        this.time = time;
        this.seat = seat;
        this.price = price;
    }
    
    public void mane(){
        System.out.println("Ticket Manager System");
        System.out.println("1. Sold Ticket");
        System.out.println("2. Edit Ticket");
        System.out.println("3. Cancel Ticket");
        System.out.println("4. Sold History");
        System.out.println("5. Exit");
        System.out.print("Enter Options : ");
    }
    public void add(){
        while(true){
            Movie.infoMovie();
            int input = sc.nextInt();
            sc.nextLine();
            if(input == 1){
                seatDisplay();
                Movie.fMovie();
                String YN;
                while(true){
                    System.out.println("Do you want to buy more?");
                    YN = sc.nextLine();
                    if(YN.equalsIgnoreCase("yes")||YN.equalsIgnoreCase("no"))
                        break;
                }
                if (YN.equalsIgnoreCase("no"))
                    break;
            }

            if(input == 2){
                seatDisplay();
                Movie.sMovie();
                String YN;
                while(true){
                    System.out.println("Do you want to buy more?");
                    YN = sc.nextLine();
                    if(YN.equalsIgnoreCase("yes")||YN.equalsIgnoreCase("no"))
                        break;
                }
                if (YN.equalsIgnoreCase("no"))
                    break;
            }
            if(input == 3)
                break;
        }      
    }
    
    public void edit(){
        while(true){
            System.out.println("What typr of Ticket");
            System.out.println("(1) Rebuild of EVANGELION");
            System.out.println("(2) Fullmetal Alchemist the Movie: Conqueror of Shamballa");
            System.out.println("(3)Back");
            int input = sc.nextInt();
            int input2, i;
            String numSeat,numSeatNew;
            if(input == 1){
                while(true){
                    System.out.println("(1)Change Seat\n(2)Change Movie\n(3)Exit");
                    input2 = sc.nextInt();
                        if(input2 == 1){
                            System.out.println("Enter the number of seat");
                            numSeat = sc.nextLine()+sc.nextLine();
                            for(i=0; i<ticket1Arr.length; i++){
                                if(ticket1Arr[i] != null && ticket1Arr[i].seat.equals(numSeat)){
                                    System.out.println("Choose the seat");
                                    seatDisplay();
                                    numSeatNew = sc.nextLine()+sc.nextLine();
                                    ticket1Arr[i].seat = numSeatNew;
                                    break; 
                                }
                            }
                            if (i == 80)
                                    System.out.println("Seat not found");
                        }   
                        if(input2 == 2){
                            System.out.println("Enter the number of seat");
                            numSeat = sc.next()+sc.nextLine();
                            Delete("Rebuild of EVANGELION",numSeat); 
                            add();
                            break;
                        }
                        if(input2 == 3)
                        break;
                }
            }
            if(input == 2){
                while(true){
                    System.out.println("(1)Change Seat\n(2)Change Movie\n(3)Exit");
                    input2 = sc.nextInt();
                        if(input2 == 1){
                            System.out.println("Enter the number of seat");
                            numSeat = sc.nextLine()+sc.nextLine();
                            for( i=0; i<ticket2Arr.length; i++){
                                if(ticket2Arr[i] != null && ticket2Arr[i].seat.equals(numSeat)){
                                    System.out.println("Choose the seat");
                                    seatDisplay();
                                    numSeatNew = sc.nextLine()+sc.nextLine();
                                    ticket2Arr[i].seat = numSeatNew;
                                    break; 
                                }
                            }
                            if (i == 80)
                                    System.out.println("Seat not found");
                        }   
                        if(input2 == 2){
                            System.out.println("Enter the number of seat");
                            numSeat = sc.nextLine()+sc.nextLine();
                            Delete("Fullmetal Alchemist the Movie: Conqueror of Shamballa",numSeat);  
                            add();
                            break;
                        }
                        if(input2 == 3)
                        break;
                }
            
            }
            if (input == 3){
                break;
            }         
        }
    }
  
    public void delete(){
        while(true){
            System.out.println("Which Movie");
            System.out.println("(1) Rebuild of EVANGELION");
            System.out.println("(2) Fullmetal Alchemist the Movie: Conqueror of Shamballa");
            System.out.println("(3)Back");
            int input = sc.nextInt();
            String numSeat;
            if(input == 1){
                System.out.println("Enter the number of seat");
                numSeat = sc.nextLine()+sc.nextLine();
                Delete("Rebuild of EVANGELION",numSeat);  
                break;
            }
            if(input == 2){
                System.out.println("Enter the number of seat");
                numSeat = sc.nextLine()+sc.nextLine();
                Delete("Fullmetal Alchemist the Movie: Conqueror of Shamballa",numSeat);  
                break;
                }
                if (input == 3){
                    break;
                }
            }         
        }
    
    public static void Delete(String nameMovie, String numSeat){
        boolean deleted = false;
        for(int i=0; i<ticket1Arr.length; i++){
            if(ticket1Arr[i] != null && ticket1Arr[i].name.equals(nameMovie) && ticket1Arr[i].seat.equals(numSeat)){
                ticket1Arr[i] = null;
                deleted = true;
                break;
            }
            if(ticket2Arr[i] != null && ticket2Arr[i].name.equals(nameMovie) && ticket2Arr[i].seat.equals(numSeat)){
                ticket2Arr[i] = null;
                deleted = true;
                break;
            }
        }
        if(deleted){
            System.out.println("Ticket have be cancel successfully.");
        }else{
             System.out.println("Ticket not found.");
        }          
    }
    
    public void display(){
        movie.History();
    }
    
    public void seatDisplay(){
        for (int i = 1; i <=4; i++) {
                if (i == 1)
                    b = 'A';
                if (i == 2)
                    b = 'B';
                if (i == 3)
                    b = 'C';
                if (i == 4)
                    b = 'D';
                for (int seat = 1; seat <= 20; seat++) {
                    System.out.print(b + "" + seat + " ");
                } 
                System.out.println("");
            }
        System.out.print("Select Seat:");
        
    }
    
    public String toString(){
         return "Movie : " + name + "\n" + "Time : " + time + "\n" + "Number of seat : " + seat + "\n" + "price : " + price;
    }
}