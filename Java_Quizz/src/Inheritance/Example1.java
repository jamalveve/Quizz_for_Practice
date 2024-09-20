package Inheritance;

public class Example1 {
	void method1() {
		System.out.println("some vod method");
	}

	String method2() {
		return "hello";
	}

	static void methodStatic() {
		System.out.println("some parent static method");
	}

	public static void main(String[] args) {
		System.out.println("=============parent obj===========");
		Example1 obj = new Example1();
		obj.method1();
		System.out.println(obj.method2());

		System.out.println("=============parent obj===========");

		Child childobj = new Child();
		childobj.method1();
		System.out.println(childobj.method2());
		childobj.method3();
		childobj.method4();

		System.out.println("=============method hiding===========");

		childobj.methodStatic();
		
		Child.methodStatic();

		Example1.methodStatic();

		System.out.println("=============Upcasting===========");
//		for upcasting child methods will be hidden only parentv metod visible

		Example1 exampleobj = new Child();
		exampleobj.method1();
		System.out.println(exampleobj.method2());
		exampleobj.methodStatic();
		
		



	}
}

class Child extends Example1 {
	@Override
	void method1() {
		System.out.println("some child void method");
	}

	@Override
	String method2() {
		return "hello from child";
	}

	void method3() {
		System.out.println("some child void method");
	}

	String method4() {
		return "hello";
	}

	static void methodStatic() {
		System.out.println("some child static method");
	}

}
