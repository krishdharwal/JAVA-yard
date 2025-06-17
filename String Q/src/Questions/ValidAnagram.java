package Questions;

import java.util.Arrays;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr,arr2);
    }

}