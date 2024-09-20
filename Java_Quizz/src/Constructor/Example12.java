package Constructor;

public class Example12 {

	Example12(int a ,int b){
		System.out.println("param cons"+ a + b);
	}
	Example12(){
		System.out.println("zero param cons");

	}
	public static void main(String[] args) {
		Example12 newobj=new Example12(2,5);//not possible we have to call the right cnonstructior
		Child obj=new Child(6,9);
		//here unless you call the zeroparaj constructir it wont print bcz once you are calling your own constcrutor jvm wont call defaul constrcutor for a class
	}
}
class Child extends Example12{
	Child(int a ,int b){
		super(2,7);
		System.out.println("child constructor");
	}
}

