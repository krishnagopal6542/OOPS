/*
 * ============================================================================
 * JAVA METHOD OVERLOADING & CLASS BASICS
 * ============================================================================
 * 
 * Key Concepts Demonstrated:
 * 1. Method Overloading: Defining multiple methods in the same class with the 
 *    SAME name but DIFFERENT parameter lists.
 * 2. File Naming Rule: If a class is declared 'public', the file name MUST 
 *    match that class name exactly (e.g., Method.java for 'public class Method').
 * 3. Execute this file CMD: java Method.java
 */

class Calculator {

    // Overloaded Method #1: Accepts 2 integer parameters
    public int add(int n1, int n2) {
        int twoSum = n1 + n2;
        return twoSum;
    }

    // Overloaded Method #2: Accepts 3 integer parameters
    // Note: Overloading works because the parameter COUNT is different (3 vs 2).
    // Note: Changing ONLY the return type is NOT valid overloading in Java.
    public int add(int n1, int n2, int n3) {
        int threeSum = n1 + n2 + n3;
        return threeSum;
    }
}

// Main execution class (Save this file as Method.java)
class MethodOverloading{

    public static void main(String a[]) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        // Creating an object (instance) of the Calculator class
        Calculator calci = new Calculator();

        int result = calci.add(num1, num2);
        System.out.println("Sum of 2 numbers: " + result);

        result = calci.add(num1, num2, num3);
        System.out.println("Sum of 3 numbers: " + result);
    }
}