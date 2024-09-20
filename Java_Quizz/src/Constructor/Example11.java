package Constructor;

public class Example11 {

	private Example11() {
System.out.println("some thing");
	}

	private Example11(int a) {
System.out.println("something ");
	}

	private Example11(int a, String b) {
		System.out.println("something new ");

	} 
//	if all methods are private (like above)you cant event create a subclass for that 
	
	 Example11(int a, String b,int c) {
		System.out.println("something new ");

	} 
	 protected Example11(double b) {
		 System.out.println("spmething newwwws"+b);
	 }
	 //if not all methods are private you can create a child class and creat a constructor and call the method which is public
	public static void main(String[] args) {
		Example11 newobj=new Example11();
		Example11 new2obj=new Example11(6);
		Example11 new3obj=new Example11(7,"jama");
		ChildTry childobj=new ChildTry(5);
		ChildTry childobj1=new ChildTry(2.5,"jaam");



	}
}

class ChildTry extends Example11 {

	public ChildTry(int a) {
		super(5,"jam",9);
		// TODO Auto-generated constructor stub
	}
//	or / and
	public ChildTry(double e,String c) {
		super(3.5);
		// TODO Auto-generated constructor stub
	}

}
