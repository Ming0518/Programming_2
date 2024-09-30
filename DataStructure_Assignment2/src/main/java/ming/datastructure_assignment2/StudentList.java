package ming.datastructure_assignment2;

import java.util.*;
public class StudentList {
    Scanner scan= new Scanner(System.in);
    
            
    String Name , MatricNo , INARSIS, phone_number , Programme, College ;
    int Current_Semester ;
    boolean check;
    
    LinkedList<Student> StuList = new LinkedList<Student>();
	Iterator <Student> Itera = StuList.iterator();

  
    void InputStudentInfo() {
        System.out.print("Please enter your name\t\t\t: ");
            Name = scan.nextLine();
            
        System.out.print("Please enter your Matric No.\t\t: ");
            MatricNo = scan.nextLine();
            
        System.out.print("Please enter your INASIS\t\t: ");
            INARSIS = scan.nextLine();
            
        System.out.print("Please enter your hand phone number\t: ");
            phone_number = scan.nextLine();
            
        System.out.print("Please enter your current semester\t: ");
            Current_Semester = scan.nextInt();
                scan.nextLine();
                
        System.out.print("Please enter your programme name\t: ");
            Programme = scan.nextLine();
            
        System.out.print("Please enter your college name\t\t: ");
            College = scan.nextLine();
            
            StuList.add(new Student(Name,MatricNo,INARSIS,phone_number,Current_Semester,Programme,College));
    }    
    
    void SearchStudentInfo(){
        check = true;
        int count = 1;
		System.out.print("Please Enter The Matric Number You Want To Search: ");
		MatricNo = scan.nextLine();
		System.out.println("___________________________________________________________________");
		Itera = StuList.iterator();
		
		while(Itera.hasNext()) {
			Student details =Itera.next();
			
			if(details.getMatric().equals(MatricNo)) {
                            System.out.println("Student Name\t\tMatric No\tSemester\tProgramme");
                            System.out.print(count + ".");
				System.out.print(details);
				check = false;
                                count++;
			}
			
		}
		if(check) {
			System.out.println("No Data!!\nPlease Make sure you enter correct Matric No. ");
		}
		}
    
    void UpdateStudentInfo(){
    check = true;
		System.out.print("Please Enter The Matric Number You Want To Change: ");
                    MatricNo = scan.nextLine();
                        
		ListIterator<Student> StuItera = StuList.listIterator();
		while(StuItera.hasNext()) {
			Student details = StuItera.next();
		
        if(details.getMatric().equals(MatricNo)) {
                System.out.print("Please enter your name\t\t\t: ");
                    Name = scan.nextLine();

                System.out.print("Please enter your Matric No.\t\t: ");
                    MatricNo = scan.nextLine();

                System.out.print("Please enter your INASIS\t\t: ");
                    INARSIS = scan.nextLine();

                System.out.print("Please enter your hand phone number\t: ");
                    phone_number = scan.nextLine();

                System.out.print("Please enter your current semester\t: ");
                    Current_Semester = scan.nextInt();
                        scan.nextLine();

                System.out.print("Please enter your programme name\t: ");
                    Programme = scan.nextLine();

                System.out.print("Please enter your college name\t\t: ");
                    College = scan.nextLine();
			
                    StuItera.set(new Student(Name,MatricNo,INARSIS,phone_number,Current_Semester,Programme,College));
			
				check = false;
				}
			}
                if(check){
                    System.out.println("No Data!!\nPlease Make sure you enter correct Matric No. ");
                }
}  
    
    void DisplayStudentInfo() {
		Itera = StuList.iterator();
                int count = 1;
		while(Itera.hasNext()) {
                    
                        System.out.print(count + ".");
                            Student details = Itera.next();
                            System.out.print(details);
                                count++;
			}
		}
}