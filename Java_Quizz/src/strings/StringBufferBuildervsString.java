package strings;

public class StringBufferBuildervsString {

	public static void main(String[] args) {

		StringBuilder stbu=new StringBuilder();
	       //Initial object size
	       System.out.println(stbu.capacity());
	       String str="Scaler";
	       System.out.println(str);
	       String str1 = new String("InterviewBit");
	       System.out.println(str1);
	       str.concat(str1);//immiutable
	       System.out.println(str);
	       
	       str1 += " Articles";         //string update not easy
	       System.out.println(str1);

	       
	       StringBuilder stbu1=new StringBuilder();
	       //Initial object size
	       System.out.println(stbu1.capacity());
	       
	       StringBuffer stbr= new StringBuffer("InterviewBit");
	       System.out.println(stbr);
	       stbr=new StringBuffer("Scaler");//mutable
	       System.out.println(stbr);
	
	       stbr.append(" Articles");       //string update easy
	       System.out.println(stbr);
	       
	       
	       
	       //reall time secnario
	       
	       
	       
	       
	       
	       
	       
	}
	      

}
class LoggingSystem {
    public static void main(String[] args) {
        StringBuilder logBuilder = new StringBuilder("INFO: 2024-09-11 - Process started");

        // Extract a part of the log message using subSequence()
        CharSequence logInfo = logBuilder.subSequence(0, 5);
        System.out.println("Log info: " + logInfo); // Output: INFO:
        
        // Modify the original StringBuilder
        logBuilder.append(" - Details updated");
        System.out.println("Updated log: " + logBuilder); // Output: INFO: 2024-09-11 - Process started - Details updated
        
        // Verify that logInfo still points to the original StringBuilder
        System.out.println("Updated log info: " + logInfo); // Output: INFO:
    }
}

