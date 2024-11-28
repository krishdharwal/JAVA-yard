package OOP_Revise;

public class classes {
    public int age;

    classes(int age){
        this.age = age;
    }

    classes(){
        this.age = 0;
    }
}

class call1{
    public static void main(String[] args) {
        classes obj = new classes(11);
        System.out.println(obj.age);
    }
}
