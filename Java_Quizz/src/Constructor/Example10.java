package Constructor;

public class Example10 {

	Example10(int a) {

	}
	Example10() {

	}

	static void method1() {

	}

	void method2() {

	}
}

class ChildCheck1 extends Example10 {
	ChildCheck1(int a) {
		super(a);
	}

	void method1() {

	}

	void method2() {

	}
}
