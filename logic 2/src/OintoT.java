import java.util.*;

public class OintoT {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
//        combine(nums,index);
        System.out.println(Arrays.toString(combine(nums,index)));


    }
    public static long[] combine(int[] nums, int[] index){
        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(nums[i],index[i]);
        }

        return new long[0];
    }


}
