
package ming.pro1;

import java.util.*;
public class Customer {
    Scanner scan = new Scanner(System.in);
    String name,address, email;
    int id,number_ordered;

       public Customer(String n, int i, String a, String e,int o){
           name = n;
           id  = i;
           address = a; 
           email = e;
           number_ordered = o;
           
}
       
    public String getName(){
            return name;      
}
       
    public int getID(){
            return id;      
}
    
    public String getEmail(){
            return email;      
}

       
       public int getNumOrder(){
            return number_ordered;      
}
      
       public void calculateOrder(){
            number_ordered = number_ordered + 1;      
}
       
}
