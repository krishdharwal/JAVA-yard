public class backtrackAgain {
    public static void main(String[] args) {
       int n = 4;
//       putQueens(new boolean[n][n],0);
       putKnights(new boolean[n][n],0,0,n);
    }

    private static void putQueens(boolean[][] board ,int r) {
        if (r == board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int c = 0; c < board.length; c++) {
            if (isSafe(board,r,c)){
                board[r][c] = true;
                putQueens(board,r+1);
                board[r][c] = false;

            }
        }
    }

    private static void display(boolean[][] board) {
        for (boolean[] arr : board){
            for (boolean e : arr){
                if (e){
                    System.out.print("K ");
                }
                else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        // vertically
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }

            // daigonal left
        int maxLeft = Math.min(r,c);
            for (int i = 0; i <= maxLeft ; i++) {
                if (board[r-i][c-i]){
                    return false;
            }
        }

            int maxRight = Math.min(r,board.length - c -1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }


    ////
    ///
    ///                    KNIGHTS
    ///
    //
    //


    public static void putKnights(boolean[][] board,int r , int c,int target){
        if (target == 0){
            display(board);
            System.out.println();
            return;
        }

        //col out of bound
        if (r == board.length-1 && c == board.length){
            return;
        }

        if (c == board.length){
            putKnights(board,r+1,0,target);
            return;
        }

            if (isSafe2(board,r,c)){
                board[r][c] = true;
                putKnights(board,r,c+1,target-1);
                board[r][c] = false;
            }
            putKnights(board,r,c+1,target);

    }

    private static boolean isSafe2(boolean[][] board, int r, int c) {
        if (r-2 < board.length && r-2 >= 0 && c+1 < board.length && c+1 >= 0){
            if (board[r-2][c+1]){
                return false;
            }
        }

        if (r-2 < board.length && r-2 >= 0 && c-1 < board.length && c-1 >= 0){
            if (board[r-2][c-1]){
                return false;
            }
        }

        if (r-1 < board.length && r-1 >= 0 && c-2 < board.length && c-2 >= 0){
            if (board[r-1][c-2]){
                return false;
            }
        }

        if (r+1 < board.length && r+1 >= 0 && c-2 < board.length && c-2 >= 0){
            if (board[r+1][c-2]){
                return false;
            }
        }

        return true;
            }

}
