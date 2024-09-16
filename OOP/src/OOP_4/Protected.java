package OOP_4;

public class Protected {
    // protected means that you can only acces it in parent / base -> sub class
    // and to access it you can only use the refrence of child class cause of parent child knowing relation

   protected int age;

    public Protected(int age) {
        this.age = age;
    }

    Protected(){
        this.age = 0;
    }
}
