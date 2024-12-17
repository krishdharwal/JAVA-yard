package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3ClosestSum {

    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3){
            return target;
        }

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int chk = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int s = i + 1;
            int e = nums.length - 1;

            while (s < e) {
                int val = nums[i] + nums[s] + nums[e];
                if (val == target){
                    return val;
                } else if (val < target) {
                    s++;
                }else {
                    e--;
                }
                int diff = Math.abs(val - target);
                if (diff < chk){
                    ans = val;
                    chk = diff;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int ans =  threeSumClosest(new int[]{1,1,1,0}, 100);
        System.out.println(ans);
    }
}
