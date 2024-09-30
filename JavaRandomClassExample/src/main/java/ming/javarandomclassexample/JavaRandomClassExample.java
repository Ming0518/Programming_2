package ming.javarandomclassexample;

import java.util.Random;
/* Create a random number that is greater than or equal to 0,
  and less than 100. (It is set to run 20 tests.)*/
public class JavaRandomClassExample {
 public static void main(String[] args){
     
   int numTests = 20; // run 20 random examples
   Random random1 = new Random();// create a new Java Random object
   
   for ( int i=0; i<numTests; i++ ){
     int randomInt = random1.nextInt(100); // get the next random int
     System.out.print(randomInt +" ");
   }
 }
}

