package ming.fileprocessing;

import java.io.*;


public class BinaryInput {
    public static void main(String[] args) {
        //set up file and stream
    File inFile = new File("sample1.data");

    try{
    FileInputStream inStream = new FileInputStream(inFile);

    //set up an array to read data in
    int    fileSize  = (int)inFile.length();
    byte[] byteArray = new byte[fileSize];

    //read data in and display them
    inStream.read(byteArray);
    for (int i = 0; i < fileSize; i++) {
            System.out.println(byteArray[i]);
    }

    //input done, so close the stream
    inStream.close();
    }
    catch (FileNotFoundException e) {
                e.printStackTrace();

        }
            catch(IOException e){
                e.printStackTrace();
            }
    }
}
