/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.studentmark3;

/**
 *
 * @author user
 */
public class Student extends Mark {
    private String name, matricNumber;
    
    public Student(String cC, String cN,double q, double m, double p, double f,String name, String matricNumber){
        super(cC,cN,q,m,p,f);  
        this.name = name;
        this.matricNumber = matricNumber;
}
    
    public Student(String name, String matricNumber){
        this.name = name;
        this.matricNumber = matricNumber;
    }
    public String getName(){
        return name;
}
    public String getMatricNumber(){
        return matricNumber;
}
    public void setCourseCode(String n){
        super.setCourseName(n);
    }
    
    public void setCourseName(String mN){
        super.setCourseCode(mN);
    }
    
     public void toStringStudent(){
        System.out.println("Student");
        System.out.println("-----------");
        System.out.println("Name\t\t:\t" + name);
        System.out.println("Matrik\t\t:\t" + matricNumber);
        System.out.println("Course Code\t:\t" + super.getCourseCode());
        System.out.println("Course Name\t:\t" + super.getCourseName());
     }
     
     public void toStringMarks(){
        System.out.println("\nMarks:");
        System.out.println("-----------");
        System.out.println("a. Quiz\t\t=\t" + super.getQuiz());
        System.out.println("b. Mid Term\t=\t" + super.getMidTerm());
        System.out.println("C. Project\t=\t" + super.getProject());
        System.out.println("d. FInal\t=\t" + super.getFinal());
     }
     
     public void toStringMarksViaPercentage(){
        System.out.println("\nMarks via percentage:");
        System.out.println("-----------");
        System.out.println("a. Quiz\t\t=\t" + super.get5PercentQuiz());
        System.out.println("b. Mid Term\t=\t" + super.get35PercentMidTerm());
        System.out.println("C. Project\t=\t" + super.get20PercentProject());
        System.out.println("d. FInal\t=\t" + super.get40PercentFinal());
     }
     
     public void toStringTotalMark(){
        System.out.println("\nTotal Mark:");
        System.out.println("-----------");
        System.out.println("TOTAL\t\t=\t" + super.get100PercentTotalMark());
             
     }
     
     public void toStringGrade(){
         String g = "X";
        System.out.println("\nGrade");
        System.out.println("-----------");
       
        if(super.get100PercentTotalMark() >= 90){
            g="A+";
        }
        
        else if(super.get100PercentTotalMark() >= 80 && super.get100PercentTotalMark() < 90){
            g="A";
        }
        
        else if(super.get100PercentTotalMark() >= 75 && super.get100PercentTotalMark() < 80){
            g="A-";
        }
        
        else if(super.get100PercentTotalMark() >= 70 && super.get100PercentTotalMark() < 75){
            g="B+";
        }
        
        else if(super.get100PercentTotalMark() >= 65 && super.get100PercentTotalMark() < 70){
            g="B";
        }
        
        else if(super.get100PercentTotalMark() >= 60 && super.get100PercentTotalMark() < 65){
            g="B-";
        }
        
        else if(super.get100PercentTotalMark() >= 55 && super.get100PercentTotalMark() < 60){
            g="C+";
        }
        
        else if(super.get100PercentTotalMark() >= 50 && super.get100PercentTotalMark() < 55){
            g="C";
        }
        
        else if(super.get100PercentTotalMark() >= 45 && super.get100PercentTotalMark() < 50){
            g="C-";
        }
        
        else if(super.get100PercentTotalMark() >= 40 && super.get100PercentTotalMark() < 45){
            g="D+";
        }
        
        else if(super.get100PercentTotalMark() >= 35 && super.get100PercentTotalMark() < 40){
            g="D";
        }
        
        else if(super.get100PercentTotalMark() >= 0 && super.get100PercentTotalMark() < 35){
            g="F";
        }
                
        System.out.println("GRADE\t\t=\t" + g);
     }
       
}
