package ming.labtest;

//OOI YAU MING
//285824

import java.util.Random;

public class GameNumber {
    int integer;
    GameNumber(int num){
    integer = num;
}
    public void evenOdd(int num){
    
       if(num%2 == 0) 
        System.out.println("\n" + num + " is an even number");
       
       else
        System.out.println("\n" + num + " is an odd number");
}
    
    public void random(int num){
        Random rand = new Random();
        
        System.out.println("The ten random numbers between " + num +" and 50 are: ");  
        
        for(int i=0; i < 10; i++){
            System.out.print(num + rand.nextInt(50-num+1) + " ");
                
        }

       
    }
}
