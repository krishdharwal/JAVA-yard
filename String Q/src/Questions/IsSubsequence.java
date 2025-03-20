package Questions;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        return findSeq(s,t,0,0);
    }

    public boolean findSeq(String s, String t, int sIdx, int tIdx) {
        if (sIdx >= s.length()){
            return true;
        }

        char current = s.charAt(sIdx);
        while (tIdx < t.length()){
            if (current == t.charAt(tIdx)){
              return findSeq(s,t.substring(tIdx+1),sIdx+1,0);
            }
            tIdx++;
        }

        return false;
    }

    public static void main(String[] args) {
        IsSubsequence s = new IsSubsequence();
        System.out.println(s.isSubsequence("abc","adbshcf"));
    }
}
