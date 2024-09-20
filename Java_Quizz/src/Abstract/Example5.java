package Abstract;

public class Example5 {

	public static void main(String[] args) {

		System.out.println("=================");
		D d = new D();
		d.m1(new B());
		System.out.println("=================");
		d.m1(new C());
		System.out.println("=================");
		d.m1(new D());

		System.out.println("=================");
		C c = new C();
		c.m1(new B());
		System.out.println("=================");
		c.m1(new C());
		System.out.println("=================");
		c.m1(new D());

		System.out.println("=================");

		B b = new B();
		b.m1(new B());
		System.out.println("=================");
		b.m1(new C());
		System.out.println("=================");
		b.m1(new D());
		System.out.println("=================");

		c.m1();// prints one

	}

}

abstract class A {

	abstract void m1(A a);

	void m1() {
		System.out.println("One");
	}
}

class B extends A {
	void m1(A a) {
		System.out.println("two");
		super.m1();
	}
}

class C extends B {
	void m1(B b) {
		System.out.println("Three");
//		super.m1(b);// or
		super.m1(new B());

	}
}

class D extends C {

	void m1(C c) {
		System.out.println("four");
//		super.m1(c);// or
		super.m1(new D());

	}

}
