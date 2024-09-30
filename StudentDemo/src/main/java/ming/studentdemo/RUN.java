
package ming.studentdemo;

public class RUN {
    public static void main(String[] args) {    
            
        CountNodes sList = new CountNodes();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList.display();    
            
        //Counts the nodes present in the given list    
        System.out.println("Count of nodes present in the list: " + sList.countNodes());    
    }    
}
