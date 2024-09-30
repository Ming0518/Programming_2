package ming.node;

public class Node {
    
           
   // Data fields for Node   
   private Object info;       // data stored in the node
   private Node link;         // link to next node

   // Methods
   // Constructors
   // postcondition: Creates a new empty node.
   public Node() {
     info = null;
     link = null;
   }

   // postcondition: Creates a new node storing obj.
   public Node(Object obj) {
     info = obj;
     link = null;
   }

   // postcondition: Creates a new node storing obj 
   //   and linked to node referenced by next.
   public Node(Object obj, Node next) {
     info = obj;
     link = next;
   } 

// accessors

   public Object getInfo() 
   {
      return info;
   }

   public Node getLink() 
   {
      return link;
   }


   // mutators
   public void setInfo(Object newInfo) 
   {
      info = newInfo;
   }

   public void setLink(Node newLink) 
   {
      link = newLink;
   }
} 

