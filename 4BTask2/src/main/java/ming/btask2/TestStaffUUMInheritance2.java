package ming.btask2;

public class TestStaffUUMInheritance2 {
public static void main(String[] args) {
        StaffUUM staff1 = new StaffUUM("Aminah","11900","SOC",6000);
        Malaysian  staff2 = new Malaysian("Khadijah","11200","TISSA",4000,"760308-04-3800","Permanent Residence");
        International staff3 = new International("Suchitra","30000","SELCP",10000,"F9888900","India");
        
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is " + staff1.getName());
        System.out.println("UUM Staff Staff ID is " + staff1.getStaffID());
        System.out.println("UUM Staff School is " + staff1.getSchool());
        System.out.printf("%s%.2f%n","UUM Staff salary is RM ", staff1.getSalary());
        System.out.printf("%s%.2f%n","UUM Staff bonus is RM ",staff1.calculateAllowance(11));
        
        System.out.println("\nMALAYSIAN UUM STAFF\n");
        System.out.println("Malaysian UUM Staff name is " + staff2.getName());
        System.out.println("Malaysian UUM Staff Staff ID is " + staff2.getStaffID());
        System.out.println("Malaysian UUM Staff School is "+ staff2.getSchool());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff salary is RM ",  staff2.getSalary());
        System.out.println("Malaysian UUM Staff IC number is " + staff2.getIcNum());
        System.out.println("Malaysian UUM Staff residential status is " +staff2.getResidentialStatus());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff bonus is RM ", staff2.calculateAllowance(10));
        
        System.out.println("\nNINTERNATIONAL UUM STAFF\n");
        System.out.println("International UUM Staff name is " + staff3.getName());
        System.out.println("International UUM Staff Staff ID is " + staff3.getStaffID());
        System.out.println("International UUM Staff School is " + staff3.getSchool());
        System.out.printf("%s%.2f%n","International UUM Staff salary is RM ", staff3.getSalary());
        System.out.println("International UUM Staff passport number is " + staff3.getPassportNum());
        System.out.println("International UUM Staff origin country is " + staff3.getOriginCountry());
        System.out.printf("%s%.2f%n","International UUM Staff bonus is RM ", staff3.calculateAllowance(5));


    }
    
}
