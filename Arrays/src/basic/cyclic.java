package basic;

import java.util.Arrays;

public class cyclic {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,4,1,0};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int idx = arr[i] ; // if there is no zero do this = arr[i] - 1
            if (arr[i] == arr[idx] ){
                i++;
            }
          else {
                swap(arr, idx, i);
            }

        }
    }

    private static void swap(int[] arr, int idx, int i) {
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;

    }
}
