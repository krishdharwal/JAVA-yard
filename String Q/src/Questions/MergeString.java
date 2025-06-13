package Questions;

public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        int w1 = 0, w2 = 0,n1 = word1.length(),n2 = word2.length();
        StringBuilder s = new StringBuilder();
        while(w1 < n1 && w2 < n2){
            s.append(word1.charAt(w1++));
            s.append( word2.charAt(w2++));
        }
        if(w1 < n1) s.append(word1.substring(w1));
        if(w2 < n2)  s.append(word2.substring(w2));
        return s.toString();
    }
}
