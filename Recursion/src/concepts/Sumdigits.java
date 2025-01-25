package concepts;

public class Sumdigits {
    public static void main(String[] args) {
        int n = 1234;
        int ans = sum(n);
        System.out.println(ans);

    }

    private static int sum(int n) {
        if (n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
