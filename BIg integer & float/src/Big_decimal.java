
import java.math.BigDecimal;

public class Big_decimal {
    public static void main(String[] args) {
        BigDecimal A = new BigDecimal("13434.1231231234");
        BigDecimal B = new BigDecimal("4398.324");

        BigDecimal c = A.add(B);
        System.out.println(c);

    }
}
