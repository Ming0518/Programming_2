/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.mooc;

/**
 *
 * @author user
 */
public class PermanentStaff extends Employee{
    double basicSalary,allowance,totalSalary;
    
    public PermanentStaff(String id, String name, String num,double basic,double all){
    super(id,name,num );
    basicSalary = basic;
    allowance = all;
}
    
    public double calcukateSalary(){
        return basicSalary + allowance;
    }
    
    public void printInformation(){
        
    }
}
