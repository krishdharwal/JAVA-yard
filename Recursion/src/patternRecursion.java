public class patternRecursion {
    public static void main(String[] args) {
        int n = 5;
        patternRec(n,0);
    }
    private static void pattern1(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void patternRec(int r,int c) {
        if (r == 0) return;
        if (r > c){
            patternRec(r,c+1);
            System.out.print("*");
        }
    else {
            patternRec(r-1,0);
            System.out.println();
        }
    }
}