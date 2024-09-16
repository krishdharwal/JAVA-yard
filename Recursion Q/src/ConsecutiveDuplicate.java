public class ConsecutiveDuplicate {
    public static void main(String[] args) {
        String str = "aaabbbb";
        consecute(str,"");
//        System.out.println(c);
    }

    private static void consecute(String str,String p) {
        if (str.length() <= 1) {
            System.out.print(p);
            return;
        }
        if (str.charAt(0) == str.charAt(1)) {
            consecute(str.substring(1),p);
        }

      else   consecute(str.substring(1),p + str.charAt(0));
    }
}
