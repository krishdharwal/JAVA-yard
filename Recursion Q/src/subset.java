public class subset {
    public static void main(String[] args) {
        String up = "geeks";
        giveSubset("",up);
    }

    private static void giveSubset(String p, String up) {
        if (up.length() == 0){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        giveSubset(p + ch,up.substring(1));
        giveSubset(p,up.substring(1));
    }
}
