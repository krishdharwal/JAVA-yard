package concepts;

import java.util.Arrays;

public class SelectionRec {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,9 };
        int[] ansd =  Ssortrec(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(ansd));
//        int ans = max(arr,0);
//        System.out.println(ans);
    }

    private static int[] Ssortrec(int[] arr, int r,int c, int max) {
          if (r == 0) return arr;
          if (r > c) {
              if (arr[c] > arr[max]) {
                  return Ssortrec(arr, r, c+1, c);
              }
            return Ssortrec(arr,r,c+1,max);
          }
          swaap(arr,r-1,max);
          return Ssortrec(arr,r-1,0,0);
    }

    private static void swaap(int[] arr, int a, int b) {
        int temp  = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
