package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_photo {
    public static void rotate(int[][] matrix){

    // 1st swap
    int lastIdx = matrix.length-1;
    int halfLength = matrix.length / 2;
    int row1 = 0;
        while (halfLength != 0) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[row1][i];
            matrix[row1][i] = matrix[lastIdx][i];
            matrix[lastIdx][i] = temp;
        }
        row1++;
        lastIdx--;
        halfLength--;
    }

    // 2nd swap
    int k = 0;
    // increase 0 = k
    // traverse till length - k
        while (k <= matrix.length / 2){
        for (int i = k; i < matrix.length - k  ; i++) {
            int temp = matrix[i][k];
            matrix[i][k] = matrix[k][i];
            matrix[k][i] = temp;
        }
        k++;
    }

    // 3rd swap
    int p = matrix.length -1;
    int l = 1;
        while (p != matrix.length / 2) {
        for (int i = l; i < matrix.length - l; i++) {
            int temp = matrix[p][i];
            matrix[p][i] = matrix[i][p];
            matrix[i][p] = temp;
        }
        p--;
        l++;
    }

}

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3}
                ,{4,5,6},
                {7,8,9}
        };
        rotate(arr);
        for (int[] element : arr){
            for (int idx : element){
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}
