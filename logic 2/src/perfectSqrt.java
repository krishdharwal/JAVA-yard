public class perfectSqrt {
    public static void main(String[] args) {
        double n = 36;
        boolean ans = isperfect(n);
        System.out.println(ans);
    }

    private static boolean isperfect(double n) {
        double s = 1;
        double e = n;
        while (s <= e){
            double m = s + (e - s) / 2;
            double sq = m * m;
            if (sq == n) return true;
            else if(sq > m) e = m-1;
            else if(sq < m) s = m+1;
        }
        return false;
    }
}
