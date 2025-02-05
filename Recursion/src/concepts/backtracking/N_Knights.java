package concepts.backtracking;

import java.util.Arrays;

public class N_Knights {
    public void knights(int n){
        findCombinations(new boolean[n][n],0,0,n);
    }

    private void findCombinations(boolean[][] board, int r,int c,int knight) {
        if (knight == 0){
            display(board);
            return;
        }

        if (r == board.length-1 && c == board.length){
            return;
        }

        if (c == board.length){
            findCombinations(board,r+1,0,knight);
            return;
        }

        // if there is safe position place the knight
            if (isSafePosition(board,r,c)){
                board[r][c] = true;
                findCombinations(board,r,c+1,knight-1);
                board[r][c] = false;
            }

         // if there is no safe place just skip that block
           findCombinations(board,r,c+1,knight);

    }

    public boolean isSafePosition(boolean[][] arr,int r,int c){
        // up
        if (r-2 >= 0){
            // up left
            if (c - 1 > 0 && arr[r-2][c-1]){
                return false;
            }
            // up right
            if (c + 1 < arr.length && arr[r-2][c+1]){
                return false;
            }
        }

        // left
        if (r - 1 >= 0 && c - 2 >= 0 && arr[r-1][c-2]){
            return false;
        }

        // right
        if (r - 1 >= 0 && c + 2 < arr.length && arr[r-1][c+2]){
            return false;
        }


        return true;
    }

    private void display(boolean[][] board) {
        for(boolean[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        N_Knights k = new N_Knights();
        k.knights(4);
    }
}
