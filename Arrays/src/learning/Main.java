package learning;// attempting all sorting techniques again to re-memeorize

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

import static java.util.Collections.swap;

public class Main{
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
          // bubbleSort(arr);
         // selectionSort(arr);
        // insertionSort(arr);
       //  quickSort(arr,0,arr.length-1);
      //  cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length-1){
            int check = arr[i] -1;
            if (arr[i] != check) swapp(arr,i,check);
            i++;
        }
    }

    private static void quickSort(int[] arr,int l , int h) {
        if (l >= h) return;
        int s = l;
        int e = h;
        int m = s + (e -  s) / 2;
        int piv = arr[m];
        while(s <= e){
            if ( arr[s] < piv) s++;
            if (piv < arr[e]) e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
         quickSort(arr,l,e);
         quickSort(arr,s,h);
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) swapp(arr,j,j-1);
            }
        }
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int check = arr.length - i -1;
           int max  = maxx(arr,0, check);
            swapp(arr,max,check);
        }
    }



    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 1; k < arr.length; k++) {
                if (arr[k-1] > arr[k]) swapp(arr,k-1,k);
            }
        }
    }







    private static int maxx(int[] arr,int a,int b) {
        int max = 0;
        for (int i = a; i <= b; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }




    private static void swapp(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}