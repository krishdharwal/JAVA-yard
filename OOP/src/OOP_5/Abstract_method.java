package OOP_5;
// abstract method's are  the methods which are dependent upon its child to define their body (method's body)
// to use abstract we use ABSTRACT keyword before class name
public abstract class Abstract_method {
   static int age;
    // here i have build my abstract method / function
    // in this i have not created my body of the method
    // so i will make it in my child / sub class
    abstract void name(String name);


    // you can alson not able to create static metoh in abstract method
   // abstract static void name(String name);





    // static constructor are not allowed
//    public static Abstract_method(int age) {
//        Abstract_method.age = age;
//    }


}

