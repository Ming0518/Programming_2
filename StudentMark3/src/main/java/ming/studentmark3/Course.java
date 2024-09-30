package ming.studentmark3;

/**
 *
 * @author user
 */
public class Course{
    private String courseCode, courseName;
    
    public Course(){
    
    }
    
    public Course(String cC, String cN){
        courseCode = cC;
        courseName = cN;
}
    
    public String getCourseCode(){
        return courseCode;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void setCourseCode(String cC ){
        courseCode = cC;
    }
    
    public void setCourseName(String cN){
        courseName = cN;
       
    }
}
