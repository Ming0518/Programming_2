
package ming.fileprocessing;

import java.io.*;
class ReadInts
{
 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat" ;  
   long sum = 0;

   try{      
     File file = new File(fileName);  
      DataInputStream instr = new DataInputStream(new FileInputStream(file));

     //read four integers and add them to sum 
     for(int i=0; i<4; i++)
         sum =sum + instr.readInt();
     
     
     
     //display sum of four integers
     System.out.println( "The sum is: " + sum );
     instr.close();
   }
   catch ( IOException iox ){
     System.out.println("Problem reading " + fileName );
   }
 }
}
