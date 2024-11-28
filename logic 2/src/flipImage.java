import java.util.Arrays;

public class flipImage {
    public static void main(String[] args) {
        int[][] arr =  {{1,1,0},{1,0,1},{0,0,0}};
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[i][arr.length - 1 -j ] ^ 1;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }

}
