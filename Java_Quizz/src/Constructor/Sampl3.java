package Constructor;

public class Sampl3 {
	public static void main(String[] args) {
		Box box=new Box();
box.width=100;
box.length=200;
box.breadth=300;
	}

}
class Box{
	int width;
	int breadth;
	int length;
	int volume;
	
	 public void finalize() {
		volume=width*length*breadth;
		volume=width*length*breadth;

	}
	protected void volume() {
		volume=width*length*breadth;
		volume=width*length*breadth;

		
	}
}