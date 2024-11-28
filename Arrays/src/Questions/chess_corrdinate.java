package Questions;

public class chess_corrdinate {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if (coordinate1.charAt(0) == coordinate2.charAt(0)){
            int c1 = coordinate1.charAt(1) - '0';
            int c2 = coordinate2.charAt(1) - '0';

            if (c1 == c2){
                return true;
            }
            else {
                return false;
            }

        }

        int c1 = coordinate1.charAt(0) - '1';
        int c2 = coordinate2.charAt(0) - '1' ;

        if (c1 % 2 == 0 && c2 % 2 == 0){
            return true;
        }
        if (c1 % 2 != 0 && c2 % 2 != 0) {
            return true;
        }
            return false;

            }

    public static void main(String[] args) {
        String s = "1";
         int num = s.charAt(0) - '0' ;
        System.out.println(num);
    }
}
