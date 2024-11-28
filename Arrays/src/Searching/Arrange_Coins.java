package Searching;

public class Arrange_Coins {
    public static int arrangeCoins(int n) {

        long s = 1;
        long e = n;
        while (s <= e) {
            long m = s + (e - s) / 2;
            long sum = m * (m + 1) / 2;

            if (sum == n){
                return (int) m;
            }
            else if (sum > n){
                e  = m -1;
            }else {
                s = m + 1;
            }

        }
        return (int)e;
    }

    public static void main(String[] args) {
        int n = 4;
        // to get all the number sum from ( 1 to n )
        int sum = n * (n + 1) / 2;

        System.out.println(arrangeCoins(1804289383));
    }
}
