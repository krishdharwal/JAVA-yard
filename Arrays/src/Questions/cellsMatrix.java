package Questions;

import java.util.Arrays;

public class cellsMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for (int r = 0; r < indices.length; r++) {
            for (int i = 0; i < n; i++) {
                arr[indices[r][0]][i]++;
            }
        }

        for (int r = 1; r < indices.length; r++) {
            for (int i = 0; i < m; i++) {
                arr[i][indices[0][r]]++;
            }
        }


        System.out.println(Arrays.deepToString(arr));
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1},
                {0,0}
        };
        oddCells(2,2,arr);

    }
}
