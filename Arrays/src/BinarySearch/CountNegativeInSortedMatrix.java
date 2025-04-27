package BinarySearch;

import java.util.Arrays;

public class CountNegativeInSortedMatrix {
    // this is when array is sorted in descending order
    public int countNegatives(int[][] grid) {
       int r = grid.length-1;
       int c = grid[0].length-1;
       int count = 0;
        for (int i = r; i >= 0; i--) {
            for (int j = c; j >= 0; j--) {
               if (grid[i][j] >= 0){
                   break;
               }
               count += 1;
            }
        }
        return count;
    }


    // this is for if the array is unsorted
    public int countNegatives2(int[][] grid) {
        int count = 0;
        for(int[] arr : grid){
            count += findNegativeInArray(arr);
        }
        return count;
    }

    public static int findNegativeInArray(int[] arr){
        Arrays.sort(arr);
        // return this if no -ve exists
        if (arr.length > 1 && arr[0] >= 0){
            return 0;
        }
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] > 0) e = m - 1;
            else s = m + 1;
        }
        return s;
    }

    public static void main(String[] args){
        System.out.println(findNegativeInArray(new int[]{4,3,2,1}));
    }

}
