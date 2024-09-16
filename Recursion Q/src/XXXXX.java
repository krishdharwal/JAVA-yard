import java.util.Arrays;

public class XXXXX {
    public static void main(String[] args) {

//        String[][] board = {
//                {"A","B","C","E"},
//                {"S","F","C","S"},
//                {"A","D","E","E"}
//        };
//        String c = "asa";
//        String x = "ASA";
//        String s = board[0][0];
//        if (x.equals(s)){
//            System.out.println("defuhs");
//        }
//        System.out.println(c == x);
//

        int[][] arr = {
                {1,2,3},
                {6,5,4},
                {9,8,7}
        };
        int[] target = {1,2,5,8,9};
//        for (int i = 0; i < arr.length; i++) {
//
//        }
        target[0] = -target[0];
        System.out.println(Arrays.toString(target));

        String s = "aa" + 22;
        System.out.println(s);
    }
}
