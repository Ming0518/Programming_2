
package Banker;

public class Banker1{


    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private int workExperience;
    
    public Banker1(String id, String name, String email, String phoneNumber, int workExperience){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.workExperience = workExperience;
    }
    
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getWorkExperience(){
        return workExperience;
    }
    public void setWorkExperience(int workExperience){
        this.workExperience = workExperience;
    }
}
