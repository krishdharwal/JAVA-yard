package concepts;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
//        System.out.println( comblist("","12",new ArrayList<>()));
//        System.out.println( comblist2("","12"));
        System.out.println(combCount("","12",0));
    }

    private static void comb(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        // yaha par humne string '2' ko integer 2 mai convert kiya taki hum niche loop mai mnultiply kar sake
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            comb(p + ch,up.substring(1));
        }
    }

    // done by arraylist
    private static ArrayList<String> comblist(String p, String up, ArrayList<String> list) {
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        // yaha par humne string '2' ko integer 2 mai convert kiya taki hum niche loop mai mnultiply kar sake
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            comblist(p + ch,up.substring(1),list);
        }
        return list;
    }
    private static ArrayList<String> comblist2(String p, String up) {

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        // yaha par humne string '2' ko integer 2 mai convert kiya taki hum niche loop mai mnultiply kar sake
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
             ans.addAll( comblist2(p + ch,up.substring(1)));
        }
        return ans;
    }

    private static int combCount(String p, String up,int count) {
        if(up.isEmpty()){
           return count+1;
        }
        // yaha par humne string '2' ko integer 2 mai convert kiya taki hum niche loop mai mnultiply kar sake
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
           count = combCount(p + ch,up.substring(1),count);
        }
        return count;
    }
}
