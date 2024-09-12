package Array;

import java.util.Arrays;

public class StringtoByteArrayConversion {
	public static void main(String[] args) {
    // Original string
    String originalString = "Hello, World!";
    
    // Convert string to byte array
    byte[] byteArray = originalString.getBytes();//using get bytes method
    
    // Print the byte array
    System.out.println("Byte Array: " + Arrays.toString(byteArray));
    
    // Demonstrating conversion back to string
    String newString = new String(byteArray);
    System.out.println("Converted Back to String: " + newString);
}}
