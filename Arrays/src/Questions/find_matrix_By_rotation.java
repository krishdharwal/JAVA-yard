package Questions;

public class find_matrix_By_rotation {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int t = 0;
        while (t < 4) {
            if (check(mat, target)) {
                return true;
            }
            mat = transpose_matrix(mat); // Transpose the matrix
            mat = reverse_rows(mat);     // Reverse the rows after transposing
            t++;
        }
        return false;
    }

    public static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] transpose_matrix(int[][] mat) {
        int[][] temp = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                temp[j][i] = mat[i][j];
            }
        }
        return temp;
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

    public static void main(String[] args) {
        int[][] mat = {
                {1, 0},
                {0, 1}
        };

        int[][] target = {
                {0, 1},
                {1, 0}
        };

        System.out.println(findRotation(mat, target));
    }
}
