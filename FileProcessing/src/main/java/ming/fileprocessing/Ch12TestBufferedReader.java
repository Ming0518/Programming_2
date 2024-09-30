
package ming.fileprocessing;

import java.io.*;
class Ch12TestBufferedReader {

    public static void main (String[] args) throws IOException {

	//set up file and stream
	File inFile = new File("sample3.data");
	FileReader fileReader = new FileReader(inFile);
	BufferedReader bufReader = new BufferedReader(fileReader);
	String str;

	str = bufReader.readLine();
	int i = Integer.parseInt(str);
        
        System.out.println(str);
        System.out.println(i);
        
        str = bufReader.readLine();
        System.out.println(str);
        
        str = bufReader.readLine();
        System.out.println(str);
	//similar process for other data types

	bufReader.close();
    }
}

