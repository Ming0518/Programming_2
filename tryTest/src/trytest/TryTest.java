/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trytest;

import java.util.*;

public class TryTest {
    
    static int count=0;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        list.displayPlay();
        while(true){
            System.out.println("Start :1\nExit : 2");
            int input = scan.nextInt();
            if(input == 1){
                
                play.newPlay();
                
            }
            if(input == 2){
                break;
            }
        }
    }
    
}
