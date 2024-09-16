package OOP_3;

import javax.sound.midi.Soundbank;

public class hirerical_child1 extends hirerical_parent{
    String name;

    hirerical_child1(int age , String name){
        super(age);
        this.name = name;
    }

    void human(){
        System.out.println("in H child 1");
    }

    hirerical_child1(){
        super(-1);
        this.name = "default";
    }

}

