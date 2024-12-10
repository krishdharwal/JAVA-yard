package basic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Longest_consecutive_array {

    public static void main(String[] args) {
        int[] arr = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println( longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        // convert the arry to set
        Set<Integer> set = IntStream.of(nums).boxed().collect(Collectors.toSet());

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1)){
                continue;
            }

            int count = 1;
            int nextVal = nums[i];
            while (set.contains(nextVal + 1)){
                count++;
                nextVal++;
            }

            ans = Math.max(ans, count);
        }
        return ans;
    }
}
