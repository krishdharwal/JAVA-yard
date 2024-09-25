package Questions;

import java.util.Arrays;

public class TwoSum {

    // binary search algo
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length <= 0){
            return nums;
        }
        int s = 0;
        int e = nums.length-1;

        while (s < e){
            if (nums[s] + nums[e] == target){
               return new int[]{
                       s,e
               };
            } else if (nums[s] + nums[e] > target) {
                if (nums[s] > nums[e]){
                    s++;
                }
                else {
                    e--;
                }
            }
        }
        return new int[]{-1,-1};
    }


    // brute force approach
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{};
    }

        public static void main(String[] args) {
        int[] nums = {2,7,11,15,3};
       int[] ans =  twoSum2(nums,5);
        System.out.println(Arrays.toString(ans));
    }
}
