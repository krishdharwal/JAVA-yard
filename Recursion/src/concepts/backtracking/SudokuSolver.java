package concepts.backtracking;

import java.util.Arrays;

public class SudokuSolver {

    public void solveSudoku(int[][] board) {
        solve(board);
    }

    private boolean solve(int[][] board) {
        int r = -1;
        int c = -1;
        boolean isEmpty = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0){
                    isEmpty = true;
                    r = i;
                    c = j;
                    break;
                }
            }
            if (isEmpty) break;

        }
        if(!isEmpty){
            // means the sudoku is solved
            display(board);
            return true;
        }

        for (int i = 1; i <= 9 ; i++) {
            if (isSafe(board,r,c,i)) {
                board[r][c] = i;
                if (solve(board)) return true;
                board[r][c] = 0;
            }

        }

        return false;
    }

    public boolean isSafe(int[][] board, int r , int c, int val) {
        // check for the 3 X 3 grid
        int r1 = r - r % 3;
        int c1 = c - c % 3;

        for (int i = r1; i < r1 + 3; i++) {
            for (int j = c1; j < c1 + 3; j++) {
             if (board[i][j] == val) return false;
            }
        }

        // check for the left side and right side
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == val) return false;
            if (board[i][c] == val) return false;
        }

        return true;
    }

        private void display(int[][] board) {
        for(int[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SudokuSolver s = new SudokuSolver();
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 9, 0, 0, 1, 0, 0, 3, 0},
                {0, 0, 6, 0, 2, 0, 7, 0, 0},
                {0, 0, 0, 3, 0, 4, 0, 0, 0},
                {2, 1, 0, 0, 0, 0, 0, 9, 8},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 5, 0, 6, 4, 0, 0},
                {0, 8, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };


        s.solveSudoku(board);
    }
}
