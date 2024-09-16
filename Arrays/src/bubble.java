import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {

        int[] arr = {1,5,3,2,4};
        boblee(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void boblee(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {

            if (arr[j] < arr[j-1]){
                swap(arr,j-1,j);
            }

            }
        }
    }


    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
