package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length < 1){
            return  new int[]{-1,-1};
        }

        int s = 0;
        int e = nums.length-1;

        while(s < e){
            int m = s + (e - s) / 2;
            if(nums[m] == target) {
                //check
                if(m > 0 && nums[m-1] == target) return new int[]{m-1,m};
                else if(m < nums.length-1 && nums[m+1] == target) return new int[]{m,m+1};
                return new int[]{m,m};
            }
            else if(nums[m] > target){
                e = m - 1;
            }
            else {
                s = m + 1;
            }

        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        FindFirstAndLastPosition f = new FindFirstAndLastPosition();
        System.out.println(Arrays.toString(f.searchRange(new int[]{1},1)));
    }
}
