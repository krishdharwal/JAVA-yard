public class SentenceNum {
    public static void main(String[] args) {
        String  s = "is2 a3 this1 sentence3 ";
        Ixd(s,0);
    }

    private static void Ixd(String s,int i) {
        if (i == s.length()){
            return;
        }
        char ch = s.charAt(i);
        if (ch == ' '){
            String k = s.substring(0,i);
            System.out.println(k);
            Ixd(s.substring(0,i),0);
        }
        Ixd(s,i+1);
    }
}
