package questions.concepts;

public class countDigits {
    public static void main(String[] args) {
        int n = 1234;
        count(n);
    }

    private static void count(int n) {
        int digits = (int) (Math.log10(n)+1);
        System.out.println(digits);
    }
}
