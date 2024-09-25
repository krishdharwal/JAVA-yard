package learning;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Cyclicsort{
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){

        int i = 0;
        while(i < arr.length){
            int chk = arr[i] -1 ;
            if (arr[i] == arr[chk])
            {
                i++;
            }
            else{
                swap(arr,i,chk);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;

    }


}