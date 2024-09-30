package ming.iterator;

public class Student {
	private String name;
	private String matricNo;
	private String inasis;
	private String phone;
	private int sem;
	private String programme;
	private String college;
	
	public Student(String name,String matricNo,String inasis,String phone,int sem,String programme,String college) {
		this.name = name;
		this.matricNo = matricNo;
		this.inasis = inasis;
		this.phone = phone;
		this.sem = sem;
		this.programme = programme;
		this.college = college;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMatric() {
		return matricNo;
	}
	
	public void setMatric(String matricNo) {
		this.matricNo = matricNo;
	}
	
	public String getInasis() {
		return inasis;
	}
	
	public void setInasis(String inasis) {
		this.inasis = inasis;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getSem() {
		return sem;
	}
	
	public void setSem(int sem) {
		this.sem = sem;
	}
	
	public String getProgramme() {
		return programme;
	}
	
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String toString() {
		return name+"\t"+matricNo+"\t\t"+inasis+"\t"+phone+"\t"+sem+"\t\t"+programme+"\t\t"+college;
		
	}
}

