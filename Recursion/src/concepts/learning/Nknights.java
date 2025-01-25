package concepts.learning;

public class Nknights {
    public static void main (String[] args){
    int n = 4;
    boolean[][] maze  = new boolean[n][n];
    putKnights(maze,0,0,4);

 }

    private static void putKnights(boolean[][] board, int r, int c, int knights) {
        if (knights == 0){
            display(board);
            System.out.println();
            return;
        }

        // jab col out of bound ho jaye
        if (r == board.length-1 && c == board.length){
            return;
        }

        // jab mera knight last colum se wapis ayega
        if (c == board.length){
            putKnights(board,r+1,0,knights);
            return;
        }

        if (isSafe(board,r,c)){
            board[r][c] = true;
            putKnights(board,r,c+1,knights-1);
            board[r][c] = false;
        }
        // ye is liye taki agar safe board nahi hai toh

            putKnights(board,r,c+1,knights);

    }

    private static void display(boolean[][] position) {
        for (boolean[] arr : position){
            for (boolean e : arr){
                if (e){
                    System.out.print("K ");
                }
                else {
                System.out.print("X ");}
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
   if (isvalid(board,r-2,c+1)){
         if (board[r - 2][c + 1]) {
                return false;
            }
        }

        if (isvalid(board,r-2,c-1)){
            if (board[r - 2][c - 1]) {
                return false;
            }
        }

        if (isvalid(board,r-1,c+2)){
            if (board[r - 1][c + 2]) {
                return false;
            }
        }

        if (isvalid(board,r-1,c-2)){
            if (board[r - 1][c - 2]) {
                return false;
            }
        }
        // jab koi bhi condition hit nahi hogi , matlab vaha kight rakh sakte hai
        return true;
    }
public static boolean isvalid(boolean[][] pos ,int r ,int c){
        if (r >= 0 && r < pos.length && c >= 0 && c < pos.length){
            return true;
        }
        return false;

    }
}






















