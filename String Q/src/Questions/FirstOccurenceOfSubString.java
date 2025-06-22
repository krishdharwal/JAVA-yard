package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstOccurenceOfSubString {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i < n-m; i++) {
            if (haystack.substring(i,i+m).equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "hello";
//        Integer arr = new int[]{1, 2, 3};
        List<Integer> l = Arrays.asList(1,2,3,3);
//        l.add(1);
//        l.add(3);
        System.out.println(        l.reversed()
);
    }

}
