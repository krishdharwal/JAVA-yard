package concepts;

public class reverse {
    public static void main(String[] args) {
         int summ = rev2(123,0);
         System.out.println(summ);
    }
    static int sum = 0;
    private static int rev1(int n) {
        if (n == 0){
            return 0;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return rev1(n/10);
    }

    private static int rev2(int n,int summ) {
        if (n == 0){
            return summ;
        }
        int rem = n % 10;
        summ = summ * 10 + rem;
        int par = rev2(n/10,0);
        return summ;

    }
}