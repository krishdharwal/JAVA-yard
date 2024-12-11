package learning;

import java.util.Arrays;

public class MIssing_number {
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != i){
                    return i;
                }
            }
            return nums.length;
        }

    public static void main(String[] args) {
        MIssing_number m = new MIssing_number();
       int ans =   m.missingNumber(new int[]{0,3,1});
        System.out.println(ans);
    }
}
