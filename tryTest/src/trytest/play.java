/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trytest;

import java.util.Random;
import java.util.Scanner;
public class play {
    private static boolean exit = true;
    public static void newPlay(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        list.dispalyNew();
        
        while(true){
            try{            
                System.out.println("choose the number");
                int choose = scan.nextInt();
                if(choose >= 1 && choose <= 9){
                    if(!list.Current.get(choose-1).equals("O") && !list.Current.get(choose-1).equals("X")){
                        list.Current.set(choose-1,"O");
                        list.dispalyCurrent();
                        if(!checkWin())
                            break;
                        while(true){
                            int randomNum = random.nextInt(9);
                            if(!list.Current.get(randomNum).equals("O") && !list.Current.get(randomNum).equals("X")){
                                list.Current.set(randomNum,"X");
                                list.dispalyCurrent();
                                if(checkWin()){
                                    break;
                                }
                                break;    
                            }
                        }
                        if(exit == false)
                            break;
                    } 
                }else{
                    throw new IllegalArgumentException("plase choose other");
                }
                
            }catch(NumberFormatException e){
                System.out.println("input error");      
            }catch(IllegalArgumentException e){
                System.out.print(e.getMessage() + "\n");
            }
        }
    }
    
    public static boolean checkWin(){
        boolean winLose = true;
        for(int i=0; i<3; i++){
            if(list.Current.get(i).equals("O")&&list.Current.get(i+3).equals("O")&&list.Current.get(i+6).equals("O")){
                System.out.println("you win");
                winLose = false;
                break;
            }
            if(list.Current.get(i).equals("X")&&list.Current.get(i+3).equals("X")&&list.Current.get(i+6).equals("X")){
                System.out.println("you lose");
                winLose = false;
                break;
            }
        }
  
        for(int i=0; i<9; i+=3){
            if(list.Current.get(i).equals("O")&&list.Current.get(i+1).equals("O")&&list.Current.get(i+2).equals("O")){
                System.out.println("you win");
                winLose = false;
                break;
            }
            if(list.Current.get(i).equals("X")&&list.Current.get(i+1).equals("X")&&list.Current.get(i+2).equals("X")){
                System.out.println("you lose");
                winLose = false;
                break;
            }
        }
        
        if ((list.Current.get(0).equals("O") && list.Current.get(4).equals("O") && list.Current.get(8).equals("O")) ||
            (list.Current.get(2).equals("O") && list.Current.get(4).equals("O") && list.Current.get(6).equals("O"))) {
            System.out.println("You win");
            winLose = false;
        }
        if ((list.Current.get(0).equals("X") && list.Current.get(4).equals("X") && list.Current.get(8).equals("X")) ||
            (list.Current.get(2).equals("X") && list.Current.get(4).equals("X") && list.Current.get(6).equals("X"))) {
            System.out.println("You lose");
            winLose = false;
        }
        
        int count = 0;
        for(int i=0; i<9; i++){
            if(list.Current.get(i).equals("O"))
                count++;
            if(list.Current.get(i).equals("X"))
                count++;
            if(count == 9){
                System.out.println("draw");
                winLose = false;
                break;
            }      
        }
        exit = winLose;
        return winLose;
    }  
}
