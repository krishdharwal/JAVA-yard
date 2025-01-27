package questions.concepts;

public class sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}
        };
        if (sudoku(board)) {
            display(board);
        } else {
            System.out.println("cantsolve");
        }


    }

    private static void display(int[][] position) {
        for (int[] arr : position) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }


    static boolean sudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;


        boolean anyEmptyleft = true;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 0) {
                    row = r;
                    col = c;
                    anyEmptyleft = false;
                    break;
                }
            }
            if (anyEmptyleft == false) {
                break;
            }
        }
        if (anyEmptyleft == true) {
            return true;
            // solved all
        }

        // backtrack part
        // add number
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;   // this is bt
                if (sudoku(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }

        // ye solve nahi ho sakta
        return false;

    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
//        check row vise
        for (int i = 0; i < board.length; i++) {
            if (board[row][col] == num) {
                return false;
            }
        }

        // check column vise
        for (int[] arr : board) {
            if (arr[col] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}

