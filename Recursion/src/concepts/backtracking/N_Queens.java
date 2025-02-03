package concepts.backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {


    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        findCorrectPlacing(new boolean[n][n],0,new ArrayList<>(),".".repeat(n-1));
        return ans;
    }

    private void findCorrectPlacing(boolean[][] board, int row, List<String> list,String p) {
        if (row == board.length){
            ans.add(new ArrayList<>(list));
            return;
        }


        for (int col = 0; col < board[0].length; col++) {

            if (chkForQueenExistance(board,row,col)){
                board[row][col] = true;
                String l = p.substring(0,col);
                String r = p.substring(col);
                list.add(l + "Q" + r);
                findCorrectPlacing(board,row+1,list,p);
                board[row][col] = false;
                list.removeLast();
            }

        }

    }

    private boolean chkForQueenExistance(boolean[][] board, int r, int c) {
        // checking up to down
        for (int i = 0; i < r; i++) {
            if (board[i][c]) return false;
        }

        // check left
        int minForLeft = Math.min(r,c);
        for (int i = 1; i <= minForLeft; i++) {
            if (board[r-i][c-i]) return false;
        }

        int minForRight = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= minForRight; i++) {
            if (board[r-i][c+i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        N_Queens q = new N_Queens();
        System.out.println(  q.solveNQueens(4));
    }

}
