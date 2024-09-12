package strings;

public class StringIntern {

	public static void main(String[] args) {

		//without intern
		
		String string1=new String("hello");
		String string2=new String("hello");
		System.out.println(string1==string2);//prints false
		System.out.println(string1.equals(string2)); //prints true 


		String str1 = new String("Some new string").intern();  //Line1  
		String str2 = new String("Some new string").intern(); //Line2  
		System.out.println(str1 == str2); //prints true  
		System.out.println(str1.equals(str2)); //prints true 
		
		
		String string3 = new String("Some new string").intern();  //Line1  
		String string4= new String("Some other string").intern(); //Line2  
		System.out.println(string3 == string4); //prints true  
		System.out.println(string3.equals(string4)); //prints true 
	}

}
