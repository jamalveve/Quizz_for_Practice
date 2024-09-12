package strings;

public class CapitalizeEachWord {
public static void main(String[] args) {
	String str="new string";
	
	str.toUpperCase();
	System.out.println(str);//wont work
	
	String strUpper=str.toUpperCase();
	System.out.println(strUpper);
}
}
