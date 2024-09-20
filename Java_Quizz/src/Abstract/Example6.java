package Abstract;

public class Example6 {

    public static void main(String[] args) {
        Animal myDog = new Dogs();
        myDog.makeSound(); // Outputs: Bark
        
        // Cannot call fetch() here since it's not declared in Animal
        // myDog.fetch(); // This would cause a compilation error
        
        Animal myCat = new Cats();
        myCat.makeSound(); // Outputs: Meow
    }

}
abstract class Animal {
    abstract void makeSound();
}

class Dogs extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching!");
    }
}

class Cats extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}


