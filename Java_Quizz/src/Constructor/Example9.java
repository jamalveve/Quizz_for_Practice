package Constructor;

public class Example9 {
//Example9(){
//	System.out.println("zero param constrcutor"); or line 20
//}//either this should be there or 
Example9(int  a){
	System.out.println(" param constrcutor");
}
Example9(int  a,String b){
	System.out.println(" param constrcutor");
}
public static void main(String[] args) {
	
	Example9 obj=new Example9(2);
	ChildExample9 objChild=new ChildExample9(9);
	objChild.method1();
}
}
//class level->default constructor if we dont have in super construtor you have to create a construtor in child class or keep default cnstrrtor in super classs
class ChildExample9 extends Example9{
//	private static int a;  either this way woth zero param or line numbere 20 param constructor
	ChildExample9(int b,String a) {
		super(2,"jamal"); //or
//		super(b);
	}//either this should be there or line 4
	void method1() {
		System.out.println("sme void method");
	}
	public String method2() {
		return "some return type method";
	}
}

//lets try with constructor
//class ChildExampleConstrctor extends Example9{
//	
//	ChildExampleConstrctor(){
//		
//	}
//}
