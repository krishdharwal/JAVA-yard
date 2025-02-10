package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class exercide {
    public static void main(String[] args) {
        int[][] grid = {
                {2,4,5},
                {1,3,4},
                {9,3,9}
        };
//        diagonalSort(grid,1,0);
        for(int[] arr : grid) {
//            System.out.println(Arrays.toString(arr));
        }

//        System.out.println(Arrays.deepToString(grid));
        int[] arr = {9,4,5,8,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubleSort(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }

    public static void selectionSort(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            int m = findMax(arr,i);
            int temp = arr[i];
             arr[i] = arr[m];
             arr[m] = temp;
        }
    }
    public static int findMax(int[] arr,int e){
        int m = 0;
        for (int i = 0; i <= e; i++) {
            if (arr[m] < arr[i]){
               m = i;
             }                                 
        }
        return m;
    }


    public static void diagonalSortDesending(int[][] grid , int r , int c){
        int i = grid[0].length-1;
        while (i > 0){
            int r1 = r;
            int c1 = c;
                while (r1 < i && c1 < i){
                    if (grid[r1][c1] < grid[r1+1][c1+1]) {
                        int temp =    grid[r1][c1];
                        grid[r1][c1] =  grid[r1+1][c1+1];
                        grid[r1+1][c1+1] = temp;
                    }
                    r1++;
                    c1++;
                }
            i--;
        }
    }
}
