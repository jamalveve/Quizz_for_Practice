package Constructor;

public class Sample4 {

	int a;
	static String b;

	private int c;
	private static String d;

	protected int e;
	protected static String f;

//	public Sample4(int a, String b, int c, String d, int e, String f) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//		this.e = e;
//		this.f = f;
//
//	}
	
//	protected Sample4(int a, String b, int c, String d, int e, String f) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//		this.e = e;
//		this.f = f;
//
//	}
//	
	 Sample4(int a, String b, int c, String d, int e, String f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

	}
//	private Sample4(int a, String b, int c, String d, int e, String f) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//		this.e = e;
//		this.f = f;
//
//	}
//	

	public void display() {
		System.out.println(a + b + c + d + e + f);
	}

	public static void main(String[] args) {
		Sample4 sample = new Sample4(2, "jamal", 7, "jamu", 8, "jamy");
		sample.display();
	}

}
class subclassTrying extends Sample4{//this is possible unless we have private constrctor

	subclassTrying(int a, String b, int c, String d, int e, String f) {
		super(a, b, c, d, e, f);//pssoble
		// TODO Auto-generated constructor stub
	}
//	subclassTrying(){
//		super();//not possible
//	}
	
	subclassTrying(){
		super(2, "jamal", 7, "jamu", 8, "jamy");//possible
	}
	
}
