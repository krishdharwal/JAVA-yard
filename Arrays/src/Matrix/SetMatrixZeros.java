package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {

    public void setZeroes(int[][] matrix) {
        List<int [][]> list = new ArrayList<>();

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    int[][] temp = {
                            {i,j}
                    };
                    list.add(temp);
                }
            }
        }

        traverseAndMakeMatrixZero(matrix,list);
    }

    private void traverseAndMakeMatrixZero(int[][] matrix, List<int[][]> list) {
        for(int[][] ele : list){
            int r = ele[0][0];
            int c = ele[0][1];
            makeZero(matrix,r,c);
        }
    }

    private void makeZero(int[][] matrix, int r, int c) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[r][i] = 0;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][c] = 0;
        }
    }

}
