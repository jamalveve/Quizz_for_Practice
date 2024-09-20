package Constructor;

public  class Sample9 {
	int a;
	private Sample9() {
System.out.println("default");
	}
	 private Sample9(int a) {
		this.a=a;

	}
	

	public static void main(String[] args) {

		Sample9 sample=new Sample9();
		
		
	}
}
class subclastry extends Sample9{
	
}
