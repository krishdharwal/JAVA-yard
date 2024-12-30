package basic;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int MaxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            MaxSum = Math.max(currentSum,MaxSum);
            if (currentSum < 0) currentSum = 0;
        }
        return MaxSum;
    }


    public static int maxProduct(int[] nums) {
        if(nums.length < 1){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int leftMax = 1;
        int rightMax = 1;
        int mainMax = 0;
        int n = nums.length-1;
        for (int i = 0; i <= n; i++) {

            leftMax *= nums[i];
            rightMax *= nums[n - i];
            mainMax = Math.max(mainMax,Math.max(leftMax,rightMax));

             leftMax = (leftMax == 0) ? 1 : leftMax;
             rightMax = (rightMax == 0) ? 1 : rightMax;
        }
        return mainMax;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2,-1,-1}));
    }

}
