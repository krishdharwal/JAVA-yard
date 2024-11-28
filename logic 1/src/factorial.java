import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // for factorial
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number  to find factorial and addition of it = ");
        int num = in.nextInt();
        System.out.println(fac(num));
        System.out.println(add(num));
    }

    static int fac( int num){
        int ft = 1;
        for (int i = 1 ; i <= num; i++){
            ft *= i;
        }
        System.out.println("factorial is = ");
        return ft;
    }
    static int add(int num){
int he = 0;
        for (int i = 0; i <= num; i++) {
            he += i;
        }
        System.out.println("addition = ");
        return he;
    }
}


