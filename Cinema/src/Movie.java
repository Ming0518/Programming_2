import java.util.Scanner;
public class Movie extends Cinema {
    private static Scanner sc = new Scanner(System.in);
    public static Ticket[] ticket1Arr = new Ticket[80];
    public static Ticket[] ticket2Arr = new Ticket[80];
    public int num;
    
    public static void infoMovie(){
        System.out.println("\n***Movie Today***");
        System.out.println("(1) Rebuild of EVANGELION");
        System.out.println("Time: 14:00 - 16:00");
        System.out.println("Price: RM 20.00\n");
        System.out.println("(2) Fullmetal Alchemist the Movie: Conqueror of Shamballa");
        System.out.println("Time: 20:00 - 22:00");
        System.out.println("Price: RM 20.00\n");
        System.out.println("(3)Back");
        System.out.println("Choies the movie:");
    }
    
    public static void fMovie(){
        String seat = sc.nextLine();
        for(int i = 0; i<ticket1Arr.length; i++){
            if (ticket1Arr[i] == null){
            ticket1Arr[i]= new Ticket("Rebuild of EVANGELION","14:00 - 16:00", seat, "RM 20.00");
            int num = i;
            System.out.println(ticket1Arr[num]);  
            break;
            }
        }  
    }
    
    public static void sMovie(){
        String seat = sc.nextLine();
        for(int i = 0; i<ticket2Arr.length; i++){
            if (ticket2Arr[i] == null){
            ticket2Arr[i]= new Ticket("Fullmetal Alchemist the Movie: Conqueror of Shamballa","14:00 - 16:00", seat, "RM 20.00");
            int num = i;
            System.out.println(ticket1Arr[num]);  
            break;
            }
        }     
    }
    
    public static void History(){
        System.out.println("\n****Rebuild of EVANGELION****\n");
        for(int i = 0; i<ticket1Arr.length; i++){
            if (ticket1Arr[i] != null){
                System.out.println(ticket1Arr[i]+"\n"); 
            }
        }
        System.out.println("\n****Fullmetal Alchemist the Movie: Conqueror of Shamballa****\n");
        for(int i = 0; i<ticket2Arr.length; i++){
            if (ticket2Arr[i] != null){
                System.out.println(ticket2Arr[i]+"\n"); 
            }
        }
    }
}