public class Lastword {
    public static void main(String[] args) {
        String str = "oh yeh bave ji";
        last(str);
    }

    private static void last(String s) {
        int l = s.length();
        int r = s.length()-1;
        while (s.charAt(r) != ' '){
            r--;
        }
        if (s.charAt(r) == ' '){
            System.out.println(s.substring(r+1,l));
            System.out.println( heplper(s.substring(r+1,l)));
        }
    }

    private static int heplper(String s) {
        if (s.length() == 0){
            return 0;
        }
      return heplper(s.substring(1)) + 1;
    }
}
