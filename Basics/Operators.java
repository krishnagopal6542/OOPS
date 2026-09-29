package Basics;

public class Operators {
    public static void arithmetic(int num1, int num2) {

        // Arithmetical Operators
        int sum_result = num1 + num2;
        int sub_result = num1 - num2;
        int mul_result = num1 * num2;
        int div_result = num1 / num2; // To perform division
        int rem_result = num1 % num2; // To get reminder

        System.out.printf("Sum of %d and %d is : %d\n", num1, num2, sum_result);
        System.out.printf("Substraction of %d and %d is : %d\n", num1, num2, sub_result);
        System.out.printf("Multiplication of %d and %d is : %d\n", num1, num2, mul_result);
        System.out.printf("Division of %d and %d is : %d\n", num1, num2, div_result);
        System.out.printf("Modulus of %d and %d is : %d\n", num1, num2, rem_result);

    }

    public static void relational(int num1, int num2) {
        // Relational Operators, used to compare and return type is boolean
        boolean is_greater = num1 > num2; // its can be >= or <= also
        boolean is_equals = num1 == num2; // it can != also fi num1 != num2

        System.out.printf("%d is greater than %d : %b\n", num1, num2, is_greater);
        System.out.printf("%d is equals to %d : %b\n", num1, num2, is_equals);
    }

    public static void logical(int num1, int num2) {
        // Logical Operators
        // We use && for and, || for or, '!' for not
        boolean result = num1 > num2 && num1 != 0;
        System.out.println(result);

    }

    public static void conditional(int num1, int num2) {

        // Conditional Statement : if  else
        if (num1 > num2) {
            System.out.println("Num1 is greater than Num2");
        } else if (num2 > num1) {
            System.out.println("Num2 is greater than Num1");
        } else {
            System.out.println("Num1 and Num2 are same");
        }
    }

    public static void ternary(int num1, int num2) {
        int result = 0; // Local variable

        // Using ternary operator
        result = num1 > 0 ? 5 : 10;
        System.out.println(result);
        // Its similar to
        //        if(num1>0){
        //            result = 5;
        //        } else {
        //            result = 10;
        //        }
    }

    public static void iterators(int num) {
        // for, while, do while
        // for loop

        int i = 0;
        for (i = 0; i <= num; i++) {
            System.out.printf("i : %d\n", i);
        }

        // while
        while (i < num) {
            System.out.printf("i : %d\n", i);
            i++;
        }

        do {
            System.out.printf("i : %d\n", i);
            i++;
        } while (i < 5);

    }

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 5;

        arithmetic(num1, num2);
        relational(num1, num2);
        logical(num1, num2);
        conditional(num1, num2);
        ternary(num1, num2);
        iterators(num2);
    }
}
