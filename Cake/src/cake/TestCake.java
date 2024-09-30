package cake;

public class TestCake{
public static void main(String[] args) {
    double totalpriceRMCake=0, quantityRMCake=0;
    //int highest=0;
        Cake testCake[] = new Cake[5];
        
        testCake[0] = new orderCake("coklat",50,1.5);
        testCake[1] = new orderCake("vanila",60,2.5);
        testCake[2] = new orderCake("red valvet",50,1.8);
        testCake[3] = new readymadeCake("coklat vanila",65,5);
        testCake[4] = new readymadeCake("vanila velvet",50,3);  
        
        for(int i=0; i<testCake.length; i++){
            System.out.println("Cake " + (i+1) + " RM " + testCake[i].calcPrice());
        }
        
        
        for(int i=0; i<testCake.length; i++){
            if(testCake[i] instanceof readymadeCake){
                totalpriceRMCake= totalpriceRMCake + testCake[i].calcPrice();
                quantityRMCake = quantityRMCake +(testCake[i].calcPrice()/testCake[i].rate);  
        }
        }
        System.out.println("Total Price for readymadeCake RM " + totalpriceRMCake);
        System.out.println("Total quantity for readymadeCake " + quantityRMCake);
                
        
        
        double max = testCake[0].calcPrice();
        int maxcake = 0;
        for(int i = 1; i<testCake.length; i++ ){
            if(max<testCake[i].calcPrice()){
                max= testCake[i].calcPrice();
                maxcake=i;
         }
        }
      
        System.out.println("The cake that has been sold for the highest price is "
                + testCake[maxcake].name + " with rate " + testCake[maxcake].rate +
                " with price RM " + testCake[maxcake].calcPrice());
}
}  // end Test