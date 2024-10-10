package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversestringsWays {
	
	//using collection
	//suing reverse forloop travsersing as charater
	//using trungbuilder buffer 
	public static String reverse(String text) {
		String[] str=text.split(" ");
		Collections.reverse(Arrays.asList(str));
		return String.join(" ",str);
	}
	
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  
public static void main(String[] args) {
	String s1="Hello I am a string";
	
	//way 1 reverse the each letter also
	StringBuilder stb=new StringBuilder(s1);
	stb.reverse();
	System.out.println(stb);
	
	
	StringBuilder stbs=new StringBuilder();
	stbs.append(s1);
	stbs.reverse();
	System.out.println(stbs);
	
	
	//way 2 reverse only the world not char
	String text="hello i am a new string";
	System.out.println(reverse(text));
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string you want to reverse : ");//check quizz prohect
	String sentence=sc.nextLine();
	System.out.println(reverse(sentence));

	
	//way 3
	System.out.println(reverseString("my name is khan"));  
    System.out.println(reverseString("I am sonoo jaiswal"));  
	
	
	
}
}

