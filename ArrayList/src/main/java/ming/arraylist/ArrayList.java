

package ming.arraylist;

import java.util.ArrayList;
public class ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        Student [] students = new Student[10];  
            
        numList 
        numList.add(12); 
        numList.set(1,11);
        
        names.add("Ali"); names.add(0, "Abu");
        students.add(new Student("Siti", 10001));
        students.add(new Student("John", 10002));
        System.out.println(students.size());
        System.out.println(names.get(1));
        System.out.println(names.indexOf("Abu"));
        System.out.println(names.remove(1));
        System.out.println(names.indexOf("Ali"));

        System.out.println("Hello World!");
    }
}
