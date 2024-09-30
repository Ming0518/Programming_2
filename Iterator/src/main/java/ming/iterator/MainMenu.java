package ming.iterator;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList student = new StudentList();
		Scanner scan = new Scanner(System.in);
		int selection;
		
		do {
			System.out.println("========================================Welcome to the Main Menu!========================================");
			System.out.println("1. Add Student's Info");
			System.out.println("2. Search Student's Info");
			System.out.println("3. Update Student's Info");
			System.out.println("4. Display Student's Info");
			System.out.println("5. Exit Menu");
			System.out.println("\nPlease input your selection: ");
			selection = scan.nextInt();
		
			switch(selection) {
				case 1:
					System.out.println("=========================================Add Student Info Menu==========================================");
					student.AddStudentInfo();
					break;
				case 2:
					System.out.println("========================================Search Student Info Menu========================================");
					student.SearchStudentInfo();
					break;
				case 3:
					System.out.println("========================================Update Student Info Menu========================================");
					student.UpdateStudentInfo();
					break;
				case 4:
					System.out.println("========================================Display Student Info Menu========================================");
					System.out.println("Student name\tMatric No\tInasis\t\t\bHandphone No\tSemester\tProgramme\tCollege\n");
					student.DisplayStudentInfo();
					break;
				}
			}while(selection==1||selection==2||selection==3||selection==4);
			System.out.println("You have exit the menu!");
		
	}

}