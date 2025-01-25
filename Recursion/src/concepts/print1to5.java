package concepts;

public class print1to5 {
    public static void main(String[] args) {
        int n = 5;
        print(5);
    }

    private static void print(int n) {
        if (n == 0) return;
        //System.out.println(n);
         print(n-1);
        System.out.println(n);
    }
}
