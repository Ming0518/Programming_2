/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.list;

import java.util.*;
public class TestPersonList {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        Scanner scan = new Scanner(System.in);
        String name,tel; 
        int age;
        boolean done = false;
        
        while (!done) { 
        System.out.print("What is your name?\t\t");
            name = scan.nextLine();
            
        System.out.print("How old are you?\t\t");
            age = scan.nextInt();
                scan.nextLine();
            
        System.out.print("What is your telephone number?\t");
            tel = scan.nextLine();
            
        Person personObj = new Person(name,tel,age);
        
            personList.add(personObj);
           
        System.out.println("You have entered the following information:");
        for (Person element : personList) {
            System.out.println("\n\tYour name:\t\t" + element.name); 
            System.out.println("\tYour age:\t\t" + element.age); 
            System.out.println("\tYour telephone number:\t" + element.tel); 
        }
        
        System.out.print("\nMore items for the list? (yes/no) ");
            String ans = scan.nextLine( );
            
        if (!ans.equalsIgnoreCase("yes")) 
          done = true; 
    }
    }
    
}
