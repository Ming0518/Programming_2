
package cake;

public abstract class Cake {
    protected String name;
    protected double rate;
    public Cake(String n,  double r){
        name = n;
        rate = r;
    }
    public abstract double calcPrice();
    
    public String toString(){
        return name+ "\t" + rate ;
    }
}

class orderCake extends Cake{
    private double weight;
    
    public orderCake(String n,double r, double w){
        super(n,r);
        weight = w;
}
    public double calcPrice(){
        return rate * weight ;
    }
}

class readymadeCake extends Cake{
    private double quantity;
    
    public readymadeCake(String n,double r, double q){
        super(n,r);
        quantity = q;
}
    public double calcPrice(){
        return rate * quantity;
    }
    
    public double getQuantity(){
        return quantity;
    }
}