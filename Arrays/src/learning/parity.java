package learning;

import java.util.Arrays;

public class parity {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6,7,6,3,44};
        int[] ans  = sortByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortByParity(int[] arr) {

      if (arr.length <= 1) return new int[]{arr[0]};

      int[] temp = new int[arr.length];
      int i = 0;
      int j = arr.length-1;
        for (int k : arr){
            if (k % 2 == 0) temp[i++] = k;
            else temp[j--] = k;


        }
        return temp;
    }

    private static void swapp(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
