public class prime {
    public static void main(String[] args) {
       boolean ans =  pOrN(7);
        System.out.println(ans);
            }

    private static boolean pOrN(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
       return true;
    }
}
