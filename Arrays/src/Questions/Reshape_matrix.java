package Questions;

import java.util.Arrays;

public class Reshape_matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mat[i][c];

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4},
        };
        System.out.println(Arrays.deepToString(matrixReshape(arr,1,4)));

    }
}
