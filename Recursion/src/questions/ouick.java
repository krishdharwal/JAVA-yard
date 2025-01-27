package questions.concepts;

import java.util.Arrays;

public class ouick {
    public static void main(String[] args) {
            int[] arr = {5,4,3,2,1,9,6,7};
             Quicksortrec(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));

    }

    private static void Quicksortrec(int[] arr, int low, int high) {
        if (low >= high) return;

        int s = low;
        int e = high;
        int piv = s + (e - s) / 2;
        while (s <= e) {
            while (arr[piv] > arr[s]) {
              s++;
            }
            while (arr[piv] < arr[e]){
                e--;
            }
            if (s <= e){
                swaap(arr,s,e);
                s++;
                e--;
            }
        }

         Quicksortrec(arr,s,high);
         Quicksortrec(arr,low,e);
    }
    private static void swaap(int[] arr, int a, int b) {
        int temp  = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
