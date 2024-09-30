/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banker;

import java.util.*;
public class ListBanker{  
    public static NodeBanker head;
    
    public static NodeBanker getHead() {
        return head;
    }
 
    
    public static void add(Banker banker) {
        NodeBanker newNode = new NodeBanker(banker);
        if (head == null) {
            head = newNode;
        } else {
            NodeBanker current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    


    
    public static void delete(String id){
        if(head == null){
            System.out.println("Cannot delete data");
            return;
        }
        if(head.getBanker().getId().equals(id)){
            head = head.getNext();
            return;
        }
        
        NodeBanker current = head;
        while(current.getNext() != null){
            if (current.getNext().getBanker().getId().equals(id)){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }
    
    public void edit(String id, Banker newBanker){
        NodeBanker current = head;
        while(current != null){
            if (current.getBanker().getId().equals(id)) {
                current.getBanker().setName(newBanker.getName());
                current.getBanker().setEmail(newBanker.getEmail());
                current.getBanker().setPhoneNumber(newBanker.getPhoneNumber());
                current.getBanker().setWorkExperience(newBanker.getWorkExperience());
                return;
            }
            current = current.getNext();
        }
    }
   
    public Banker display(String id) {
        NodeBanker current = getHead();

        while (current != null) {
            if (current.getBanker().getId().equals(id)) {
                return current.getBanker(); 
            }
            current = current.getNext();
        }
        return null;
    }
}
