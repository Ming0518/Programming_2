package ming.gui3;

public class CustomerBill {
    private String custType;
    private String acctNum;
    private int numOfConnections;
    private int numOfPremChannels;
// TODO: add constructor method code here:
 CustomerBill(String t, String a, int c, int p){
    custType = t;
    acctNum = a;
    numOfConnections = c;
    numOfPremChannels = p;
}

// TODO: add calcResidentialCustomer() method code here:
double calcResidentialCustomer(){
    double total = 20 +(7.5 * numOfPremChannels);
    return total;
}

// TODO: add calcBusinessCustomer() method code here:
double calcBusinessCustomer(){
    double total=0;

    if(numOfConnections<=10)
        total = 75 +(20 * numOfPremChannels);
    
    else 
         total = 75 +((numOfConnections-10)*5)+(20 * numOfPremChannels);
    
    return total;
}

    public String toString() {
        String billInfo = "";
        double charge = 0.0;
        
        if (custType.equals("Residential")) {
         charge = calcResidentialCustomer();
         billInfo = "Account Number: " + acctNum + "\n"
             + "Number of premium channels = "+numOfPremChannels+ "\n"
             + "Amount Due = RM"+charge;
        } 

        
        else {
           charge = calcBusinessCustomer();
           billInfo = "Account Number: " + acctNum + "\n"
           + "Number of service connections = "+numOfConnections+ "\n"
           + "Number of premium channels = "+numOfPremChannels+ "\n"
           + "Amount Due = RM"+charge;  
        }

        
        return billInfo;
    }
}
