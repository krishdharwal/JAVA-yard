package OOP_experiment;

import OOP_4.Protected;

public class Protected_Outside extends Protected {
    int room;

    Protected_Outside(int age,int room){
        super(age);
        this.room = room;
    }

    public static void main(String[] args) {
        // Using PROTECTED outside the package by its subclass
        Protected_Outside obj = new Protected_Outside(12,2323);
        System.out.println(obj.age + " " + obj.room);

    }
}
