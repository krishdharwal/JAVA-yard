public class halves {
    public static void main(String[] args) {
        String s = "textbook";
        int i = s.length() / 2;

        String k = s.substring(0,i);
        String l  = s.substring(i,s.length());

        char ch = 0;
        
        for (int j = 0; j < k.length(); j++) {
            for (int m = 0; m < k.length(); m++) {
                if (k.charAt(j) == l.charAt(m)){
                     ch  = l.charAt(m);
                }
            }
        }

        if (ch == 'o' || ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'u' ){
            System.out.println("trur");
        }
        else {
            System.out.println("false");
        }

    }
}
