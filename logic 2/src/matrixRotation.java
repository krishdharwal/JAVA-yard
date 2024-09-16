public class matrixRotation {
    public static void main(String[] args) {
        int[][] mat =  {{0,1},{1,0}};
        int[][] target={{1,0},{0,1}};

//        int[][] ans = Mrot(mat);
//       System.out.println(Arrays.deepToString(ans));
      System.out.println(Mrot(mat,target));
    }

    private static boolean Mrot(int[][] mat, int[][] target) {
        int[][] temp = new int[mat[0].length][mat.length];

        for (int i = mat.length-1; i >= 0  ; i--) {
            for (int j = mat[1].length-1; j >= 0 ; j--) {
                temp[i][j] = mat[j][mat.length - i - 1];
                }
            }


        for (int i = 0; i < mat.length  ; i++) {
            for (int j = 0; j < mat[0].length ; j++){
                if(temp[i][j] == target[i][j]){
                    return true;
                }
            }
        }

        return false;

    }


}
