/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.list;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Iterator;
public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(1);  // 1
        aList.add(2);  // 1 -> 2
        aList.add(3);   // 1 -> 2 -> 3
        aList.add(1);   // 1 -> 2 -> 3 -> 1
        aList.add(0,10); // 10 -> 1 -> 2 -> 3 -> 1
        aList.add(3,30);  // 10 -> 1 -> 2 -> 30 -> 3 -> 1
        aList.remove(1);  // 10 -> 2 -> 30 -> 3 -> 1
        aList.set(3,40); // 10 -> 2 -> 30 -> 40 -> 1
        Iterator listItr = aList.iterator();
        
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");   
      }
            System.out.print("\n");
        
        for (int i=0;  i < aList.size(); i++){
            System.out.print(aList.get(i)+ " ");  
        }
        
        System.out.print("\n");
        
        for (Integer arr : aList){
            System.out.print(arr + " ");
        }


    }
}
