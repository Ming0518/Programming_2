package ming.btask2;

public class International extends StaffUUM {
    private String passportNum ; 
    private String originCountry ;
    
public International(String N, String ID, String Sc, double SY, String pn, String oc){
       super(N,ID,Sc,SY) ;
        passportNum = pn;
        originCountry = oc;
    }
  public String toString()
  {
      return "This is toString() method inside International";
  }

/*public void setPassportNum (String pn){
    passportNum = pn;
}

public void setOriginCountry(String oc){
    originCountry = oc;
}*/
public String getPassportNum (){
    return passportNum;
}
public String getOriginCountry (){
    return originCountry;
}

public double calculateAllowance(int noOfYear)
 {
    double bonus = noOfYear *200+900;
    return bonus;
 }

}



