package Searching;

import java.util.Arrays;

public class K_th_missing_positive {
    public static int findKthPositive(int[] arr, int k) {
        int[] temp = new int[arr[arr.length-1]];
        // cyclic sort
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = findKthPositive(arr,2);
        System.out.println(ans);
    }
}
