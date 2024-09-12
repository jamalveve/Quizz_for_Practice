package strings;

public class SubSequene {

	    public static void main(String[] args) {
	        // Create a CharSequence instance from a String
	    	//subsring will work for string builder and string buffer also 
	        CharSequence charSequence = "Hello, World!";

	        // Extract a subsequence from the CharSequence
	        CharSequence subSeq1 = charSequence.subSequence(7, 12);
	        CharSequence subSeq2 = charSequence.subSequence(0, 5);

	        // Print the original CharSequence and the extracted subsequences
	        System.out.println("Original CharSequence: " + charSequence);
	        System.out.println("SubSequence from index 7 to 12: " + subSeq1); // Output: World
	        System.out.println("SubSequence from index 0 to 5: " + subSeq2); // Output: Hello
	        
	        
	        // Example with StringBuilder
	        StringBuilder sb = new StringBuilder("Hello, World!");
	        String substrings=sb.substring(2, 4);
	        System.out.println(substrings);
	        CharSequence subSb = sb.subSequence(7, 12);
	        System.out.println("StringBuilder subSequence: " + subSb); // Output: World
	        System.out.println("Type: " + subSb.getClass().getName()); // Output: java.lang.StringBuilder

	        // Example with StringBuffer
	        StringBuffer sf = new StringBuffer("Hello, World!");
	        CharSequence subSf = sf.subSequence(7, 12);
	        System.out.println("StringBuffer subSequence: " + subSf); // Output: World
	        System.out.println("Type: " + subSf.getClass().getName()); // Output: java.lang.StringBuffer
	    }
	}

