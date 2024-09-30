/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ming.studentmark3;

/**
 *
 * @author user
 */
import java.util.*;

public class StudentMark3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String name, matrik,cC,cN;
        double quiz,mid,pro,fin;
            Student student[] = new Student[3];
        
        while(count != 3){
        System.out.print("Please Enter Your Name: ");
            name=scan.nextLine();
            
        System.out.print("Please Enter Your Matrik: ");
            matrik=scan.nextLine();
            
        System.out.print("Please Enter Your Quiz: ");
            quiz=scan.nextDouble();
            
        System.out.print("Please Enter Your Mid Term: ");
            mid=scan.nextDouble();
            
        System.out.print("Please Enter Your Project: ");
            pro=scan.nextDouble();
            
        System.out.print("Please Enter Your Final: ");  
            fin =scan.nextDouble();  
            
        System.out.print("Please Enter Your Course Code: ");   
        scan.nextLine();
            cC=scan.nextLine();
            
            
        System.out.print("Please Enter Your Course Name: ");    
            cN=scan.nextLine();
           
        student[count] = new Student(cC, cN,quiz,mid,pro,fin,name, matrik);       
        count++;
        System.out.print("\n");
        
       }
        
        int i=0;
        
        do{
        System.out.println("\n--------------------------"); 
        System.out.println("Student " + (i+1));
        System.out.println("--------------------------"); 
        student[i].toStringStudent();         
        student[i].toStringMarks();
        student[i].toStringMarksViaPercentage();
        student[i].toStringTotalMark();
        student[i].toStringGrade();
             
            i++;
        }while(i !=3);
}
}
