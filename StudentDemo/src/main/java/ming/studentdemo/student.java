
package ming.studentdemo;

public class student {
private int studentID;
private String fName;
private String lName;
private String Address;
private String city;
private String state;
private String zip;
private String major;


public void student(){

}

public void student(int i, String f, String l, String a, String c, String s, String z, String m){
    studentID = i;
    fName = f;
    lName = l;
    Address = a;
    city = c;
    state = s;
    zip = z;
    major = m;
}

public int getStudentID(){
    return studentID;
}
public void setStudentID(int i){
    studentID = i;
}
public String getFName(){
    return fName;
}
public void setFName(String f){
    fName = f;
}
public String getLName(){
    return lName;
}
public void setLName(String l){
    lName = l;
}
public String getAddress(){
    return Address;
}
public void setAddress(String a){
    Address = a;
}
public String getCity(){
    return city;
}
public void setCity(String c){
    city = c;
}
public String getState(){
    return state;
}
public void setState(String s){
    state = s;
}
public String getZip(){
    return zip;
}
public void setZip(String z){
    zip = z;;
}
public String getMajor(){
    return major;
}
public void setMajor(String m){
    major = m;
}

}