package ming.a212_stia1123_asgn2_285824;

public class StudentOperation {
    private Student[] stu;
    
    StudentOperation(){
        stu =  new Student[5];
}
    //calculate bmi
    public double calculateBMI(double w, double h){
       return w/(h*h) ;
    }
    
    //check status using bmi
    public String getStatusBMI(double bmi){ 
        if(bmi > 35.0){
            return "Severely Obese";
    }	

        else if(bmi >= 30.01 && bmi<= 35.0){
            return "Moderately Obese";
    }	

        else if(bmi >= 25.1 && bmi<= 30.0){
            return "Overweight";
    }           

        else if(bmi >= 18.6 && bmi<= 25.0){
            return "Normal Weight";
    }	

        else if(bmi >= 16.0 && bmi<= 18.5){
            return "Underweight";   
    }
        else{
            return "Severely Underweight.";
        }
    }
    
    //create and save in the array object
    public void saveRecord(int i, Student s){
        stu[i] = s;
    }
    
    //display all the data in system
    public String readAllRecord(int ind){

            return "Information " + (ind+1) + ":\nMatric Number\t: " + stu[ind].getMatric() + "\nName\t: " + stu[ind].getName()
                    + "\nProgram\t: " +  stu[ind].getProgram() + "\nUniversity\t: " + stu[ind].getUniversity() + "\nWeight\t: " 
                    + stu[ind].getWeight() + "\nHeight\t: " + stu[ind].getHeight() + "\nBMI\t: "
                    + String.format("%.2f",stu[ind].getBmi()) + "\nStatus\t: " + stu[ind].getStatus() ;

    }

    //search and print the data using matirc no
    public int searchRecord(int ind, int matric){
        int found = -1;
        for(int i=0; i<ind+1; i++){
            if(matric == stu[i].getMatric()){
                found= i;  
            }
        }
            return found;
        }
    
    //get the value of name
     public String getName(int i) {
            return stu[i].getName();
            }
     
    //get the value of program
    public String getProgram(int i) {
            return stu[i].getProgram();
            }
    
    //get the value of University
    public String getUniversity(int i) {
            return stu[i].getUniversity();
            }
    
    //get the value of Status
    public String getStatus(int i) {
            return stu[i].getStatus();
            }
    
    //get the value of Weight
    public String getWeight(int i) {
            return Double.toString(stu[i].getWeight());
            }
    
    //get the value of Height
    public String getHeight(int i) {
            return Double.toString(stu[i].getHeight());
            }
    
    //get the value of Bmi
    public String getBmi(int i) {
            return String.format("%.2f", stu[i].getBmi());
            }

    }
