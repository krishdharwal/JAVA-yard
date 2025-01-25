package concepts;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1 };
        int[] ansd =  Bsort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(ansd));
    }

    private static int[] Bsortrec(int[] arr, int r,int c) {
        if (r == 0) return arr;
        if (r > c){
        if (arr[c] > arr[c+1]) {
            swaap(arr,c,c+1);
        }
            return Bsortrec(arr,r,c+1);

        }
        return Bsortrec(arr,r-1,0);
    }

    private static int[] Bsort(int[] arr, int r,int c) {
        if(r == 0) return arr;
        while (r > c){
            if (arr[c] > arr[c+1]){
                swaap(arr,c,c+1);
            }
            return Bsort(arr,r,c+1);

        }
        return Bsort(arr,r-1,0);
    }

    private static void swaap(int[] arr, int a, int b) {
        int temp  = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


