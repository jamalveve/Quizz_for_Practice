package strings;

public class StringSplitways {
	public static void main(String[] args) 
	 {
	   String str = "Scaler by InterviewBit";
	   // split string from space
	   String[] result = str.split(" ");
	   for (int i=0; i < result.length; i++)
	   {
	     System.out.println(result[i]);
	   }
	 }
}
