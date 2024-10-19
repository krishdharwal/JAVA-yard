package Questions;

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix1 {

    public static List<Integer> spiralOrder(int[][] matrix,int i ,int j,List<Integer> list) {
//      +

//        while (i == matrix[0].length || j == matrix.length) {
//            return list;
//            list.add(matrix[i][j]);
//
//        }
        return list;

    }


    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(spiralOrder(mat, 0, 0, new ArrayList<>(mat.length )));
//        spiralOrder(mat, 0, 0,new ArrayList<>(mat.length ));

    }

}