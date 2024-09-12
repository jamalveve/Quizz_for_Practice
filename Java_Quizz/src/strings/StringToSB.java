package strings;

public class StringToSB {
public static void main(String[] args) {
	String str1="Hello";
   //way 1
	StringBuilder stb=new StringBuilder(str1);
	System.out.println(stb.toString());

	

	
	//way 2
	StringBuilder stb1=new StringBuilder();
	stb1.append(str1);
	System.out.println(stb1.toString());
	
	
	///multiple strings
	String[] strings = { "Hello", "from", "StringBuilder!" };
	StringBuilder sb = new StringBuilder();

	for (String str : strings) {
	    sb.append(str).append(" "); // Append each string followed by a space
	}
	System.out.println(sb);

}
}