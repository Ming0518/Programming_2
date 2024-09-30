
package ming.gui3;


public class GYM {
    int duration;
    String day,member;
    
    GYM(int du, String da, String mem){
        duration= du;
        day= da;
        member= mem;
    }
    double calcMember(){
    double total=0;
    if(day.equals("Weekday"))
        total= duration*3;
    
    if(day.equals("Weekend"))
            total= duration*4;
    
    return total;
}
    double calcNonMember(){
        double total=0;
    if(day.equals("Weekday"))
        total= duration*5;
    
    if(day.equals("Weekend"))
            total= duration*6;
    
    return total;
    }
    
    public String toString() {
        String billInfo = "";
        double charge = 0.0;
        
        if (member.equals("Yes")) {
         charge = calcMember();
         billInfo = "Please pay RM" + charge;
        } 

        
        if(member.equals("No")){
           charge = calcNonMember();
           billInfo = "Please pay RM" + charge;  
        }

        
        return billInfo;
    }
}
