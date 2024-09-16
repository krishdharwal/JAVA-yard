package OOP_3;

public class multival_2 extends multilevel_inheritence {
    String  name;

    multival_2(String name){
        this.name = name;
    }
    multival_2(int age , String name){
        super(age);
        this.name = name;
    }

    multival_2(){
        super(-1);
        this.name  = "default";
    }

    multival_2(multival_2 obj){
        super(obj.age);
        this.name = obj.name;
    }

}
