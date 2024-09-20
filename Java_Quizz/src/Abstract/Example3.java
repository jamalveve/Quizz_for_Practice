package Abstract;

abstract class Example3 {
	String name;

	// Constructor
	Example3(String name) {
		this.name = name;
	}

	abstract void sound(); // Abstract method
}

class Dog extends Example3 {
	Dog(String name) {
		super(name); // Calling the constructor of Animal
	}

	void sound() {
		System.out.println(name + " barks");
	}
}

class Cat extends Example3 {
	Cat(String name) {
		super(name); // Calling the constructor of Animal
	}

	void sound() {
		System.out.println(name + " meows");
	}

}
