/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trytest;

import java.util.*;

public class list {
    public static ArrayList <String> NEW = new ArrayList <String>();
    public static ArrayList <String> Current = new ArrayList <String>();
    
    public static void displayPlay(){
        for(int i=1; i<=9; i++){
            String num = Integer.toString(i);
            NEW.add(num);
            Current.add(num);
        }
    }
    
    public static void dispalyNew(){
        System.out.println("");
        for(int i=8;i>=0; i-=3){
            System.out.print(list.NEW.get(i-2) + " | ");
            System.out.print(list.NEW.get(i-1) + " | ");
            System.out.print(list.NEW.get(i) + "\n");
            
            list.Current.set(i-2,list.NEW.get(i-2));
            list.Current.set(i-1,list.NEW.get(i-1));
            list.Current.set(i,list.NEW.get(i));
        }
    }
    
    public static void dispalyCurrent(){
        System.out.println("");
        for(int i=8;i>=0; i-=3){
            System.out.print(list.Current.get(i-2) + " | ");
            System.out.print(list.Current.get(i-1) + " | ");
            System.out.print(list.Current.get(i) + "\n");
        }
    }
}
