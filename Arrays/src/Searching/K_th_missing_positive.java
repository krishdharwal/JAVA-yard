package Searching;

import java.util.Arrays;

public class K_th_missing_positive {

    // cyclic sort algo
    public static int findKthPositive(int[] arr, int k) {
        int[] temp = new int[arr[arr.length-1]];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]-1] = arr[i];
        }
        int j = 0;
       while (j < temp.length && k != 0){
           if (temp[j] == 0){
               k--;
           }
          j++;
       }
       if (k != 0){
           return arr[arr.length-1] + k;
       }
       return j;
    }


    // Binary search algo
    public int findKthPositive2(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // If number of positive integers
            // which are missing before arr[pivot]
            // is less than k -->
            // continue to search on the right.
            if (arr[mid] - mid - 1 < k) {

                l = mid + 1;

                // Otherwise, go left.
            } else {

                r = mid - 1;

            }
        }
        // At the end of the loop, left = right + 1,
        // and the kth missing is in-between arr[right] and arr[left].
        // The number of integers missing before arr[right] is
        // arr[right] - right - 1 -->
        // the number to return is
        // arr[right] + k - (arr[right] - right - 1) = k + left
        return l + k;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = findKthPositive(arr,2);
        System.out.println(ans);
    }
}
