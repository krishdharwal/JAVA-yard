package Questions;

import java.util.Arrays;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int p = m;

        while (p < nums1.length) {
            nums1[p++] = nums2[i++];
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

//        if (nums1[i] < nums2[0]){
//            int q = 0;
//            int p = m;
//
//            while (p < nums1.length) {
//                nums1[p++] = nums2[q++];
//            }
//            }

//        else {
            while (j >= 0){
                if (i >= 0 && nums1[i] > nums2[j]){
                    nums1[k] = nums1[i];
                    i--;
                }
                else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }
//        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {};
        merge2(arr1,3,arr2,3);

    }
}