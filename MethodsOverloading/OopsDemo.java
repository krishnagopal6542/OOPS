package OOPs;

class Keyboard {
    int Keys = 100;
    String colors = "White";

    public void Pressed() {
        System.out.println("Signal Sent");
    }

    public void throwIt() {
        System.out.println("Got Hit !");
        Keys = 85;
    }
}

public class OopsDemo {
    public static void main(String args[]) {
        int num;
        num = 8;

        Keyboard obj;           // Object type if of keyboard type
        obj = new Keyboard(); // Constructor to the object

        obj.Pressed();
        obj.throwIt();

        System.out.println(obj.Keys);
        System.out.println(obj.colors); // Data modified in throwIt()

    }
}
