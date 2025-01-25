package concepts;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
//        System.out.println(permutationn("","abc"));
        System.out.println( permutationCount("","abc",0));
  //      permutationn("","abc");
  //      System.out.println(permutationArgument("","abc",new ArrayList<>()));

    }

    private static void permutationn(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        int n = p.length();
        for (int i = 0; i <= n; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,n);
            permutationn(f + ch + s,up.substring(1));
        }

    }

    private static ArrayList<String> permutationList(String p, String up) {
                        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(f + ch + s,up.substring(1)));
        }
        return ans;
    }

    // for count how many steps
   public static int permutationCount(String p,String up,int count){
        if(up.isEmpty()) {
            return count+1;
        }
        char ch = up.charAt(0);
        int n = p.length();
       for (int i = 0; i <= n; i++) {
           String f = p.substring(0,i);
           String s = p.substring(i,n);
           count = permutationCount(f + ch + s,up.substring(1),count);

       }
    return count;

   }

   // arraylist inside argumnet
    private static ArrayList<String> permutationArgument(String p, String up,ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        int n = p.length();
        for (int i = 0; i <= n; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,n);
            permutationArgument(f + ch + s,up.substring(1),list);
        }

        return list;
    }
}
