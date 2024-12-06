package basic;

import java.util.HashMap;
import java.util.Map;

public class two_sum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if (!map.containsKey(val)){
                map.put(nums[i], i);
            }
            else {
                return new int[]{map.get(val), i};
            }
        }
        return new int[]{};


    }



}
