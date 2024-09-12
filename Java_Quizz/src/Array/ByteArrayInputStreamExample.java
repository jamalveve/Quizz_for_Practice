package Array;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
	public static void main(String[] args) throws IOException {
		
		//byte in to chracter
        // Example byte array
        byte[] byteArray = {72, 66, 67, 68, 69}; // Represents 'A', 'B', 'C', 'D', 'E'
        
        // Create a ByteArrayInputStream
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        
        int data;
        System.out.print("Bytes read from ByteArrayInputStream: ");
        
        // Read bytes until the end of the array
        while ((data = byteArrayInputStream.read()) != -1) {
            System.out.print((char) data + " "); // Convert to character and print
        }
        
        // Closing the stream
        byteArrayInputStream.close();
    }
}
