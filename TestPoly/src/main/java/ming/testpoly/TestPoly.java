package ming.testpoly;

public class TestPoly {

    public static void main(String[] args) {
        X abc = new X();
        abc.printName();

        X def = new Y();
        def.printName();
        System.out.println(def.returnInt());

        X ghi = new Z();
        System.out.println(ghi.returnInt());

        ghi = new Y();
        ghi.printName();

        X [] arr = new X[2];
        arr[0] = new Y();
        arr[1] = new Z();

        for(int i=0;i<arr.length;i++)
        {
         System.out.println(arr[i].returnInt());
         if(arr[i] instanceof X)
          System.out.println("Instance of X");
         
         if(arr[i] instanceof Y)
          System.out.println("Instance of Y");
         
         if(arr[i] instanceof Z)
          System.out.println("Instance of Z");
   }
   
 }
}//end of class TestPoly

