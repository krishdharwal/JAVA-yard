package Questions;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumbers(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        for (int c = 0; c < arr[0].length; c++) {

            int max = 0;
            int idx = 0;

            for (int r = 0; r < arr.length; r++) {
                if (arr[r][c] > max) {
                    max = arr[r][c];
                    idx = r;
                }
            }

            int count = 0;
            for (int i = 0; i < arr[0].length; i++) {
                if (arr[idx][i] < max) {
                    count++;
                }
            }
            if (count == 0) {
                list.add(max);
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {7},
                {10},
                {12},
                {3}
//                {15,16,17,12}
        };

        LuckyNumber luckyNumber = new LuckyNumber();
        System.out.println(luckyNumber.luckyNumbers(matrix));
    }
}
