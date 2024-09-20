package Abstract;

public abstract class Example1 {
	
public abstract void method1();
protected abstract void method2();
//private abstract void method3();//no private No, it cannot be private because the abstract method must be implemented in the child class. If we declare it as private, we cannot implement it from outside the class.
 abstract void method4();
public  abstract String method5();
//final abstract void method6();//cant overide final methods any ways no use same as private
//public static abstract void method7();//no static 


public static void concretemethod3() {
	System.out.println("conecrete method static");
}
public  void concretemethod4() {
	System.out.println("conecrete method non static");
}


private void concretMethod() {
	System.out.println("hi something");
}
final String concretMethod2() {
	return "hello";
}

}
class Child extends Example1{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method5() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
