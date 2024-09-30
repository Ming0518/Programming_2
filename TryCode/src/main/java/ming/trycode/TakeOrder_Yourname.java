/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order_yourname;
// name:Tan Zheng Wey 
// matric number : 284471
import java.util.Scanner;
public class TakeOrder_Yourname {
    
    public static void main(String[] args) {
        manu();
    }
    
    public static void manu(){
        Customer_Yourname cy = new Customer_Yourname("Tan Zheng Wey", 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to AAW Home Cooked Services");
        System.out.println("1. Process order");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        int input = scan.nextInt();
        if(input == 1){
            System.out.print("Please enter your name: ");
            String Name = scan.nextLine();
            System.out.print("How many orders? ");
            int Orders = scan.nextInt();
            cy[1]=(Name, Orders);
            System.out.println("AAW Home Cooked Services Menu");
            System.out.println("Food Name      Code");
            System.out.println("Chicken Rice   C");
            System.out.println("Fried Noodle   N");
            System.out.println("Fried Rice     R");
            for (int i = 0; i < Orders; i++){
                System.out.print("Please enter food's Code:");
                char fcode = scan.nextChar();
                System.out.print("Please enter the price of the food:");
                double price = scan.nextInt();
                System.out.print("Please enter the quantity of the food: ");
                int quantity = scan.nextInt();
                cy.addOder(fcode, price, quantity);
            }
            System.out.println("\n1. Display receipt");
            System.out.println("2. Display random order");
            System.out.print("Enter your choice: ");
            int display = scan.nextInt();
            if(display == 1)
                cy.displayOrder();
            if(display == 2)
                cy.displayOrder();
            
        }
        if(input == 2){
            System.exit(0);
            System.out.print("Thank You!");
        }
    }
}
