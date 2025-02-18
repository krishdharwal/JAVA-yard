import java.lang.reflect.Array;
import java.util.Arrays;

public class exercise2 {




    // Euclid's algo
    static int findCommonDivisor(int i,int j){
        if (i == j){
            return i;
        }
        int g = Math.max(i,j);
        int l = Math.min(i,j);
        return findCommonDivisor(g - l,l);
    }

    public static boolean chkForQueenExistance(boolean[][] board, int r, int c) {
        // check i the path is there any queen is already exist or not
        if (board[r][c]){
            return true;
        }

        // check down line
        if (r < board.length-1){
            return chkForQueenExistance(board,r+1,c);
        }

        // check right line
        if (c < board[0].length-1){
            return chkForQueenExistance(board,r,c+1);
        }

        // now diagonally bottom left
        if (r < board.length-1 && c > 0){
            return chkForQueenExistance(board,r+1,c-1);
        }

        // diagonally bottom right
        if (r < board.length-1 && c < board[0].length-1){
            return chkForQueenExistance(board,r+1,c+1);
        }

        // diagonally up left
        if (r > 0 && c > 0){
            return chkForQueenExistance(board,r-1,c-1);
        }

        // diagonally up right
        if (r > 0 && c < board[0].length-1){
            return chkForQueenExistance(board,r-1,c+1);
        }
        return false;
    }

    public static void main(String[] args) {
//        String s1 = "ABCABC";
//        String s2 = "ABCABCABC";
//
//        int a =(int) Math.sqrt(s1.length());
//        int b =(int) Math.sqrt(s2.length());
//
//        String k = "abcbab";
//         k = k.replaceAll("a","");
//        System.out.println(k);
//        int  d = 123124;
//        int ans = Integer.toString(d).length();
//        System.out.println(ans);
//
//        int currentDigit = '2' - '0';
//        char ch = (char)'a' + 0;
//        System.out.println (ch);
//        boolean b = false;
//        b = !b;
////        System.out.println(b);
//
//        int n = 4;
//        boolean[][] board = {
//                {false,false,false},
//                {false,false,false},
//                {false,false,true},
//                {false,false,false}
//        };
//        System.out.println(Arrays.deepToString(board));
//        System.out.println(chkForQueenExistance(board,0,0));
//        System.out.println(findValidPair("9212"));

        int i = 9;
        char ch = (char) (i + '0');
        System.out.println(ch);
    }

    public static String findValidPair(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length()-1; i++) {
            char fir = s.charAt(i);
            char sec = s.charAt(i+1);

            if (fir == sec){
                continue;
            }

            int fCount = countIt(s,fir,i);

            if (fCount == fir - '0'){
                ans.append(fir);
            }
        }

        return ans.toString();
    }

    private static int countIt(String s, char ch,int i) {
        int count = 0;
        for (int j = i; j < s.length(); j++) {
            if (ch == s.charAt(j)){
                count++;
            }
        }
        return count;
    }

    void checkForStartingPointIn3X3Grid(){
        int r = 8 - 8 % 3;
        int c = 2 - 2 % 3;
        boolean[][] arr = new boolean[9][9];
        for (int i = r; i <= r + 2; i++) {
            for (int j = c; j <= c + 2 ; j++) {
                arr[i][j] = true;
            }
        }

        for (boolean[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
