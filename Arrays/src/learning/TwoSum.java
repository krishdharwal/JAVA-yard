package learning;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,11,7,15};
        int tar  = 9;
        int[] ans = Tsum(arr,tar) ;

        System.out.println(Arrays.toString(ans));
    }

    private static int[] Tsum(int[] arr, int tar) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length-1;
        while (s < e){
            if (arr[s] + arr[e] == tar) return new int[]{s,e};
            else if (arr[s] + arr[e] > tar) e--;
            else s++;
        }
        return new int[]{-1,-1};

    }
}
