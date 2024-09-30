import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Rebuild of EVANGELION", "14:00 - 16:00", "A1", "RM 20.00");
        Scanner sc = new Scanner(System.in);

        while (true) {
            ticket.mane();
            int input = sc.nextInt();
            if (input == 1)
                ticket.add();
            if (input == 2)
                ticket.edit();
            if (input == 3)
                ticket.delete();
            if (input == 4)
                ticket.display();
            if (input == 5)
                break;
        }
    }
}