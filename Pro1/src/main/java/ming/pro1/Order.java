/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.pro1;

/**
 *
 * @author user
 */
public class Order {
        String names, foods ,date; 
            double pay;
            int id;
    
    public Order(int i,String n,String f,String d,double p ){
        id = i;
        names = n;
        foods = f;
        date = d;
        pay = p;
    
}
    
    public int getID(){
            return id;      
}
    
    public String getName(){
            return names;      
}
    
    public String getFood(){
            return foods;      
}
    
    public String getDate(){
            return date;      
}
    
    public double getPay(){
            return pay;      
}
}
