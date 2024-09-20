package Inheritance;

public class Example2 {

	void Method() {
		System.out.println("some paraet method");
	}

	static String method2() {
		return "Hekoo";
	}

	public static void main(String[] args) {

		System.out.println("======object creation by child class======");
		ExampleChild obj = new ExampleChild();
		obj.Method();
		System.out.println("=======object creation By parent classs====");
		Example2 objparent = new Example2();
		objparent.Method();

		System.out.println("========object creation Upcasting======");

		// upcatsing vs overiding
		Example2 objref = new ExampleChild();
		objref.Method();
		System.out.println(Example2.method2());
		System.out.println(ExampleChild.method2());

	}
}

class ExampleChild extends Example2 {
	@Override
	void Method() {
		System.out.println("some child method");
	}

	static String method2() {
		return "Hekoo";
	}
}