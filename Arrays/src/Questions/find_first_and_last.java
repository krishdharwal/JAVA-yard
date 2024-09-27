package Questions;

import java.util.Arrays;

public class find_first_and_last {
    public static int[] searchRange(int[] nums, int target){
    if(nums.length == 0 ){
        return new int[]{-1,-1};
    }

//         if(nums.length == 1 && target == nums[0]){
//        return new int[]{0,0};
//    }

    int s = 0;
    int e = nums.length-1;

        while (s <= e){
        if (nums[s] == target && nums[e] == target){
            return new int[]{s,e};
        }

        if (nums[s] != target){
            s++;
        }
        if (nums[e] != target){
            e--;
        }

    }
        return new int[]{-1,-1};
        }

    public static void main(String[] args) {
        int[] arr = {1};
        int[] ans = searchRange(arr,1);
        System.out.println(Arrays.toString(ans));
    }
}
