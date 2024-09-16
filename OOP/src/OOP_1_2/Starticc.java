package OOP_1_2;

public class Starticc {

    static int a = 211;
    static int b;
    // a static means common to all
    public static void main(String[] args) {
        greet();

        //to access non static in an static class we need to
        // add it into obeject of current class where you are accessing it
        Starticc obj = new Starticc();
        obj.greet2();
    }

    // but you cannot acces non static in static class
    void greet2() {
        System.out.println("hello 2");
    }

    // the static class can access only static object
    static void greet() {
        System.out.println("hello");
    }
}
