public class sqrt {
    public static void main(String[] args) {
        int n = 8;
        int ns = Sqrt(n);
        System.out.println(ns);
    }

    private static int Sqrt(int n) {
        if(n <= 1) return n;
        long s = 0;
        long e = (n/2) +1;

        while(s <= n){
            long m = s + (e - s) / 2;
            if (m*m == n) return (int) m;
            else if (m*m > n) e = m;
            else s = m +1;
        }
        return (int) s;
    }
}
