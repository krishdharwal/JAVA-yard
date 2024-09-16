import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,2,10};
        int[] ans = square(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] square(int[] arr) {
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 0 ) arr[i] = -arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) swapp(arr,j,j-1);

            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    private static void swapp(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }

}

