/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banker;

import java.util.*;

public class NodeBanker {
    public Banker banker;
    public NodeBanker next;

    public NodeBanker(Banker banker) {
        this.banker = banker;
        this.next = null;
    }

    public Banker getBanker() {
        return banker;
    }

    public NodeBanker getNext() {
        return next;
    }

    public void setNext(NodeBanker next) {
        this.next = next;
    }
}

