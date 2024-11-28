package Searching;

import java.util.Arrays;

public class Count_negative_in_sorted_matrix {

    // binary search algo
    public static int countNegatives(int[][] grid) {
        int externalCount = 0;
// just treat every row of the matrix as a individual array and apply binary search algo to it
        for (int i = 0; i < grid.length; i++) {

                int s = 0;
                int e = grid[i].length - 1;
                int count = 0;

                while (s <= e ){
                    int m = s + (e - s) / 2;
                    if (grid[i][m] < 0){

                        if ( m == 0 || grid[i][m-1] >= 0){
                            count += grid[i].length - m ;
                        }
                        e = m - 1;
                    }
                    else {
                        s =  m + 1;
                    }
                }
                externalCount  += count;

        }

        return externalCount;
    }



 // Recursion algo
    public int countNegatives2(int[][] grid) {
        return traverse(grid.length-1, grid[0].length-1, grid);
    }

    int traverse(int i, int j, int[][] grid){
        // agar value +ve hai toh 0 return karo
        if(i<0 || j<0 || grid[i][j]>=0) {
            return 0;
        }
        else{
            // agar value -ve hai toh value +1 karke agle ko call karo
            // Call back ke time phir se usi value ko count na karane kai liye us -ve value ko '0' set kar do
            grid[i][j]=0;
            int val = 1 + traverse(i-1,j,grid) + traverse(i,j-1,grid);
            return val;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, -1, -1, -1,-1},
                {3, -1, -1, -1,-1},
                {1, -1, -1, -2,-2},
                {1,-1,-2, -3,-3}
        };

//        int[] arr = {-4,-3,-2,-1};
//        countNegatives2(arr);

       int ans = countNegatives(mat);
        System.out.println(ans);


    }

    // test passed
    private static void countNegatives2(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int count = 0;

        while (s <= e ){
            int m = s + (e - s) / 2;
            if (arr[m] < 0){
                if ( m == 0 || arr[m-1] > 0){
                    count += arr.length - m ;
                }
                e = m - 1;
            }
            else {
                s =  m + 1;
            }
        }
        System.out.println(count);
    }
}
