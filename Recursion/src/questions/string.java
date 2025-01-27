package questions.concepts;

public class string {
    public static void main(String[] args) {
        String txt = "bacappleok";
        System.out.println( removeTxt2nd(txt));
    }

    private static void removeTxt(String i,String txt) {
        if(txt.isEmpty()) {
            System.out.println(i);
            return;
        }
        char ch = txt.charAt(0);
        if (ch == 'a') removeTxt(i,txt.substring(1));
        else removeTxt(i + ch,txt.substring(1));
    }

    private static String removeTxt2nd(String txt) {
        if (txt.isEmpty()) {
            return " ";
        }
        char ch = txt.charAt(0);
        if (txt.startsWith("a")) return removeTxt2nd(txt.substring(1));
        return ch + removeTxt2nd(txt.substring(1));
    }

// to remove complete sentence like bcdappleok int his remove apple
    private static String removeTxt3rd(String txt) {
        if (txt.isEmpty()) {
            return " ";
        }
        if (txt.startsWith("app") && !txt.startsWith("apple")) return removeTxt3rd(txt.substring(3));
        return  txt.charAt(0) + removeTxt3rd(txt.substring(1));
    }


}
