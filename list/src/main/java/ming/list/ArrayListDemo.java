/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.list;

import java.util.ArrayList; 
import java.util.Scanner; 
 
public class ArrayListDemo { 
  public static void main(String[] args) { 
   ArrayList <String>toDoList = new ArrayList <String>(); 
   System.out.println("Enter items for the list, when prompted."); 
   boolean done = false; 
   Scanner keyboard = new Scanner(System.in); 
   
   while (!done) { 
    System.out.print("Type an entry: "); 
    String entry = keyboard.nextLine( ); 
    toDoList.add(entry); 
    System.out.print("More items for the list?(yes/no) "); 
    String ans = keyboard.nextLine( );
    if (!ans.equalsIgnoreCase("yes")) 
      done = true; 
  } 
     System.out.println("The list contains:");  
     for (String element : toDoList) 
        System.out.println(element); 
  
     System.out.print("Enter a String to search for: "); 
        String search = keyboard.nextLine( );
        
        if(toDoList.contains(search)){
            System.out.println(search +" found!");
            System.out.print("Enter a String to replace with: "); 
                String replace = keyboard.nextLine( );
            toDoList.set(toDoList.indexOf(search), replace);
        }
        else{
            System.out.println(search + " not found!");
        }
        
      System.out.println("The list contains:");
      for (String element : toDoList) 
        System.out.println(element); 
  } 
}

