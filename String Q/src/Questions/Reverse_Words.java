package Questions;

import java.util.Arrays;
import java.util.Stack;

public class Reverse_Words {


    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while (start  < end){
            char temp = arr[start];
            arr[start]  = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
        return String.copyValueOf(arr);
    }

        public static String reverseWords(String s) {
        if (s.length() <= 1){
            return s;
        }
        Stack<String> stack = new Stack<>();
        String[] words = s.trim().split("\\s+");

        int i = 0;
        while (i < words.length){
            stack.push(words[i]);
            if (i != words.length-1){
                stack.push(" ");
            }
            i++;
        }
         StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }

        return builder.toString();
    }

    public static String reverseWords2(String s) {
        // Trim leading and trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Use StringBuilder for efficient string concatenation
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) { // Avoid adding space after the last word
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String ans = reverseWords("   hello     world     ");
        System.out.println(ans);
    }
}
