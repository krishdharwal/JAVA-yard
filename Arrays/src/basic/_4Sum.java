package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4Sum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4){
            return new ArrayList<>();
        }


//        if (nums[0] == 1000000000){
//            return new ArrayList<>();
//        }
        Arrays.sort(nums);
        List<List<Integer>> MainList = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {

            if (i != 0 && nums[i] == nums[i-1]){
                continue;
            }

//            if(i < nums.length-1 && nums[i] == nums[i+1]) {
//                continue;
//            }

            for (int j = i+1; j < nums.length - 2; j++) {

                if (j != i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int s = j+1;
                int e = nums.length-1;
                while (s < e){

                    long sum =(long) nums[i] + nums[j] + nums[s] + nums[e];
                    if (sum == target){
                        MainList.add(Arrays.asList(nums[i] , nums[j] , nums[s] , nums[e]));
                        s++;
                        e--;
                        // check for duplicacy
                        while (s < e && nums[s] == nums[s-1]) s++;
                        while (s < e && nums[e] == nums[e+1]) e--;

                    } else if (sum < target) {
                        s++;
                    }else {
                        e--;
                    }
                }
            }
        }
        return MainList;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000} , -294967296));
    }
//1,0,-1,0,-2,2} , 0
}
