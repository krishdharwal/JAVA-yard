package Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;


public class MaximumInSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= nums.length - k ; i++) {
            if (k + i - 1 < nums.length) {
                int max = maxFinder(nums, i, k + i);
                list.add(max);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static int maxFinder(int[] arr , int s , int e){
       int[] temp = Arrays.copyOfRange(arr,s,e);
       Arrays.sort(temp);
       return temp[temp.length-1];
    }

    public static void main(String[] args) {
        List<Integer> l  = new ArrayList<>();
        int[] arr  = l.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }

}
