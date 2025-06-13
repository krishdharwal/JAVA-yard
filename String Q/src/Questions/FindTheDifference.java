package Questions;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i < t.length()){
            if (sb.indexOf(String.valueOf(t.charAt(i))) != -1) sb.deleteCharAt(i);
            else return t.charAt(i);
        }

        return ' ';
    }

}
