package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transformed_array {

    public static int[] constructTransformedArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length){

            if (nums[i] > 0){
                int ptv = Search_Right(nums, i);
                list.add(ptv);

            } else if (nums[i] < 0) {
                int ntv = Search_Left(nums,i);
                list.add(ntv);
            }else {
                list.add(list.get(list.size()-1));
            }
            i++;
        }
        return list.stream().mapToInt(k -> k).toArray();
    }

    private static int Search_Left(int[] arr, int idx) {
        return arr[idx];
    }

    private static int Search_Right(int[] arr, int idx) {

        if (arr[idx] + idx < arr.length){
            return arr[arr[idx] + idx];
        }

            int value = arr[idx] - idx + 1 ;
            while (value > arr.length){
                value = value - idx + 1;
            }
            return arr[value];

    }


    public static void main(String[] args) {
        int[] ans = constructTransformedArray(new int[]{3,-2,1,1});
        System.out.println(Arrays.toString(ans));
    }



}
