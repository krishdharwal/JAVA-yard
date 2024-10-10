package Questions;

import java.util.Arrays;

public class Maximum_subarray {


    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int current  = 0;
        int i = 0;
        while ( i < nums.length ) {
            current += nums[i];
            sum = Math.max(current,sum);

            if(current < 0){
                current = 0;
            }
            i++;

        }
        return sum;
    }




        // by using divide and conqueror

    public static int maxSubArray2(int[] nums) {
       return SubArray(nums,0,nums.length-1);
    }

    private static int SubArray(int[] arr, int s,int e) {
        if (s == e){
            return arr[s];
        }
        int m = s + (e - s) / 2;

        int leftSum  = SubArray(arr,s,m);
        int RightSUm = SubArray(arr,m+1,e);
        int ArraySum = sum(arr,s,m,e);

        return Math.max(Math.max(leftSum,RightSUm),ArraySum);
    }

    public static int sum(int[] arr,int s,int m,int e){
        int left = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = m; i >= s ; i--) {
            sum += arr[i];
            left = Math.max(left,sum);
        }


        int right = Integer.MIN_VALUE;
        int sum2 = 0;
        for (int i = m+1; i <= e ; i++) {
            sum2 += arr[i];
            right = Math.max(right,sum2);
        }


      return left + right;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
