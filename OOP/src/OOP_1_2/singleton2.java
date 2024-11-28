package OOP_1_2;

public class singleton2 {
    public static void main(String[] args){
        // we are making it only one time ,
        // so we are not using "new" in this
         SingleTon obj1 = SingleTon.getInstance();

         SingleTon obj2 = SingleTon.getInstance();

         SingleTon obj3 = SingleTon.getInstance();

        // these all three will point to single obeject
    }
}
