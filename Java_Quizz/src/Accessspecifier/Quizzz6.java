package Accessspecifier;

public class Quizzz6 {
	
	private class Inner{

		void method1234() {
			System.out.println("i am from inner class");
		}
	
	}

	public static void main(String[] args) {
//        Innerclass b = new Innerclass();not pssoble
//		->if you have private inner Class that can not be instantiated outside the class(differet class).

//        Inner bjss=new Inner();//cause error
//        bjss.method1234();
        
        Quizzz6 outer = new Quizzz6();//proper instantiate to call inner class
        Quizzz6.Inner inner = outer.new Inner(); // Correct instantiation
        inner.method1234();

	}

}
class Some{
	private class Innerclass{
		void method123() {
			System.out.println("i am from inner class");
		}
	}
}