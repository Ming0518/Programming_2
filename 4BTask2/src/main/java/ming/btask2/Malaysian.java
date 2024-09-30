package ming.btask2;

public class Malaysian extends StaffUUM {
    private String icNum;
    private String residentialStatus;

public Malaysian(String N, String ID, String Sc, double SY, String IC, String RC){
   super(N,ID,Sc,SY) ;
    icNum = IC;
    residentialStatus = RC;
}

  public String toString()
  {
      return "This is toString() method inside Malaysian";
  }
/*public void setIcNum(String IC){
    icNum = IC;
}
public void setResidentialStatus(String RC){
    residentialStatus = RC;
}*/
public String getIcNum(){
    return icNum;
}
public String getResidentialStatus(){
    return residentialStatus;
}

public double calculateAllowance(int noOfYear)
 {
    double bonus = noOfYear *500 + 500;
    return bonus;
 }

}





