public class reverse2 {
    public static void main(String[] args) {
       int ns = rev2(1234);
        System.out.println(ns);
    }

    private static int rev2(int i) {
        int digits = (int) (Math.log10(i)+1);
        return helper(i,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
