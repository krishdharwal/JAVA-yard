package concepts;

public class leetCsteps {
    public static void main(String[] args) {
        int ans = num(14);
        System.out.println(ans);
    }

    private static int num(int n) {
        return TotalSteps(n,0);
    }

    private static int TotalSteps(int n, int steps) {
        if (n == 0 ) return steps;
        if (n % 2== 0) return TotalSteps(n/2,steps+1);
        else return TotalSteps(n-1,steps+1);
    }
}
