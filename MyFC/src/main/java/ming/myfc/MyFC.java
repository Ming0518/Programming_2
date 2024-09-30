package ming.myfc;
import java.util.Scanner;
    public class MyFC {
        static Scanner console = new Scanner(System.in);	
            public static void main(String arg[]){
                   String name, staff_id;
                   int total_hours ;
                   double total_sales;
                   
                   System.out.print("Enter name : ");
                    name = console.nextLine();
                   System.out.print("Enter Staff ID : ");
                    staff_id = console.next();
                   System.out.print("Enter Total Hours Working Per Months : ");
                    total_hours = console.nextInt();
                   System.out.print("Enter Totals Sales Per Day : ");
                    total_sales = console.nextDouble();
                    
                    Staff staffTS = new Staff(name, staff_id, total_hours, total_sales);
                    staffTS.calculateBasicWage();
                    staffTS.calculateCommission() ;
                    staffTS.calculateTotalSalary() ;
                    staffTS.displaySalary() ;
                    
    }
}
	
class Staff {
	private String name;
        private String staffID ;
	private double salary;
        private double total_sales;
        private double commission;
        private double total_salary;
	private int total_hours;
        
	Staff(String nm, String id, int T_Hours, double T_Sales){
		name= nm;
                staffID= id;
                total_hours = T_Hours;
                total_sales = T_Sales;
	}
        
        public void calculateBasicWage(){
            salary = total_hours * 8.0;
        }
        public void calculateCommission(){
            if(total_sales < 150)
                commission = 0;
            
            if(total_sales >= 150 && total_sales<= 300)
                commission = total_sales * 0.05;
            
            if(total_sales >= 301 && total_sales<= 500)
                commission = total_sales * 0.10;
            
            if(total_sales > 500)
                commission = total_sales * 0.15;
                
        }
        public void calculateTotalSalary(){
            total_salary = salary + commission;
        }
        public void displaySalary(){
            System.out.println("Staff Name\t: " + name );
            System.out.println("Staff ID\t: " + staffID );
            System.out.println("Hours Work\t: " + total_hours );
            System.out.println("Total Sale\t: RM " + total_sales );
            System.out.println("Basic Wage\t: RM " + salary );
            System.out.println("Commission\t: RM " + commission );
            System.out.println("Total Salary\t: RM" + total_salary );
         
        }
}//end class


