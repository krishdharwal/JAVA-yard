package concepts.backtracking;

import java.util.Arrays;

public class SudokuSolver {

    public void solveSudoku(int[][] board) {
        if (isNotEmpty(board)){
            display(board);
            return;
        }

        int r = -1;
        int c = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    r = i;
                    c = j;
                }
            }
        }
        if (r == -1){
            // means sudoku have no empty elements
            return;
        }
        for (int i = 1; i <= 9 ; i++) {
            if (isSafe(board,r,c,i)){
                board[r][c] = i;
                solveSudoku(board);
                board[r][c] = 0;
            }

        }

    }

    private boolean isNotEmpty(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }

        }
        return true;
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
        int[][] sudokuGrid = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        s.solveSudoku(sudokuGrid);
    }
}
