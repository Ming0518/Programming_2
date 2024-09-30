/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
    LinkedList<String> lList = new LinkedList<>();
        lList.add("red"); // red 
        lList.add(0,"green"); // green->red
        lList.add("blue"); // green->red->blue
        lList.add(1,"yellow"); // green->yellow->red->blue
        lList.remove(lList.size()-1);
        // lList.remove(4-1) // lList.remove(3) // remove blue
        // green->yellow->red – the latest linked list

        Iterator listItr = lList.iterator();
        
        while (listItr.hasNext()) {
          System.out.println(listItr.next());
        }

    }
}
