
package ming.btask2;

public class StaffUUM {
private String name ;
private String staffID;
private String school ;
private double salary ; 

public StaffUUM(String staffName, String ID, String schoola, double staffSalary){
    name = staffName;
    staffID = ID;
    school =schoola;
    salary = staffSalary;
}

  public String toString()
  {
      return "This is toString() method inside Staff UUM";
  }
/*public void setName(String staffName){
    name = staffName;
}

public void setStaffID(String ID){
    staffID = ID;
}

public void setSchool(String schoola){
    school =schoola;
}

public void setSalary(double staffSalary){
    salary = staffSalary;
}*/

public String getName(){
    return name;
}

public String getStaffID(){
    return staffID;
}

public String getSchool(){
    return school;
}

public double getSalary(){
    return salary;
}

public double calculateAllowance(int noOfYear)
 {
    double bonus = noOfYear *200;
    return bonus;
 }

}