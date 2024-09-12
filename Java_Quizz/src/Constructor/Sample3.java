package Constructor;



final class Complex2 {
    private double re, im;
    private double[] history; // Mutable field to demonstrate deep copy

    // Constructor to initialize real, imaginary, and an array for history
    public Complex2(double re, double im) {
        this.re = re;
        this.im = im;
        this.history = new double[] { re, im }; // Example initial state
    }

    // Copy constructor
    Complex2(Complex2 c) {
        System.out.println("Copy constructor called");
        this.re = c.re;
        this.im = c.im;
        this.history = c.history.clone(); // Creating a new array instance for deep copy
    }

    // Method to modify the history array
    public void updateHistory(double newRe, double newIm) {
        this.re = newRe;
        this.im = newIm;
        this.history[0] = newRe; // Updating the history with new values
        this.history[1] = newIm;
    }

    public String toString() {
        return "(" + re + " + " + im + "i), History: [" + history[0] + ", " + history[1] + "]";
    }
}

public class Sample3 {
    public static void main(String[] args) {
        Complex2 c1 = new Complex2(10, 15);
        Complex2 c2 = new Complex2(c1); // Using the copy constructor
        Complex2 c3 = c1;  // Reference to the same object as c1

        System.out.println("Original c1: " + c1);
        System.out.println("Copied c2: " + c2);

        // Modifying c1 will not affect c2 due to deep copy
        c1.updateHistory(20, 25);
        
        System.out.println("After modifying c1:");
        System.out.println("Original c1: " + c1);
        System.out.println("Copied c2: " + c2);
    }
}