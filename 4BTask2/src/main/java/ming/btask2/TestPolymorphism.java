package ming.btask2;

public class TestPolymorphism {
     public static void main(String[] args) {
         StaffUUM staff1 = new StaffUUM("Aminah","11900","SOC",6000);
         StaffUUM StaffMAS = new Malaysian("Khadijah","11200","TISSA",4000,"760308-04-3800","Permanent Residence") ;
         StaffUUM StaffInter= new International("Suchitra","30000","SELCP",10000,"F9888900","India") ;
         
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is " + staff1.getName());
        System.out.println("UUM Staff Staff ID is " + staff1.getStaffID());
        System.out.println("UUM Staff School is " + staff1.getSchool());
        System.out.printf("%s%.2f%n","UUM Staff salary is RM ", staff1.getSalary());
        System.out.printf("%s%.2f%n","UUM Staff bonus is RM ",staff1.calculateAllowance(11));
        System.out.println(staff1.toString());
        
        System.out.println("\nMALAYSIAN UUM STAFF\n");
        System.out.println("Malaysian UUM Staff name is " + StaffMAS.getName());
        System.out.println("Malaysian UUM Staff Staff ID is " + StaffMAS.getStaffID());
        System.out.println("Malaysian UUM Staff School is "+ StaffMAS.getSchool());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff salary is RM ",  StaffMAS.getSalary());
        System.out.println("Malaysian UUM Staff IC number is " + ((Malaysian)StaffMAS).getIcNum());
        System.out.println("Malaysian UUM Staff residential status is " +((Malaysian)StaffMAS).getResidentialStatus());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff bonus is RM ", StaffMAS.calculateAllowance(10));
        System.out.println(StaffMAS.toString());
        
        System.out.println("\nINTERNATIONAL UUM STAFF\n");
        System.out.println("International UUM Staff name is " + StaffInter.getName());
        System.out.println("International UUM Staff Staff ID is " + StaffInter.getStaffID());
        System.out.println("International UUM Staff School is " + StaffInter.getSchool());
        System.out.printf("%s%.2f%n","International UUM Staff salary is RM ", StaffInter.getSalary());
        System.out.println("International UUM Staff passport number is " + ((International)StaffInter).getPassportNum());
        System.out.println("International UUM Staff origin country is " + ((International)StaffInter).getOriginCountry());
        System.out.printf("%s%.2f%n","International UUM Staff bonus is RM ", StaffInter.calculateAllowance(5));
        System.out.println(StaffInter.toString());
     }
    
}
