package perfixSum;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int wholeSum = 0;
        for(int ele : nums) wholeSum += ele;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i<nums.length; i++){
            int piv = nums[i];
            rightSum = wholeSum - leftSum - piv;
            if(leftSum == rightSum){
                return i;
            }
            leftSum += piv;
        }
        return -1;
    }
}
