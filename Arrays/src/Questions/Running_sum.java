package Questions;

import java.util.Arrays;

public class Running_sum {
    public static int[] runningSum(int[] nums) {
        if (nums.length <= 1){
            return nums;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Running_sum sum = new Running_sum();
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
