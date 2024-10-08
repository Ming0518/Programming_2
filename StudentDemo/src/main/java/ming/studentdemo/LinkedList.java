
package ming.studentdemo;

public class LinkedList {

private class Node{
    String value;
    Node next;

    Node (String val, Node n){
         value=val;
        next = n;
    }

    Node (String val)
    {
        this(val, null);

    }
}
private Node first;
private Node last;

public LinkedList(){
    first = null;
    last = null;
}

public boolean isEmpty(){
    return first== null;
}

public int size(){
    int count = 0;
    Node p = first;
    while (p !=null){
        count++;
        p = p.next;
    }
    return count;
}

public void add( String s){
    if (isEmpty())
    {
        first = new Node(s);
        last = first;
    }
    else 
    {
        last.next = new Node(s);
        last = last.next;

    }
}

public void  add(int index, String s){
    if (index <0 || index > size()){
        String message = String.valueOf(index);
        throw new IndexOutOfBoundsException(message);
    }


    if (index ==0){
        first = new Node(s, first);
        if (last == null)
            last = first;
        return;
    }

    Node pred = first;
    for (int k = 1; k <= index -1; k++){
        pred = pred.next;
    }
    pred.next = new Node (s, pred.next);

    if (pred.next.next == null){
        last = pred.next;
    }
}
public String toString(){
StringBuilder strBuilder = new StringBuilder();

Node p = first;
while (p != null){
    strBuilder.append(p.value+"\n");
    p = p.next;

    }
    return strBuilder.toString();
}

public String remove(int index){
    if (index <0 || index >=size()){
        String message = String.valueOf(index);
        throw new IndexOutOfBoundsException(message);
    }

    String element;
    if (index == 0){
        element = first.value;
        first = first.next;
        if (first == null){
            last = null;
        }
    }
    else 
    {
        Node pred = first;
        for (int k = 1; k <=index -1; k++)
            pred = pred.next;


        element = pred.next.value;
        pred.next = pred.next.next;
        if (pred.next ==  null)
            last = pred;

    }
    return element;
}




}