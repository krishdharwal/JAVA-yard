package OOP_3;

// parent class
public class Inheritence_Super {
    int h;
    int w;
    int l;

    Inheritence_Super() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public Inheritence_Super(int h, int w, int l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    public Inheritence_Super(Inheritence_Super other) {
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;

    }


}
