package Array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileToByteArray {
	public static void main(String[] args) {
        try {
            // Specify the file path
            File file = new File("src/FileCheck.txt");
            
            // Create a byte array of the same length as the file
            byte[] byteArray = new byte[(int) file.length()];
            
            // Read the file content into the byte array
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(byteArray);
            fileInputStream.close();
            
            // Print the byte array
            System.out.println("Byte Array: " + Arrays.toString(byteArray));
//            ASCII value of the character 
            
//                    H = 72
//            		e = 101
//            		l = 108
//            		o = 111
//            		(space) = 32
//            		I = 73
//            		a = 97
//            		m = 109
//            		f = 102
//            		r = 114
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
