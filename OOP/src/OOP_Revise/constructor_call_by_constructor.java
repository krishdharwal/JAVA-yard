package OOP_Revise;

public class constructor_call_by_constructor {
    public int age;
    public int pin;

    constructor_call_by_constructor(){
        this (0,0);
    }

    constructor_call_by_constructor(int age,int pin){
        this.age = age;
        this.pin = pin;
    }

    public static void main(String[] args) {
        constructor_call_by_constructor obj = new constructor_call_by_constructor();
        System.out.println(obj.age);
    }
}
