package basic;

import java.util.ArrayList;
import java.util.List;

public class longest_mountain {

    public static int longestMountain(int[] arr) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1] ) peaks.add(i);
        }

        int max_peak = 0;
        for (int i = 0; i < peaks.size(); i++) {

            int peak = peaks.get(i);
            int ele = 1;

            // LHS ASC
            int l = peak ;
            while (l > 0 && arr[l - 1] < arr[l]){
                ele++;
                l--;
            }

            // RHS DEC
            int r = peak ;
            while (r < arr.length - 1 && arr[r] > arr[r + 1]){
                ele++;
                r++;
            }
            max_peak = Math.max(max_peak , ele);
        }
        return max_peak;
    }


    public static void main(String[] args) {
        System.out.println(longestMountain(new int[]{2,2,2,2}));
    }


}