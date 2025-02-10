package questions;

public class WordSearchInMatrix {

    public static boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(board[r][c] == word.charAt(0) && word.length() == 1){
                    return true;
                }
                if(board[r][c] == word.charAt(0)
                        && findWord(board,new boolean[board.length][board[0].length],r,c,word)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean  findWord(char[][] board, boolean[][] bool, int r, int c, String word){
        if (word.isEmpty()){
            return true;
        }
        if(bool[r][c] || board[r][c] != word.charAt(0)){
            return false;
        }
        bool[r][c] = true;
        char ch = word.charAt(0);
        String newSubString = word.substring(1);

         boolean found = ((r < board.length-1 && findWord(board,bool,r+1,c,word.substring(1))) ||
          (c < board[0].length-1 && findWord(board,bool,r,c+1,word.substring(1))) ||
          (c > 0 && findWord(board,bool,r,c-1,word.substring(1))) ||
          (r > 0 && findWord(board,bool,r-1,c,word.substring(1))));

        bool[r][c] = false;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
        };
        System.out.println(exist(board,"ABCCED"));
    }
}
