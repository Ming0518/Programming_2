package ming.datastructure_assignment2;


public class Student {
    String Name , MatricNo , INARSIS, phone_number , Programme, College ;
    int Current_Semester ;
    
    
    Student(String n,String m,String i,String pn,int s,String p,String c){
        Name = n;
        MatricNo= m; 
        INARSIS =i;
        phone_number = pn; 
        Current_Semester = s;
        Programme = p; 
        College = c;   
    }
    
   public String getName() {
		return Name;
	}

    public String getMatric() {
		return MatricNo;
	}

    public String getInasis() {
		return INARSIS;
	}

    public String getPhone() {
		return phone_number;
	}

    public int getSem() {
		return Current_Semester;
	}

    public String getProgramme() {
		return Programme;
	}

    public String getCollege() {
		return College;
	}
	
        public void setName(String n) {
		Name = n;
	}
        
        public void setMatric(String m) {
		MatricNo = m;
	}
        
        public void setInasis(String i) {
		INARSIS = i;
	}
        
        public void setPhone(String pn) {
		phone_number = pn;
	}
        
        public void setSem(int s) {
		Current_Semester = s;
	}
        
	public void setCollege(String c) {
		College = c;
	}
	
        public void setProgramme(String p) {
		Programme = p;
	}
        
	public String toString() {
		return String.format("%-22s%-16s%-16d%s\n", Name,MatricNo,Current_Semester,Programme);
		
	}
}

