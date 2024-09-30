
package ming.fileprocessing;

import java.io.*;



class Ch12TestPrintWriter {
    public static void main (String[] args) throws IOException {

	//set up file and stream
	File outFile = new File("sample3.data");
	FileWriter outFileStream  = new FileWriter(outFile);
	PrintWriter outStream = new PrintWriter(outFileStream);

	//write values of primitive data types to the stream
	outStream.println(987654321);
	outStream.println("Hello, world.");
	outStream.println(true);

	//output done, so close the stream
	outStream.close();
   }
}

