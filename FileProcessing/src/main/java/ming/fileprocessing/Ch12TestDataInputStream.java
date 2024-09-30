
package ming.fileprocessing;

import java.io.*;
class Ch12TestDataInputStream {
    public static void main (String[] args) throws IOException {
   
    	//set up inDataStream
        File inFile = new File("sample2.data");
        FileInputStream inFileStream = new FileInputStream(inFile);
        DataInputStream inDataStream = new DataInputStream(inFileStream);

    	//read values back from the stream and display them
        int num = inDataStream.readInt();
    	System.out.println(num);
    	System.out.println(inDataStream.readLong());
    	System.out.println(inDataStream.readFloat());
    	System.out.println(inDataStream.readDouble());
    	System.out.println(inDataStream.readChar());
    	System.out.println(inDataStream.readBoolean());

    	//input done, so close the stream
    	inDataStream.close();
    }
}

