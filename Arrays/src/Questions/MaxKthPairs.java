package Questions;

import java.util.Arrays;

public class MaxKthPairs {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length -1;

        int pairs = 0;
        while (i < j){
            int sum = nums[j] + nums[i];
            if (sum == k){
                pairs++;
                j--;
                i++;
            }
            else if (sum > k){
                j--;
            }else {
                i++;
            }

        }

        return pairs;
    }

    public static void main(String[] args) {
        MaxKthPairs m = new MaxKthPairs();
       int ans =  m.maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4},2);
       System.out.println(ans);
    }

}
