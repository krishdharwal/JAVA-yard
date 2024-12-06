package basic;

import java.util.*;

public class three_sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3 ) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        Set<List<Integer>> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length -2; i++) {

            int tar = nums[i];

            int s = i + 1;
            int e = nums.length-1;
            while (s < e){
                int sum = tar + nums[s] + nums[e];
                if (sum == 0){
                    hashSet.add(List.of(tar, nums[s], nums[e]));
                    s++;
                    e--;
                } else if (sum < 0) {
                    s++;
                }else {
                    e--;
                }

            }
        }
        return new ArrayList<>(hashSet);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

}
