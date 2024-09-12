package strings;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

	       StringJoiner joinStrings = new StringJoiner(",", "[", "]");
	       // passing comma(,) and square-brackets as delimiter   
	         
	       // Adding values to StringJoiner  
	       joinStrings.add("Scaler");  
	       joinStrings.add("By");  
	       joinStrings.add("InterviewBit");            
	       System.out.println(joinStrings);  
	}

}
