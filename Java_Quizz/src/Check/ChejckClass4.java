package Check;

import Accessspecifier.Quizz8;

public class ChejckClass4 {

	public static void main(String[] args) {
        System.out.println(new B().methodOne(101));//goes to b method 
	}

}
class B extends Quizz8{
//	@Override here methodone is not overrided just a own method of class B.
	int methodOne(int i) {
		return methodTwo(++i);//goes to super class method and comes a 104
	}
}


//Calling new B().methodOne(101) in MainClass invokes methodOne(int i) in B with i equal to 101.

//Inside B.methodOne(int i), the value i is incremented to 102, and methodTwo(102) is called.

//methodTwo(int i) from class A is executed, which increments i to 103 and calls private methodOne(int i).

//Within A.private methodOne(int i), it processes the value 103 and returns 104.
