
package ming.fileprocessing;

import java.io.*;
class Ch12TestPrintWriter1 {
    public static void main (String[] args) throws IOException {

	//set up file and stream
	File outFile = new File("sample3.data");
        //FileWriter outFileStream = new FileWriter(outFile);
	FileWriter outFileStream = new FileWriter(outFile, true);
	PrintWriter outStream = new PrintWriter(outFileStream);

	//write values of primitive data types to the stream
        outStream.println();
	outStream.println((3333) + "\tSani\t" + (70) + "\tB" );

	//output done, so close the stream
	outStream.close();
   }
}

