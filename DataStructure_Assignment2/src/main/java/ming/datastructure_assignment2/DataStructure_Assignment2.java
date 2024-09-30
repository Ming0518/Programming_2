package ming.datastructure_assignment2;

import java.util.*;

public class DataStructure_Assignment2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int function=0;
        StudentList stu = new StudentList();
        
        do{
        System.out.println("___________________________________________________________________");
        System.out.println("Please choose the function you want with number:");
        System.out.println("1. Insert Information\n2. Display Information\n3. Search Information\n4. Update Infromation\n0. Exit");
        System.out.println("___________________________________________________________________");
        System.out.print("Please enter number 0-4: ");
            function = scan.nextInt();
        System.out.println("___________________________________________________________________");               
        
        if(function==1){
            stu.InputStudentInfo();
        }
        
        else if(function==2){
            System.out.println("Student Name\t\tMatric No\tSemester\tProgramme");
            stu.DisplayStudentInfo();
        }
                               
        else if(function==3){
            stu.SearchStudentInfo();
        }
                 
        else if(function == 4){
            stu.UpdateStudentInfo();
        }
        
        else if(function==0){
            System.out.print("THANKS AND HAVE A NICE DAY.");
        }
        
        else{
             System.out.print("Please enter number between 0-4!!!\n");
        }
        
    }while(function!=0);
        }
}
