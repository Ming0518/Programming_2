/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ming.list;

import java.util.ArrayList;
public class List {

    public static void main(String[] args) {
        ArrayList <Integer>  numList = new ArrayList <Integer>();
        ArrayList <String>   names   = new ArrayList <String>();

        numList.add(10); 
        numList.add(12); 
        numList.set(1,11);
        names.add("Ali"); 
        names.add(0, "Abu");

        System.out.println(names.get(1));
        System.out.println(names.indexOf("Abu"));
        System.out.println(names.remove(1));
        System.out.println(names.indexOf("Ali"));

        

    }
}
