package Abstract;

 abstract class A456 {
	abstract void m1(int x, double y);

	abstract void m2(String name);
}

 class B456 extends A456 {
	void m1(int x, double y) {
		System.out.println("One");
	}

	void m2(String name) {
		System.out.println("Two");
	}
}

 class C456 extends B456 {
	static void m1() {
//		this.m2(20, 30);Cannot use this in a static context
//		super(20,45);//Cannot use super in a static context
	}
	void m2() {
		
	}
}

public class Example14 {

	public static void main(String[] args) {
		C456.m1();
	}

}
