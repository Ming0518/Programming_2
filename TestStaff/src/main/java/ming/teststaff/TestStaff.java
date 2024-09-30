
package ming.teststaff;

import java.util.Scanner;
    public class TestStaff {
        static Scanner console = new Scanner(System.in);	
            public static void main(String arg[]){
                   String name, staff_id;
                   int working_perday ; 
                   
                   System.out.print("Enter name : ");
                    name = console.nextLine();
                   System.out.print("Enter Staff ID : ");
                    staff_id = console.next();
                   System.out.print("Enter Hours Working Per Day : ");
                    working_perday = console.nextInt();
                    
                    Staff staffTS = new Staff();
                    staffTS.setStaffInfo(name, staff_id, working_perday);
                    staffTS.calculateSalary();
                    
                    System.out.println("Name : " + staffTS.getName());
                    System.out.println("Staff ID : " + staffTS.getStaffID());
                    System.out.println("Salary : " + staffTS.getSalary());
                    
    }
}
	
class Staff {
	private String name;
        private String staffID ;
	private double salary;
	private int workingDay;
	public void setStaffInfo(String nm, String id, int wDay){
		name=nm;
                staffID=id;
                workingDay=wDay;
	}
	public void calculateSalary(){
		salary = workingDay * 35.0;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getStaffID(){
		return staffID;
	}

}//end class

