package OOP_Revise;

public interface interfaces {
    int pincode(int a);


    default void message(){
        System.out.println("hello");
    }
}

class call2 implements interfaces{

    @Override
    public int pincode(int n){
        return n;
    }

    public static void main(String[] args) {
        call2 obj = new call2();
        int a = obj.pincode(12);
        System.out.println(a);
        obj.message();

    }
}
