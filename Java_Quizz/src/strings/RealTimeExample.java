package strings;

class RealTimeExample {
public static void main(String[] args) {
	StringBuilder logBuilder = new StringBuilder("INFO: 2024-09-11 - Process started");

    // Extract a part of the log message using subSequence()
    CharSequence logInfo = logBuilder.subSequence(0, 5);
    System.out.println("Log info: " + logInfo); // Output: INFO:
    
    // Modify the original StringBuilder
//    logBuilder.append(" - Details updated");
//    logInfo.re
    System.out.println("Updated log: " + logBuilder); // Output: DATA: 2024-09-11 - Process started - Details updated
    
    // Verify that logInfo still points to the original StringBuilder
    System.out.println("Updated log info: " + logInfo); // Output: INFO:
    
    
//    subSequence() provides a view into the original StringBuilder. 
//    If you modify logBuilder, the view (logInfo) remains unchanged, 
//    but it still represents the original part of the StringBuilder.
    
    
    
//    String example
    String text = "Hello, World! This is a test string.";

    System.out.println("actuall string : "+ text);
    // Extract a substring
    String substr = text.substring(13, 28);
    System.out.println("substring : " + substr); // Output: This is a test
    
    // Modify the substring
    // For demonstration, let's simulate a new String creation
    substr= substr.replace("test", "final");
    
    System.out.println("Modified text: " + substr); // Output: Hello, World! This is a final string.
    
    // The snippet remains unchanged
    System.out.println("now aftre modification actuall string remains: " + text); // same as text
    
    //string builder eample
    
    // Original String
    String originalString = "Hello, World!";
    
    // Creating a CharSequence using subSequence
    CharSequence subsequence = originalString.subSequence(7, 12); // Extracts "World"
    
    // Displaying both the original string and the subsequence
    System.out.println("Original String: " + originalString);        // Output: Hello, World!
    System.out.println("Subsequence: " + subsequence);               // Output: World
    
    // Note: since subsequence is a CharSequence view, changes on subsequence won't modify original
    
    // Test changing the subsequence (the original won't change in this case)
    subsequence = "Java"; // Attempting to replace the subsequence
    
    // Printing both again to show that original remains unchanged
    System.out.println("Modified Subsequence: " + subsequence);     // Output: Java
    System.out.println("Original String After Modification: " + originalString); // Output: Hello, World!

}
}
