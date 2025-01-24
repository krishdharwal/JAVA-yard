package Questions;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveStars {

    public static String removeStars(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!sb.isEmpty() && s.charAt(i) == '*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(removeStars("leet******e"));
    }

}
