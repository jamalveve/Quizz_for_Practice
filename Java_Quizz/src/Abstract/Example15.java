package Abstract;

abstract class Abc {
	abstract void m1(int x, double y);

	abstract void m2(String name);

	abstract void methodextra();
}

class Bbc extends Abc {
	void m1(int x, double y) {
		System.out.println("One");
	}

	void m2(String name) {
		System.out.println("Two");
	}

	void m3() {
		System.out.println("Three");
	}

	void m4() {
		System.out.println("Four");
	}

	void methodextra() {
		System.out.println("six");
	}

	static void methodextras() {
		System.out.println("seven static");
	} //when you coment this also method in child class not going to work and you will get compiler error when you call this method using upcasting
}

class dbc extends Bbc {
	static Bbc b;//mae this static so that you can call this in line 53

	void m1(int x, double y) {
		b = new Bbc();
		b.m3();
	}

	void m2(String name) {
		b = new Bbc();
		b.m4();
	}

	static void methodextras() {//so if you want to call this method only way is call by class name  or with the subclass obj
		
		System.out.println("eight static");
		b = new Bbc();
		b.m3();
	}
}

class Cbc extends Abc {
	Bbc b;

	void m1(int x, double y) {
		b = new Bbc();
		b.m3();
	}

	void m2(String name) {
		b = new Bbc();
		b.m4();
	}

	void methodextra() {
		System.out.println("five");
	}
}
class childfordbc extends dbc{
	
}
public class Example15 {

	public static void main(String[] args) {
		Abc a = new Cbc();
		a.m1(20, 30.0);
		a.m2("abc");
		a.methodextra();
		System.out.println("==================");
		Bbc b = new dbc();
		b.m1(2, 89.0);
		b.m2("jam");
		b.m3();
		b.m4();
		b.methodextra();

		b.methodextras();
		
		System.out.println("==================");

		dbc.methodextras();
		System.out.println("==================");
		childfordbc objchild=new childfordbc();
		objchild.methodextras();
	}

}
