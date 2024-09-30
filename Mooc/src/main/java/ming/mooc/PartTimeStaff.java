/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.mooc;

/**
 *
 * @author user
 */
public class PartTimeStaff extends Employee{
    double ratePerHour,hoursWorked,totalSalary;
    
    public PartTimeStaff(String id, String name, String num,double rate,double hour){
    super(id,name,num );
    ratePerHour = rate;
    hoursWorked = hour;
}
    
    public double calcukateSalary(){
        return ratePerHour * hoursWorked;
    }
    
    public void printInformation(){
        
    }
}
