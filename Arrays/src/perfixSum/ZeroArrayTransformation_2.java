package perfixSum;

import java.util.Arrays;
                               // Look Back Algorithm
public class ZeroArrayTransformation_2 {

    public int minZeroArray(int[] nums, int[][] queries) {
        // use binary search
        int s = 0;
        int e = queries.length-1;

        if (!isZero(nums,queries,e)){
            return -1;
        }
        while (s < e){
            int m = s + (e - s) / 2;
            if (isZero(nums,queries,m)){
                e = m;
            }else {
                s = m+1;
            }
        }
        return s;
    }

    public boolean isZero(int[] nums,int[][] queries,int m){
        int n = nums.length;
        int[] diff = new int[n];

        for (int i=0; i<=m; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            diff[l] = val;
            if (r+1 < n) diff[r+1] = val - (val + val);
        }

        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += diff[i];
            if (nums[i] > prefixSum) return false;
        }
        return true;
    }

}
