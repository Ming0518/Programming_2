
package quiztest;
import java.util.*;
public class QuizTest {


    public static void main(String[] args) {
        List lList = new LinkedList();
        lList.add("red");//red
        lList.add(0,"green");//green red
        lList.add("blue");//green red blue
        lList.add(1,"yellow");//green yellow red blue
        lList.remove(3);//green yellow red
        
        ListIterator listItr = lList.listIterator();
        while (listItr.hasNext()) {
          System.out.println(listItr.next() + " ");
        }
        
        System.out.println();
        listItr = lList.listIterator(lList.size());

        while (listItr.hasPrevious()) {
          System.out.println(listItr.previous() + " ");

        }
    }
    
}
   
