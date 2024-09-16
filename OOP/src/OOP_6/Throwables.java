package OOP_6;

// these are a type of keywords which provide us to do anything when an error occour
// 1. throw -> used to add throwable classes in any method
// 2. throws -> used after any class or function name by which an exception class can be added
// " throws " represents that this particular method or class , when you  use it it may throw an exception when occur

public class Throwables extends Exception {

    Throwables(String c){
        super(c);
    }

    public static void main(String[] args) throws Exception {
        // you can do this by any function
//         divide(0,9);




          // and also by without function
        try{

            // 1st way
//            divide(2,0);

            // 2nd way
            String name = "krish";
            if (name.equals("krish")){
                throw new Throwables("i anm krish");
            }

        }
        catch (Throwables c){
            System.out.println(c.getMessage());
        }
        // catch bassically do , when your try block give an exception it will automatically
        // run and give you that error that you have added in your catch block
        catch (ArithmeticException A){
            throw new ArithmeticException(A.getMessage());
        }
        catch (Exception A){
            throw new Exception();
        }
        finally {
            System.out.println("this will always execute man");
        }
    }

    public static int divide(int a,int b) throws Exception{
//        if (a == 0 || b == 0){
////            throw new ArithmeticException();     you can alo do this as well
//            throw new ArithmeticException("oh you cant divide by zero by the way !");
//        }
        return a / b;
    }


}


