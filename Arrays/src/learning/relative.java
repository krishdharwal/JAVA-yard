package learning;

import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;

public class relative {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 6};
        int[] ans = relativearr(arr, arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] relativearr(int[] arr, int[] arr2) {

        int i = 0,j = 0;
        while (j < arr2.length) {
           i = swap(arr,arr2[j],i);
           j++;
            }
        Arrays.sort(arr,i,arr.length);


        return arr;

    }

    private static int swap(int[] arr, int target, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == target) {
                int temp = arr[from];
                arr[from++] = arr[i];
                arr[i] = temp;
            }
        }
        return from;
    }



}
