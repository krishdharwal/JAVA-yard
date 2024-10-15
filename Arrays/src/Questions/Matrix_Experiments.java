package Questions;

import java.util.Arrays;

public class Matrix_Experiments {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3} ,
                {4,5,6},
                {7,8,9}
        };
//        Transpose_of_Matrix(mat);
//        Vertical_Flip_the_matrix(mat);
        Horizontal_Flip_the_matrix(mat);
    }

    public static void  Transpose_of_Matrix(int[][] mat){
        int[][] temp = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                temp[j][i] = mat[i][j];
            }
        }
        System.out.println(Arrays.deepToString(temp));
    }


    public static void Vertical_Flip_the_matrix(int[][] mat){
        int row = mat.length;
        for (int i = 0; i < row / 2; i++) {
          int[] temp = mat[i];
          mat[i] = mat[row - 1 - i];
          mat[row - 1 - i] = temp;
        }
        System.out.println(Arrays.deepToString(mat));
    }


    public static void Horizontal_Flip_the_matrix(int[][] mat){
      for (int[] row : mat){
          int s = 0;
          int e = row.length - 1;

          while (s < e){
              int temp = row[s];
              row[s] = row[e];
              row[e] = temp;
              s++;
              e--;
          }
      }
        System.out.println(Arrays.deepToString(mat));
    }


    public static int[][] reverse_rows(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int left = 0, right = mat[0].length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
        return mat;
    }
}
