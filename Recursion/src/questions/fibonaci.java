package questions.concepts;

public class fibonaci {
    public static void main(String[] args) {
        int sn = fibo(4);
        System.out.println(sn);
    }

    private static int fibo(int n) {
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }











}