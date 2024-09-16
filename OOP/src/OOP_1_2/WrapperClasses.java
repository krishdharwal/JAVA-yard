package OOP_1_2;

public class WrapperClasses {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        // actuall Wrapper class sir
        Integer num = 12;
        Integer num2 = 12;
        int i = num.compareTo(num2);
        System.out.println(i);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
