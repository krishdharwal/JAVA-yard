package Questions;

import java.util.Arrays;

public class Balance_string {
    public static int minSwaps(String s) {
        int open = 0;   // To track unmatched '['
        int swaps = 0;  // To count swaps

        for (char c : s.toCharArray()) {
            if (c == '[') {
                open++;  // We found an open bracket
            } else if (c == ']') {
                if (open > 0) {
                    open--;  // Matched one '[' with a ']'
                } else {
                    swaps++; // We have an unmatched ']', we need a swap
                    open++;  // Assume a swap happens
                }
            }
        }

        return swaps;
    }


    public static void main(String[] args) {
        String s = "[[[]]]][][]][[]]][[[";
        System.out.println(minSwaps(s));
    }

}
