package learning;

import java.util.Arrays;

public class PrimeterTriangle {
    public static void main(String[] args) {
        int[] arr = {3,5,6};
        int ans = perimeterArray(arr);
        System.out.println(ans);
    }

    private static int perimeterArray(int[] arr) {
                Arrays.sort(arr);
                int n = arr.length-1;
                if (arr.length > 3){
                    n = arr.length-3;
                }
        for (int i = n; i > 0; i--) {
                if (arr[i] + arr[i+1] > arr[i+2]) return arr[i] + arr[i+1] +arr[i+2];
        }
        return 0;
    }
}

