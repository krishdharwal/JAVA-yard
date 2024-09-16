package OOP_3;

// child class
// to use parent properties in child class we use " EXTENDS " keyword after child class name
public class Inheritence_2 extends Inheritence_Super{
    int scale;

    public Inheritence_2(int h, int w, int l, int scale) {
        // the " SUPER " keyword is used for refrencing the variables/object to the parent
        super(h, w, l);
        this.scale = scale;
    }

    public Inheritence_2(Inheritence_Super other, int scale) {
        super(other);
        this.scale = scale;
    }
}
