package concepts.backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {

    int queen = 0;
    public void solveNQueens(int n) {
        boolean[][] board = {
                {false,false,false},
                {false,false,false},
                {false,false,false},
                {false,false,false}
        };
        String[][] arr = {
                {"","","",""},
                {"","","",""},
                {"","","",""},
                {"","","",""}
        };

        queen = n;
        findCorrectPlacing(board,arr,0,0);
    }

    private void findCorrectPlacing(boolean[][] board,String[][] arr, int r, int c) {
        if (queen == 0){
            for (String[] ray : arr){
                for (String ele : ray){
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            return;
        }

        // check for the queen existance in this ( r c )
        if (!chkForQueenExistance(board,r,c)){
            return;
        }
        // just place the queen
        board[r][c] = true;
        arr[r][c] = "Q";
        queen = queen - 1;
        if (r < board.length-1) {
            findCorrectPlacing(board, arr, r + 1, c);
        }
        if (c < board[0].length-1){
            findCorrectPlacing(board,arr,r,c + 1);
        }

        board[r][c] = false;
        arr[r][c] = "";
        queen = queen + 1;
    }

    private boolean chkForQueenExistance(boolean[][] board, int r, int c) {
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

    public static void main(String[] args) {
        N_Queens q = new N_Queens();
        q.solveNQueens(4);
    }

}
