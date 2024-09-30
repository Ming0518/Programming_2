package ming.btask2;

public class TestPolymorphismArray {
 public static void main(String [] args)
  {
   //create array of object for StaffUUM, size: 10. 
      int totalMAS=0, totalInter=0;
      StaffUUM StaffList[] = new StaffUUM[5];
   //create and assign 5 objects into the array. Use multiple objects  
    StaffList[0] = new Malaysian("Khadijah","11200","TISSA",4000,"760308-04-3800","Permanent Residence");
    StaffList[1] = new Malaysian("Amira","11300","SOC",4500,"780518-04-0495","Permanent Residence");
    StaffList[2] = new Malaysian("Syed","11400","SCIMPA",4400,"771001-04-0825","Permanent Residence");;
    StaffList[3] = new International("Suchitra","30000","SELCP",10000,"F9888900","India");
    StaffList[4] = new International("Jamese","31000","SOC",11000,"F9999900","Vietnam");
          
   //use for loop to call method toString() and calculate Allowance(int noOfYear). Assume all staff has been working for 10 years 
      for(int i=0;i<StaffList.length;i++)
   {
    System.out.println("Method toString()" + StaffList[i].toString());
    System.out.printf("%s%.2f%n","UUM Staff bonus is RM ",StaffList[i].calculateAllowance(10));
   }

       for(int i=0;i<StaffList.length;i++)
   {
       if(StaffList[i] instanceof Malaysian){
           totalMAS++;
       }
           
       else if(StaffList[i] instanceof International){
           totalInter++;
       }
           
  }
        System.out.println("Number of Malaysian staff: " + totalMAS);
        System.out.println("Number of Malaysian staff: " + totalMAS);
        System.out.println("Number of International staff: " + totalInter);
}
}