package Accessspecifier;

import Check.checkClass2;

public class Quizz5 {
	
    protected static String s3= "bc";//chek for outside the package CHECKCLASS2
    
//    protected Quizz5(){
//    	System.out.println("constructor");
//    }//RULE 2
    protected void methodfrom() {
    	System.out.println("some randome method");
    }
//    private Quizz5() {
    	//RULE 2
//    }

public static void main(String[] args) {
//	C.methodOfC();
	C obj=new C();
	obj.methodOfcNonStatic();
	obj.method1();
	
	Quizz5 obj5=new Quizz5();
	obj5.methodfrom();
	
	checkClass2 checjobj=new checkClass2();//if is is having default constructor means also  not pssoble to creae obj
	
//checjobj.methodFromChild();how to access this?
	
	
}

}
 
class A
{
    protected static String s = "A";
    protected String s1="67";
    void method1() {
    	System.out.println(s);//possoble
    	
    }
    public static void method2() {
//    	System.out.println(s1);///npt possible
    }
}
 
class B extends A
{
     
}
 
class C extends B
{   
//    static void methodOfC()
//    {
//        System.out.println(s);//possible
//	System.out.println(s1);//possoble not

	
//    }
    void methodOfcNonStatic() {
    	System.out.println(s);//posoble
    	System.out.println(s1);//possoble
    }
}
 

