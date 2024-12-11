package learning;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Arrays;

public class first_miossing_positive {

    public static int firstMissingPositive(int[] nums) {
       int i = 0;
       while (i < nums.length){
           int chk = nums[i] - 1;
           if (chk >= 0 && chk <= nums.length  && nums[i] != nums[chk]){
               swap(nums, i , chk);

           }
           else {
               i++;
           }
       }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                return j+1;
            }

        }
        return nums.length + 1;
    }

    private static void swap(int[] nums, int i, int chk) {
        int temp = nums[i];
        nums[i] = nums[chk];
        nums[chk] = temp;
    }

    public static void main(String[] args) {
        int ans =   firstMissingPositive(new int[]{2,1,3});
        System.out.println(ans);
    }
}
