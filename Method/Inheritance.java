/*
 * ============================================================================
 * OBJECT-ORIENTED PROGRAMMING (OOP) IN JAVA
 * ============================================================================
 * 
 * Core Concepts Demonstrated:
 * 1. Encapsulation: Restricting direct access to data members using 'private'
 *    modifiers and controlling access via public getter/setter methods.
 * 2. Inheritance: Reusing fields and methods from a superclass (Keyboards) in a 
 *    subclass (AdvKeyboard) using the 'extends' keyword.
 * 3. Polymorphism:
 *    - Method Overloading (Compile-time): Same method name, different parameters.
 *    - Method Overriding (Runtime): Redefining a parent class method in child class.
 */

// Package declaration (uncomment if using a folder package structure)
// package OOPs;

// Superclass / Parent Class
class Keyboards {
    // Encapsulation: Private variables hidden from external direct modification
    private int keys;
    private String color;

    // Standard public method
    public void Presses() {
        System.out.println("Signal Sent");
    }

    // Base method to be overridden by child class
    public void throwIt() {
        System.out.println("Got hit !");
    }

    // POLYMORPHISM (Method Overloading - Compile-time)
    // Same method name 'throwIt', but accepts an integer parameter 'k'
    public void throwIt(int k) {
        System.out.println("Got hit " + k + " times");
    }

    // ENCAPSULATION: Getter method to read private variable 'keys'
    public void getKeys() {
        System.out.println("Keys : " + keys);
    }

    // ENCAPSULATION: Setter method to modify private variable 'keys'
    // 'this.keys' refers to the instance variable, 'keys' refers to the method parameter
    public void setKeys(int keys) {
        this.keys = keys;
        System.out.println("Key value set to " + keys);
    }
}

// Subclass / Child Class inheriting from Keyboards
class AdvKeyboard extends Keyboards {
    
    // Additional functionality specific to child class
    public void hitNum() {
        System.out.println("Sent Num");
    }

    // POLYMORPHISM (Method Overriding - Runtime)
    // Redefining parent class throwIt() method.
    // The @Override annotation is recommended practice to catch signature errors.
    @Override
    public void throwIt() {
        System.out.println("Got hit hard");
    }
}

// Public class name MUST match the .java file name exactly (Inheritance.java)
public class Inheritance {
    public static void main(String[] args) {
        
        // Creating an instance of the child class
        AdvKeyboard obj = new AdvKeyboard();

        // 1. INHERITANCE: Calling inherited method from parent class (Keyboards)
        obj.Presses();

        // 2. RUNTIME POLYMORPHISM (Overriding): Executes child's overridden version
        obj.throwIt();

        // Calling child's own method
        obj.hitNum();

        // 3. COMPILE-TIME POLYMORPHISM (Overloading): Calling overloaded method inherited from parent
        obj.throwIt(10);

        // 4. ENCAPSULATION: Accessing private field via getter & setter
        obj.getKeys();        // Defaults to 0
        obj.setKeys(200);     // Updates private variable
        obj.getKeys();        // Prints updated value 200
    }
}