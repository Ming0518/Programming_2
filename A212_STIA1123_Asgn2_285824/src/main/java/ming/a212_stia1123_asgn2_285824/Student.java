package ming.a212_stia1123_asgn2_285824;


public class Student {
    private int MatricNo;
    private String name, program, university, status;
    private double weight, height, bmi;  
    
    //constructor  
    Student(int m, String n, String p, String u, String s, double w, double h, double b){
    MatricNo = m;
    name = n;
    program = p;
    university = u;
    status = s;
    weight = w; 
    height = h;
    bmi = b;  
}
    
    //rerturn the value of MatricNo
    public int getMatric() {
		return MatricNo;
	}
    
    //rerturn the value of name
    public String getName() {
		return name;
	}
    
    //rerturn the value of program
    public String getProgram() {
		return program;
	}
    
    //rerturn the value of universit
    public String getUniversity() {
		return university;
	}
    
    //rerturn the value of status
    public String getStatus() {
		return status;
	}
    
    //rerturn the value of weight
    public Double getWeight() {
		return weight;
	}
    
    //rerturn the value of height
    public Double getHeight() {
		return height;
	}
    
    //rerturn the value of bmi
    public Double getBmi() {
		return bmi;
	}
}
