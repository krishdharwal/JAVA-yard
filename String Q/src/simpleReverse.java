import java.security.SecureRandom;

public class simpleReverse {
    public static void main(String[] args) {
        String s = "hello";
//        System.out.println(reverseString(s));
        reverseString(s);
        rev(s);
    }

    private static void reverseString(String s) {
        String newt = "";
        for (int i = s.length()-1; i >=0; i--) {
            newt += s.charAt(i);
        }
        System.out.println(newt);
    }

    private static void  rev(String s) {
        if (s.length() == 0){
            return ;
        }
         rev(s.substring(1));
       System.out.print(s.charAt(0));
//        System.out.println(s);

    }
}
