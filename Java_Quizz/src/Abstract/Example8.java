package Abstract;

public abstract class Example8 {


	private Example8(int a){
		
	}
	
	public  Example8() {
		
	}
	public Example8(int a,String b) {
		
	}//same story as constrcutor
	

}
abstract class Example9{
	Example9(){
		
	}
}
class childTtrys extends Example8{
//now fine to extend and no need to create child class constrcutor also as bcz we have zero param public cons in super class
}
class CjildTry2 extends Example9{
	
}
