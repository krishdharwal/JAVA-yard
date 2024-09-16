import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String letter = "helloSir";
//        traverse(letter);

        String[] crr = {"h","e","l","l","o"};
//        System.out.println(Arrays.toString(revverse(crr)));
        revverseREC(crr,0,crr.length-1);
    }

    private static void revverseREC(String[] crr, int left, int right) {
            if (left > right){
                System.out.println(Arrays.toString(crr));
                return;
            }

        String tmep = crr[left];
        crr[left] = crr[right] ;
        crr[right] = tmep;

    revverseREC(crr,left+1,right-1);
    }

    // simple reverse
    private static void traverse(String letter) {
        if (letter.length() == 0) return;
        traverse(letter.substring(1));
        System.out.print(letter.charAt(0));

    }

    private static String[] revverse(String[] crr) {
        int left = 0;
        int right = crr.length-1;
        while (left < right){
            String temp  = crr[left];
            crr[left] = crr[right];
            crr[right] = temp;
            left++;
            right--;
        }
        return crr;
    }

}
