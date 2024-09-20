package Abstract;

public abstract class Example10 {
	Example10() {
		System.out.println("hello");
	}

	static void m2() {
		System.out.println("Hello Java!");
	}

	public static void main(String[] args) {
		B13 obj = new B13();
		obj.m1();
	}
}

class B13 extends Example10 {
	void m1() {
		Example10.m2();
	}
}