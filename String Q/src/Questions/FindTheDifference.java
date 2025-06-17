package Questions;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i < t.length()){
            int j = sb.indexOf(String.valueOf(t.charAt(i)));
            if (j != -1) sb.deleteCharAt(i);
            else return t.charAt(i);
            i++;
        }

        return ' ';
    }

}
