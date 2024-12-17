package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyNumber {

    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if ((i > 0 && (nums[i] - 1 == nums[i - 1] || nums[i] == nums[i - 1])) ||
                        (i < nums.length - 1 && (nums[i] + 1 == nums[i + 1] || nums[i] == nums[i + 1]))) {
                    continue;
                } else {
                    list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findLonely(new int[]{1,3,5,3}));
    }
}
