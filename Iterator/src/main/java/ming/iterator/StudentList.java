package ming.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentList {
	
	LinkedList<Student> List = new LinkedList<Student>();
	Iterator <Student> i = List.iterator();
	
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	String name,matric,inasis,phoneNum,programme,college;
	int semester;
	boolean found;
	
	public void AddStudentInfo() {
		System.out.println("Enter name: ");
		name = input.nextLine();
	
		System.out.println("Enter Matric no: ");
		matric = input.nextLine();
	
		System.out.println("Enter Inasis: ");
		inasis = input.nextLine();
	
		System.out.println("Enter Handphone no: ");
		phoneNum = input.nextLine();
	
		System.out.println("Enter Semester: ");
		semester = input2.nextInt();
	
		System.out.println("Enter Programme: ");
		programme = input.nextLine();
	
		System.out.println("Enter College: ");
		college = input.nextLine();
	
		List.add(new Student(name,matric,inasis,phoneNum,semester,programme,college));
	}

	public void UpdateStudentInfo() {
		found = false;
		System.out.println("Enter Matric to Update: ");
		matric = input.next();

		ListIterator<Student>li = List.listIterator();
		while(li.hasNext()) {
			Student details =li.next();
		
			if(details.getMatric().equals(matric)) {
				System.out.println("Re-enter name: ");
				name = input.next()+input.nextLine();
			
				System.out.println("Re-enter Matric no: ");
				matric = input.nextLine();
			
				System.out.println("Re-enter Inasis: ");
				inasis = input.nextLine();
			
				System.out.println("Re-enter Handphone no: ");
				phoneNum = input.nextLine();
			
				System.out.println("Re-enter Semester: ");
				semester = input2.nextInt();
			
				System.out.println("Re-enter Programme: ");
				programme = input.nextLine();
				
				System.out.println("Re-enter College: ");
				college = input.nextLine();
			
				li.set(new Student(name,matric,inasis,phoneNum,semester,programme,college));
			
				found = true;
				}
			}
		}
	
	public void SearchStudentInfo() {
		found = false;
		System.out.println("Enter Matric to Search: ");
		matric = input.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		i = List.iterator();
		System.out.println("Student name\tMatric No\tInasis\t\tHandphone No\tSemester\tProgramme\tCollege\n");
		while(i.hasNext()) {
			Student details =i.next();
			
			if(details.getMatric().equals(matric)) {
				System.out.println(details);
				found = true;
			}
			
		}
		if(!found) {
			System.out.println("Record Not Found");
		}
	}

	public void DisplayStudentInfo() {
		i = List.iterator();
		while(i.hasNext()) {
			Student details = i.next();
			System.out.println(details);
			}
		}
	}