/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package order_yourname;
// name:Tan Zheng Wey 
// matric number : 284471
public class Order_Yourname extends TakeOrder_Yourname {
    
    private char foodCode;
    private double price;
    private int quantity;
    
    public Order_Yourname(char newCode, double nPrice, int nQuantity){
        foodCode = newCode;
        price = nPrice;
        quantity = nQuantity;
    }
    
    public char getCode(){
        return Code;
    }
    
    public double getPrice(){
       return Price;
    }
    
    public int getQuantity(){
        return Quantity;
    }
    
}
