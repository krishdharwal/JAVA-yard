import java.util.Arrays;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] arr  = {
                {1,2,3},
                {4,5,6}
        };
        int[][] arr2  = {
                {7,8},
                {9,10},
                {11,12}
        };
        int[][] ans = matrixMul(arr,arr2);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] matrixMul(int[][] arr1,int[][] arr2){
        int[][] temp = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    temp[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return temp;
    }
}
