package perfixSum;

public class ZeroArrayTransformation_1 {

    public boolean isZeroArray(int[] nums, int[][] queries) {
        // first make a difference array that will help to,
        // find how much to decrement the array values to make it zero
        int n = nums.length;
        int[] diff = new int[n];
        for (int[] arr : queries){
            int l = arr[0];
            int r = arr[1];
            diff[l]++;
            if (r+1 < n){
                diff[r+1]--;
            }
        }

        // then just find the prefix of the array and get the answer
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            // in any point if the element of the nums get greater than the sum,
            // means you cant make it to zero
            if (nums[i] > sum) {
                return false;
            }
        }
        return true;
    }

}
