package perfixSum;

import java.util.Arrays;

public class ZeroArrayTransformation_2 {

    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];
        int k = 0;
        for (int[] arr : queries){
            int l = arr[0];
            int r = arr[1];
            int val = arr[2];
            diff[l] += val;
            if (r+1 < n) diff[r+1] += val - (val + val );
            k++;
            System.out.println(Arrays.toString(diff));
            if(findIsArrayIsZero(nums,diff)){
                return k;
            }
        }
        return -1;
    }

    private boolean findIsArrayIsZero(int[] nums, int[] diff) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += diff[i];
            if (sum < nums[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ZeroArrayTransformation_2 z = new ZeroArrayTransformation_2();
        z.minZeroArray(new int[]{2,0,2},new int[][]{{0,2,1},{0,2,1}});

    }

}
