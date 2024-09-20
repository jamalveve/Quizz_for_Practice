package Abstract;

public abstract class Example7 {

	void Cocretemethod() {
		System.out.println("how will I print?");
		//how will you call this method
	}
	static void ConcreteStaticMethod() {
		System.out.println("how will I print now?");
	}
	abstract void methodAbstract();
	
	public static void main(String[] args) {
		ChildEx obj=new ChildEx();
		obj.Cocretemethod(); //either this way
		Example7.ConcreteStaticMethod();
	}
}
class ChildEx extends Example7{

	@Override
	void methodAbstract() {
		// TODO Auto-generated method stub
		
	}
	
}
