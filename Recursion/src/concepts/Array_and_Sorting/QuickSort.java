package concepts.Array_and_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    public int[] quickSort(int[] arr){
        return sort(arr,0,arr.length-1);
//        return arr;
    }

    private int[] sort(int[] arr, int l, int h) {
        if (l >= h){
            return arr;
        }
        int s = l;
        int e = h;

        int piv = s + (e - s) / 2;
        while (s <= e){
            if ( arr[s] < arr[piv]){
                s++;
            }

            if ( arr[piv] < arr[e]){
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

       arr =  sort(arr,l,e);
       return sort(arr,s,h);
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        System.out.println(Arrays.toString(q.quickSort(new int[]{4,3,2,1-4,0,7,4,9,-5,-1,0,-7,-1})));
        var dd = 32;
        System.out.println(dd);
    }
}
