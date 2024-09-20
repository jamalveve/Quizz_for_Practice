package Constructor;

public class Sample6 {

	public static void main(String[] args) {
		// Attempt to create an instance of SuperClass directly (not possible)
		// SuperClass obj1 = new SuperClass(); // This line would cause a compilation
		// error

		// Use the static method to create an instance of SuperClass
		SuperClass obj1 = SuperClass.createInstance();

		// Create an instance of SubClass
		SubClass obj2 = SubClass.createInstance();
	}

}

//Superclass with a private constructor
class SuperClass {
	private SuperClass() {
		// Private constructor
	}
	 SuperClass(int a) {
		// Private constructor
	}
	// Static method to provide access to create instances
	public static SuperClass createInstance() {
		return new SuperClass();
	}
}

//Subclass of SuperClass
class SubClass extends SuperClass {
	public SubClass() {
		// Cannot call SuperClass() constructor here
	}

	public SubClass(int a) {
      super(a);
	}
	// Static method to create instances of SubClass
	public static SubClass createInstance() {
		return new SubClass();
	}
}
