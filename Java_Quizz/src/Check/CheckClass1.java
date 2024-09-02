package Check;

import Accessspecifier.quizz4;

//import Accessspecifier.quizz4;

public class CheckClass1 extends quizz4{

//	quizz4 obj=new quizz4();
//	Because, we can’t instantiate a class outside the package which has  protected constructors.

	public CheckClass1() {
        super();     //calling super class's protected constructor is possible

//		super();//possibke
	}
	public static void main(String[] args) {
		CheckClass1 obj=new CheckClass1();//possible
	}
}
