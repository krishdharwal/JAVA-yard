
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = in.nextInt();


        tillprime(n);

    }

    private static void tillprime(int n) {

        for (int i = 2; i <= n; i++) {
            if (isprime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;

    }
}
