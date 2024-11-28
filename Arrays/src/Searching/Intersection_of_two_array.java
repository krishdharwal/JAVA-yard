package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_two_array {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums2.length){

             if (BS(nums1,nums2[i])) {
                list.add(nums2[i]);
                i++;
            }
            else i++;
        }
        return list.stream().mapToInt(k -> k).toArray();
    }

    public static boolean BS(int[] arr,int t){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] == t) return true;
            else if (arr[m] < t) s = m + 1;
            else e = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

}
