package Questions;

import java.util.Arrays;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr,arr2));

    }
}