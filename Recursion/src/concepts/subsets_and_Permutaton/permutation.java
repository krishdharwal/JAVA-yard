package concepts.subsets_and_Permutaton;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void allPermutationOfaString(String p,String up){
        if (up.isEmpty()){
            System.out.print(p + ", ");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String l = p.substring(0,i);
            String r = p.substring(i);
            allPermutationOfaString( l + up.charAt(0) + r , up.substring(1));
        }

    }


    public static List<String> allPermutationOfaStringInList(String p, String up){
        if (up.isEmpty()){
            return Arrays.asList(p);
        }

        char ch = up.charAt(0);
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String l = p.substring(0,i);
            String r = p.substring(i);
           list.addAll(allPermutationOfaStringInList( l + up.charAt(0) + r , up.substring(1)));
        }

        return list;
    }


    public static void main(String[] a){
        allPermutationOfaString("","abc");
        System.out.println(allPermutationOfaStringInList("","abc"));
    }
}
