package learning;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        inserttion(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void inserttion(int[] arr) {

         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j > 0; j--) {
                 if (arr[j] <arr[j-1]){
                     swap(arr,j,j-1);
                 }
             }
         }
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
