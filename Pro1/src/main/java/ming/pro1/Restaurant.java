/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.pro1;

import java.util.*;
public class Restaurant {
    Scanner scan = new Scanner(System.in);
    String name, foods1, foods2, foods3;

    
    public Restaurant(String n, String f1, String f2, String f3){
        name = n;
        foods1 = f1;
        foods2 = f2;
        foods3 = f3;
}
    
   public String getName(){
            return name;      
}
   
   public String DisplayFood(){
            return "1." + foods1 + "\n2." + foods2 + "\n3." + foods3;      
}
   
    public String getFoods1(){
            return foods1;      
}
    
    public String getFoods2(){
            return foods2;      
}
    
    public String getFoods3(){
            return foods3;      
}
   
}
