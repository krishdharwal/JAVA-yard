package concepts;

public class NQueens {
    public static void main(String[] args){
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(Queens(board,0));
    }

    private static int Queens(boolean[][] board, int r) {
        if(r == board.length){
           display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // maze
        for (int c = 0; c < board.length; c++) {
            if (isSafe(board,r,c)){
                board[r][c] = true;
                count += Queens(board,r+1);
                board[r][c] = false;
            }

        }
        return count;

    }

    private static void display(boolean[][] board) {
        for (boolean[] arr : board){
            for (boolean i : arr){
                if (i){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        // check vertically
        for (int i = 0; i < r; i++) {
            if (board[i][c]){
                return false;
            }
        }

        // check diagonally left
        int maxLeft = Math.min(r,c);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[r-i][c-i]){
                return false;
            }
        }

        int maxRight = Math.min(r,board.length - c -1);
        for (int i = 1; i <= maxRight ; i++) {
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
