package questions.concepts;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        String txt = "abc";
        System.out.println(subsetBYarray("",txt));
    }
    private static ArrayList<String> subsetBYarray(String p,String up) {

        if (up.isEmpty()) {
          ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetBYarray(p,up.substring(1));
        ArrayList<String> right = subsetBYarray(p + ch,up.substring(1));

        right.addAll(left);
        return right;
        }
}
