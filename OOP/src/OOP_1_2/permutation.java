package OOP_1_2;

public class permutation {
    public static void main(String[] args) {
        // all possibilities of "abc"
        possibleOutcome("","abc");
    }

    private static void possibleOutcome(String p, String up) {
        // base condition
        if (up.length() == 0){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        possibleOutcome(p + ch,up.substring(1));
        possibleOutcome(p,up.substring(1));

    }
}
