package Basics;

public class Variables {
    public static void main(String[] args) {
        int num = 25;
        double d = 9.6;
        float f = 3.14f; // for float, we have to add f explicitly to mention its float
        long l = 123456789L;
        char c = 'a';

        System.out.println(num + " " + d + " " + f + " " + l + " " + c);

        show();
    }

    public static void show() {
        System.out.println("In show method!");
    }
}
