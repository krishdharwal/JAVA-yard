import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,3,2,1,2};
    int ans = mojor(arr);
        System.out.println(ans);

     }

    private static int mojor(int[] arr) {
        if (arr.length <= 1){
            return arr[0];
        }
        int m = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) swapp(arr,j,j-1);
                m = arr.length / 2;
                m = arr[m];
            }

        }
        return m;

    }
    private static void swapp(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}

