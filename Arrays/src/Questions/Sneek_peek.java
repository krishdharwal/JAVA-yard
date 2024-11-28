package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sneek_peek {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int k = 0;
        int[] temp = new int[2];
        List<Integer> ans = new ArrayList<>();
        while (i < nums.length-1){
            if (nums[i] == nums[i+1]) {
             temp[k++] = nums[i];
            }
            i++;
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] nums = {0,3,2,1,3,2};
        /*System.out.println(getSneakyNumbers(nums));*/

    }
}