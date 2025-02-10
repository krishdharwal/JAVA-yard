package Questions;

public class chessBoard {
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        // odd = odd block black ,, false
        // even = even block black true
        int r1  = coordinate1.charAt(0) - 'a' + 1;
        int c1 = coordinate1.charAt(1) - '0';

        int r2 = coordinate2.charAt(0) - 'a' + 1;
        int c2 = coordinate2.charAt(1) - '0';


        if(find(r1,c1) == find(r2,c2)){
            return true;
        }

        return false;
    }

    public static boolean find(int r,int c){
        r = (r == 0 || r == 1) ? r + 2 : r;
        c = (c == 0 || c == 1) ? c + 2 : c;

        if(r % 2 == 0 && c % 2 == 0){
            return true;
        }
        return r % 3 == 0 && c % 3 == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkTwoChessboards("g1","e6"));
    }
}
