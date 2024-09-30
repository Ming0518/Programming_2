package ming.labtest;

//OOI YAU MING
//285824

import java.util.*;
public class LabTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 20) = ");
            int num = scan.nextInt();
            
        GameNumber Number = new GameNumber(num);
            Number.evenOdd(num);
            Number.random(num);
        
    }
}
