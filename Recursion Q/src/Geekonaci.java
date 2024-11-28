public class Geekonaci {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 6;
       int ans = geeko(a,b,c,4);
        System.out.println(ans);
    }

    private static int geeko(int a, int b, int c, int n) {
        if (n == 1){
            return a;
        }
        if (n == 2){
            return b;
        }
        if (n == 3){
            return c;
        }
        return geeko(a,b,c,n-1) + geeko(a,b,c,n-2) + geeko(a,b,c,n-3);
    }
}
