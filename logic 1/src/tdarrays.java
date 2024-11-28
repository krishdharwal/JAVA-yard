import java.util.Arrays;
import java.util.Scanner;

public class tdarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr= new int[3][3];
        int i,j;
        System.out.println("enter the elements");
        for ( i = 0; i < arr.length; i++) {
            for ( j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("the 2d array is = ");

//        System.out.println(Arrays.toString(arr));



//        for ( i = 0; i < arr.length; i++) {
//            for ( j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j] );
//            }
//            System.out.println(" ");
//        }
    }
}
