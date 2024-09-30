package ming.btask2;

public class TestStaffUUMInheritance {
    public static void main(String[] args) {
        StaffUUM staff1 = new StaffUUM("Sharifah","1199","SOC",3000);
        Malaysian  staff2 = new Malaysian("Syed","1169","SBM",6000,"830818-02-5261","Citizen");
        International staff3 = new International("Jason","2290","SMMTC",10000,"G8990298","United Kingdom");
             
        /*staff1.setName("Sharifah");
        staff1.setStaffID("1199");
        staff1.setSchool("SOC");
        staff1.setSalary(3000);
        
        staff2.setName("Syed");
        staff2.setStaffID("1169");
        staff2.setSchool("SBM");
        staff2.setSalary(6000);
        staff2.setIcNum("830818-02-5261");
        staff2.setResidentialStatus("Citizen");
        
        staff3.setName("Jason");
        staff3.setStaffID("2290");
        staff3.setSchool("SMMTC");
        staff3.setSalary(10000);
        staff3.setPassportNum("G8990298");
        staff3.setOriginCountry("United Kingdom");*/
        
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is " + staff1.getName());
        System.out.println("UUM Staff Staff ID is " + staff1.getStaffID());
        System.out.println("UUM Staff School is " + staff1.getSchool());
        System.out.printf("%s%.2f%n","UUM Staff salary is RM ", staff1.getSalary());
        
        System.out.println("\nMALAYSIAN UUM STAFF\n");
        System.out.println("Malaysian UUM Staff name is " + staff2.getName());
        System.out.println("Malaysian UUM Staff Staff ID is " + staff2.getStaffID());
        System.out.println("Malaysian UUM Staff School is "+ staff2.getSchool());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff salary is RM ",  staff2.getSalary());
        System.out.println("Malaysian UUM Staff IC number is " + staff2.getIcNum());
        System.out.println("Malaysian UUM Staff residential status is " +staff2.getResidentialStatus());
        
        System.out.println("\nNINTERNATIONAL UUM STAFF\n");
        System.out.println("International UUM Staff name is " + staff3.getName());
        System.out.println("International UUM Staff Staff ID is " + staff3.getStaffID());
        System.out.println("International UUM Staff School is " + staff3.getSchool());
        System.out.printf("%s%.2f%n","International UUM Staff salary is RM ", staff3.getSalary());
        System.out.println("International UUM Staff passport number is " + staff3.getPassportNum());
        System.out.println("International UUM Staff origin country is " + staff3.getOriginCountry());
     


    }
    
}
