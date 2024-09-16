//public class WordSearch {
//    public static void main(String[] args) {
//        String[][] board = {
//                {"A","B","C","E"},
//                {"S","F","C","S"},
//                {"A","D","E","E"}
//        };
//        String up = "ABCCE";
////       boolean ans = isMatch(board,0,0,up);
//        boolean ans = isMatch1(board,up);
//
//        System.out.println(ans);
//    }
//
//    private static boolean isMatch1(String[][] board, String up) {
//        char[] arr = up.toCharArray();
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if (board[i][j] == arr[0] && )
//            }
//
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    ///////////////////////////////////////////////////////////////////////////////////
//    private static boolean isMatch(String[][] board, int r ,int c,String up) {
//
//        if (up.length() == 0){
//            return true;
//        }
//
//
//
//        if (board[r][c].equals(up.charAt(0))){
//            return isMatch(board,r,c,up.substring(1));
//            }
//
//        //checking part
//        // down
//        if(r < board.length){
//            if (board[r+1][c].equals(up.charAt(0))){
//                return isMatch(board,r+1,c,up.substring(1));
//            }
//        }
//        // right
//        if(c < board[0].length){
//            if (board[r][c+1].equals(up.charAt(0))){
//                return isMatch(board,r,c+1,up.substring(1));
//            }
//        }
//
//        //left
//        if(c > 0){
//            if (board[r][c-1].equals(up.charAt(0))){
//                return isMatch(board,r,c-1,up.substring(1));
//            }
//        }
//
//        //up
//        if(r > 0){
//            if (board[r-1][c].equals(up.charAt(0))){
//                return isMatch(board,r-1,c,up.substring(1));
//            }
//        }
//
//        return false;
//    }
//
//}
