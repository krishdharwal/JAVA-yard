import java.math.BigInteger;

public class Factorail_Biginteger {
    public static void fact(int num){
        BigInteger ans  = new BigInteger("1");
        for (int i = 2; i <= num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        fact(10);
    }
}
