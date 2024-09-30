/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ming.test2;

/**
 *
 * @author user
 */
public class Pet {

   boolean hungry = true;

   public void speak() {

   }

}//end of class Pet

 

class Cat extends Pet {

   public void speak() {

     System.out.println("Meow!");

   }

   public void call() {

      System.out.println("Here kitty, kitty..");

      if (hungry) speak();

   }

}//end of class Cat

 

class Dog extends Pet {

   public void speak() {

      System.out.println("Wolf!");

   }

}//end of class Dog

 

class MagicCat extends Cat {

   boolean peoplePresent = false;

   public void speak() {

   if (peoplePresent)

     super.speak();

   else

     System.out.println("Hello");

   }

}//end of class MagicCat
