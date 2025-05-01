package ImportantThings;

public class convertCharacterNumberToNumber {
    public static void main(String[] args) {
        // 1.
        char chNum = '3';
        int afterConversion = chNum - '0';
        System.out.println(afterConversion);

        // 2.
        // if to add previously done number , anything you want to get add with it
        char c = '4';
        int n = 3;
         n = n * 10 + (c - '0');
        System.out.println(n); //34
    }
}
