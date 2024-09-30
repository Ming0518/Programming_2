package ming.a211_stia1123_asgn1_285824;
// OOI YAU MING
// 285824
import java.util.*;
public class A211_STIA1123_Asgn1_285824 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int width,height,num,choice;
        
        System.out.print("Enter number of doors object that you want to create : ");
            num = scan.nextInt();
            
            Door object[] = new Door[num] ;//create array of object 
            
            //assign random value in each array of object 
            for(int i=0; i < object.length; i++){
                width = rand.nextInt(101);
                height = 10 + rand.nextInt(91);
                    object[i] = new Door(width,height);
                    object[i].ShowDoor(i);                
            }
                    
                do{
                    //choose the function
                    System.out.println("**************");
                    System.out.print("Enter\n1 - To Display\n2 - To Edit\n3 - To Exit\n**************\n");
                    System.out.print("Please enter ther function that you want: ");
                        choice = scan.nextInt();
                    
                    //display 
                    if(choice == 1){
                        for(int j=0; j < object.length; j++){
                            object[j].ShowDoor(j);
                        }
                    }
                    
                    //edit
                    else if(choice == 2){
                        System.out.print("Enter door number to edit : ");
                            num = scan.nextInt();
                        System.out.print("Enter new width of door number " + num + " : ");
                            width = scan.nextInt();
                        System.out.print("Enter new height of door number " + num + " : ");
                            height = scan.nextInt();
                            
                            object[num].EditDoor(width,height);
                    }
                    
                    //exit
                    else if(choice ==3){
                        System.out.println("Have A Nice Day.");
                    }
                    
                    //If enter other than 1,2 and 3 will appear this line
                    else{
                        System.out.println("Please enter correct number.");
                    }
         
                }while(choice!=3);
    }
}