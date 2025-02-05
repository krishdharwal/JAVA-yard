package concepts.backtracking;

import java.util.Arrays;

public class SudokuSolverCharatersGrid {

    public void solveSudoku2(char[][] board) {
        if (isNotEmpty(board)){
            display(board);
            return;
        }

        int r = -1;
        int c = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
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
            char ch = (char) (i + '0');
            if (isSafe(board,r,c,ch)){
                board[r][c] = ch;
                solveSudoku2(board);
                board[r][c] = '.';
            }

        }

    }

    private boolean isNotEmpty(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }

        }
        return true;
    }


    public boolean isSafe(char[][] board, int r , int c, char val) {
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

        private void display(char[][] board) {
        for(char[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SudokuSolverCharatersGrid s = new SudokuSolverCharatersGrid();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };


        s.solveSudoku2(board);
    }
}
