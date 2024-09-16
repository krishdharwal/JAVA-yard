import java.math.BigInteger;
import java.util.Arrays;

public class Big_INteger {
    public static void main(String[] args) {
                   // string number in Big Integer
        BigInteger A  = new BigInteger("12312193213213");
        BigInteger B  = new BigInteger("12312193213213");

        // To convert int/float to Big integer
        BigInteger C = BigInteger.valueOf(489832037);
        BigInteger D = BigInteger.valueOf(489832037);


                   // TO convert Big integer into int / float;
        int NUM = B.intValue() ;
        float num2 = A.floatValue();

//        System.out.println(NUM);


                    // --:> CONSTANTS

        BigInteger c1 = BigInteger.ONE;
        BigInteger c2 = BigInteger.ZERO;
        BigInteger c3 = BigInteger.TEN;
//        System.out.println(c);


                     // --:> Applying simple math
        BigInteger total = A.add(B);
        BigInteger total2 = A.subtract(B);
        BigInteger total3 = A.multiply(B);
        BigInteger total4 = A.divide(B);
        BigInteger total5 = A.remainder(B);
        BigInteger[] total6 = A.divideAndRemainder(B);

//        System.out.println(total + " " + total2 + " "  + total3 + " "  + total4 + " "  + total5 + "\n");
//        System.out.println(Arrays.toString(total6));

    }
}
