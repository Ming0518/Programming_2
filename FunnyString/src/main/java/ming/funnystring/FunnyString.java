
package ming.funnystring;
import java.util.Scanner;
public class FunnyString {
       public static void main (String[] args)

    {
      Scanner scan = new Scanner (System.in);
      String fav_color, food,animal,first_nm_frn;
              
      System.out.print("Enter your favorite color :");
      fav_color = scan.nextLine();
      
      System.out.print("\nEnter your favorite food :");
      food = scan.nextLine();
      
      System.out.print("\nEnter your favorite animal :");
      animal = scan.nextLine();
      
      System.out.print("\nEnter your first name of a friend :");
      first_nm_frn = scan.nextLine();
      
      System.out.println ("\nI had a dream that " + first_nm_frn + " ate a " + fav_color + " " +  animal + " and said it tasted like " + food + "!");
   }
}


