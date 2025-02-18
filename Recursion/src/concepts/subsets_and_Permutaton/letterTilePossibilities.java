package concepts.subsets_and_Permutaton;

import java.util.HashSet;
import java.util.Set;

public class letterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        findSequence("",tiles, set);
        System.out.println(set);
        System.out.println("size  " +  set.size());
        return 0;
    }

    private void findSequence(String p, String up,Set<String> set) {
        if (set.contains(p)) return; // Avoid duplicate recursive calls
        set.add(p);

        if (up.isEmpty()) {
            return;
        }

        char ch = up.charAt(0);
        int m = p.length() / 2;

        String l = p.substring(0, m);
        String r = p.substring(m);

        findSequence(l + ch + r, up.substring(1), set); // Insert in the middle
        findSequence(r + ch + l, up.substring(1), set); // Insert in reverse order
        findSequence(p + ch, up.substring(1), set);     // Append to the right
        findSequence(ch + p, up.substring(1), set);     // Append to the left
        findSequence(p, up.substring(1), set);
    }


    public static void main(String[] args) {
        letterTilePossibilities l = new letterTilePossibilities();
        l.numTilePossibilities("AAABBC");
    }
}
