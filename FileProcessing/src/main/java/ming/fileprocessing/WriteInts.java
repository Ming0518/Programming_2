
package ming.fileprocessing;

import java.io.*;
public class WriteInts
{

 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat";

   int value1 = 0, value2 = 1, value3 = 255, value4 = -1;

   try{      
     File file = new File(fileName);
     FileOutputStream outFile = new FileOutputStream( file);
     DataOutputStream outData = new DataOutputStream(outFile);

     outData.writeInt(value1);
     outData.writeInt(value2);
     outData.writeInt(value3);
     outData.writeInt(value4);
     outData.close();
   }
   catch (IOException iox )
   {
     System.out.println("Problem writing " + fileName );
   }
 }
}

