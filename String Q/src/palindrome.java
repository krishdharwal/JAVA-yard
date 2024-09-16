public class palindrome {
    public static void main(String[] args) {
        // vslid palindrome of a sentence
        String nww = "leetteel";
        String neww = nww.replace(" ", "");
        boolean ans = isPalindrome(neww);
        System.out.println(ans);
    }
    private static boolean isPalindrome(String neww) {
        int l = 0, r = neww.length() - 1;
        while (l < r) {
            // this is for characters
            if (l < r && Character.isLetterOrDigit(neww.charAt(l))) {
                l++;
            }
            if (l < r && Character.isLetterOrDigit(neww.charAt(r))) {
                r--;
            }
            if (neww.charAt(l) != neww.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}