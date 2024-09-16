package OOP_1_2;

public class final_Finalize {
    public static void main(String[] args) {
        // final helps to not to modify your  content
        final int k = 99;
        //you cannot do this -> k = 923;

        for (int i = 0; i < 10000000; i++) {
            A num1 = new A(i);
        }
    }
}

class A {
    int num;

    A (int num){
        this.num = num;
    }

    // finalize help you too do some task when the garbage collector destroy useless objects
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object deleted");
    }
}
