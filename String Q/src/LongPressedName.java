public class LongPressedName {
    public static void main(String[] args) {
        String name = "abc";
        String extra = "aaaaaaaaabbbbbbbbbbbbbbbbbbbbbcccccccccccccccccc";
        System.out.println(ispress(name,extra));
    }

    private static boolean ispress(String name, String extra) {
        int i = 0;
        int j = 0;
        while ( j < extra.length()) {
            if (i < name.length() && name.charAt(i) == extra.charAt(j)) {
                i++;
                j++;
            }
            if (j > 0 && extra.charAt(j) == extra.charAt(j - 1)) {
                j++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
