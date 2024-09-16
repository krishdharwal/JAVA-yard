import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);


//        System.out.println("enter  2 numbers to swap = ");
        int num1 = 10;
        int num2 = 20;

        //divide(num1,num2);
        // sum(num1 , num2);

         swap(num1 , num2);
        System.out.println( " original"+num1 + " " +  num2);



    }

    static void swap(int a , int b){
        int c = a;
        a = b;
        b = c;
       System.out.println(a +" "+ b);
//        return a;
    }
    static  void divide(int a , int b){
        int divide = a / b;
        System.out.println(divide);

    }



    static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

}

