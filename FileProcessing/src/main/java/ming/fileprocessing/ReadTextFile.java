package ming.fileprocessing;

import java.io.*;
import java.util.Scanner;
class ReadTextFile
{
 public static void main ( String[] args ) 
 {
   String fileName = "task2.data" ; //<=== put the name of your text file here
   String line;
   File inName = new File(fileName)

   try{      
     Scanner scanner = new Scanner(fileName);
     
      while (scanner.hasNextLine()){
          String str = new scanne.;
     
     System.out.println( str );
      }
     in.close();
   }
   catch (FileNotFoundException e) {
            e.printStackTrace();
 }
}

