package Abstract;

 abstract class A123 {
	private int x;

	A123(int x) {
		System.out.println("Value of x: " + x);
	}

	abstract void m1(int x, double y);
}

 class B123 extends A123 {
	private int y;

	B123(int y) {
		super(10);
		System.out.println("Value of y: " + y);
	}

	void m1(int x, double y) {
		System.out.println("One");
	}

	void m2() {
		System.out.println("Two");
		this.m1(5, 10.50);
	}
}

 class C123 extends B123 {
	C123() {
		super(30);
	}

	void m1(int x, double y) {
		super.m1(10, 15.15);
		System.out.println("Three");
	}
}

public class Example13 {

	public static void main(String[] args) {
		B123 b = new C123();
		b.m1(10, 20.50);
		b.m2();
		
		C123 c=new C123();
		c.m1(23, 2.6);
		c.m2();
	}

}
