

package ming.studentdemo;


import java.util.Scanner;
public class StudentDemo {

public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    LinkedList list = new LinkedList();
    menu();
    int input = key.nextInt();

        if (input == 1){
            if (input ==1){
                System.out.println("Enter name");
                String name = key.nextLine();
                list.add(name);

                System.out.println(list);
            }
        }



}

public static void menu(){
    System.out.println("Student Maintenence System:");
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. Print Student Information");
    System.out.println("4. Exit");
}

public static void optionOne(int input, LinkedList list, Scanner key){
    if (input ==1){
        System.out.println("Enter name");/*supposed to ask for a lot more but for the time being its only asking this*/
        String name = key.nextLine();
        list.add(name);
        list.toString();
}
}
}
