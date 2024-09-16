public class simplePlaindrome {
    // when ever you are in a condition where you asked
    // to find something from front and also from back
    // just use binary search alg0

    public static void main(String[] args) {
        String s = "tenET";
        System.out.println(ispalin(s));

    }

    private static boolean ispalin(String s) {
        // check if empty
        if (s.length() == 0){
            return true;
        }

        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while (l < r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
