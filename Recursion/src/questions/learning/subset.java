package questions.learning;

import java.util.ArrayList;
public class subset {
    public static void main(String[] args) {

        System.out.println( findSubset2("","abc"));
//        findSubset("","abc");
    }
    private static void findSubset(String p, String txt) {
        if (txt.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = txt.charAt(0);
        findSubset(p + ch,txt.substring(1));
        findSubset(p,txt.substring(1));

        // this line is for ascii value of current txt
        // findSubset(p + (txt.charAt(0) + 0), txt.substring(1));
    }



    // add this in array list
    private static ArrayList<String> findSubset2(String i, String txt) {
        if (txt.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(i);
//            System.out.println(list);
            return list;
        }
        ArrayList<String> left = findSubset2(i + txt.charAt(0),txt.substring(1));
        ArrayList<String> right =  findSubset2(i,txt.substring(1));

        left.addAll(right);

        return left;

    }
    private static ArrayList<String> findSubsetinside(String p, String txt, ArrayList<String> list) {
        if (txt.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = txt.charAt(0);
        findSubsetinside(p + ch,txt.substring(1),list);
        findSubsetinside(p,txt.substring(1),list);
        list.add(p);
      return list;
  }
}
