package Check;

import Accessspecifier.Quizz5;

public class checkClass2 extends Quizz5{
	void methods1() {
		System.out.println(s3);
	}
//	checkClass2(){
//		super();//you can calll this way ->but you cant instatntiate
//	}
	
	
	
public static void main(String[] args) {
	checkClass2 obj=new checkClass2();
	obj.methods1();
	Quizz5 objcns=new Quizz5();
//	objcns.methodfrom();//not possible revrerse possible 
}
protected void methodFromChild() {
	System.out.println("protected mthof fro child");
}
}
