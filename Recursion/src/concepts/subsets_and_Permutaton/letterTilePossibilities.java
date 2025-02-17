package concepts.subsets_and_Permutaton;

import java.util.HashSet;
import java.util.Set;

public class letterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        findSequence("",tiles, set);
        System.out.println(set);
        return 0;
    }

    private void findSequence(String p, String up,Set<String> set) {
        if (up.isEmpty()){
            set.add(p);

            return;
        }

        char ch = up.charAt(0);
        int m = p.length() / 2;

        for (int i = 0; i <= p.length(); i++) {
            String l = p.substring(0, i);
            String r = p.substring(i);
            findSequence(l + ch + r, up.substring(1), set);
            findSequence(r + ch + l, up.substring(1),set);
            findSequence(p + ch,up.substring(1),set);
        }
//        findSequence(r + ch + l, up.substring(1),set);
//        findSequence( p + ch, up.substring(1),set);
//        findSequence( ch + p, up.substring(1),set);
//        findSequence(p , up.substring(1),set);

    }


    public static void main(String[] args) {
        letterTilePossibilities l = new letterTilePossibilities();
        l.numTilePossibilities("AAB");
    }
}
