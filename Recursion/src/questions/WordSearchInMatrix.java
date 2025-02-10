package questions;

public class WordSearchInMatrix {

    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(board[r][c] == word.charAt(0)
                        && findWord(board,new boolean[board.length][board[0].length],r,c,word.substring(1))){
                    return true;
                }
            }
        }
        return istrue;
    }

    boolean istrue = false;
    public boolean findWord(char[][] board, boolean[][] bool, int r, int c, String word){
        if (word.isEmpty()){
            istrue = true;
            return true;
        }
        if(!bool[r][c]){
            return false;
        }
        bool[r][c] = false;
        char ch = word.charAt(0);
        // checks
        // down
        if (r < board.length-1 && board[r+1][c] == ch){
            if(findWord(board,bool,r+1,c,word.substring(1))) return true;
        }

        // right
        if (c < board[0].length-1 && board[r][c+1] == ch){
            if(findWord(board,bool,r,c+1,word.substring(1))) return true;
        }

        //  left
        if (c > 0 && board[r][c-1] == ch){
            if(findWord(board,bool,r,c-1,word.substring(1))) return true;
        }
        // up
        if (r > 0 && board[r-1][c] == ch){
            if( findWord(board,bool,r-1,c,word.substring(1))) return true;
        }
        bool[r][c] = true;
        return false;
    }
}
