package OOP_3;

public class multival_3 extends multival_2 {
    float cgpa;

  public static void greet(){
        System.out.println("hello");
    }

    multival_3(){
        super("default");
        this.cgpa = 0.0f;
    }

    multival_3(int age,String name,float cgpa){
        super(age,name);
        this.cgpa = cgpa;
    }

    multival_3(float cgpa){
        this.cgpa = cgpa;
    }

    multival_3(multival_3 obj){
        this.cgpa = obj.cgpa;
    }
}
