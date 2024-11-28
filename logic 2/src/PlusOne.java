import java.util.Arrays;
import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {8};
        int[] ans = dopluseO(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] dopluseO(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length +1];
        arr[0] = 1;
        return arr;
    }
}
