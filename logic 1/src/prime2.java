import java.util.Scanner;

public class prime2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value to find prime or not = ");
        int num = in.nextInt() ;
        System.out.println(pe(num));
    }
    static int pe( int num){
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("prime");

        }
        else {
            System.out.println("not prime");
        }
        return 0;

    }
}