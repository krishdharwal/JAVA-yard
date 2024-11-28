
public class ArrangeCoins{
    public static void main(String[] args) {

    int n = 5; // 2
    int ans = coins(n);
        System.out.println(ans);
}

    private static int coins(int n) {
        int i  = 0;
        int sum = 0;
        while (sum <= n){

            sum += i + 1;
            i++;
        }
        return i-1;
    }
}
