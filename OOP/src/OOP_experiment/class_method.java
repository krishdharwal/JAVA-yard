package OOP_experiment;

public class class_method {
    void hello(){
        System.out.println("hello");
    }
}


               //
 class call extends class_method{
    public class_method obj;

    call(class_method obj){
        this.obj = obj;
    }

     call(){
         System.out.println("empty");
     }


     @Override
     void hello(){
         System.out.println("hello from child");
     }
}

                               //

class print extends call{

    class_method obj = new call();

    print(){
        obj.hello();
    }


    public static void main(String[] args) {
//        call obj = new call();
//        obj.hello();
//        call po  = new call(obj);
//        po.hello();

        print oo = new print();
    }
}