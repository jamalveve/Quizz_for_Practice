package Abstract;

public abstract class Example2 {

	private Example2(int a){
		
	}
	private  Example2() {
		
	}
	public Example2(int a,String b) {
		
	}//same story as constrcutor
	
}

class ChildTest extends Example2{

	public ChildTest(int a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}
