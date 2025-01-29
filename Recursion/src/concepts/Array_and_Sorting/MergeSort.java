package concepts.Array_and_Sorting;

import java.awt.event.MouseWheelEvent;
import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr){
        return mergeSorAlgo(arr);
    }

    private int[] mergeSorAlgo(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] l = mergeSorAlgo(Arrays.copyOfRange(arr,0,mid));
        int[] r = mergeSorAlgo(Arrays.copyOfRange(arr,mid,arr.length));

        // now merge them in ascending order
        int[] k = new int[l.length + r.length];
        int a = 0,b = 0,c = 0;
        while (a < l.length && b < r.length){
            if (l[a] < r[b]){
                k[c++] = l[a++];
            }else {
                k[c++] = r[b++];
            }
        }

        while (a < l.length){
            k[c++] = l[a++];
        }

        while (b < r.length){
            k[c++] = r[b++];
        }

        return k;
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        System.out.println(Arrays.toString(m.mergeSort(new int[]{4,3,2,1})));
    }
}
