package OOP_3;

public class hirerical_child2 extends hirerical_parent {
    String name;

    hirerical_child2(int age , String name ){
        super(age);
        this.name = name;
    }

    hirerical_child2() {
        super(-1);
        this.name = "default";
    }


}
