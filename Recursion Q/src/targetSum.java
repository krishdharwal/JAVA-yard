import java.util.Arrays;

public class targetSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int tar = 3;
        targetSsum(arr,tar,0);
    }

    private static void targetSsum(int[] arr, int tar, int i) {
        int[] temp = new int[arr.length];

        if (i == arr.length){
            System.out.println(Arrays.toString(temp));
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            temp[j] = -arr[i];
        }
        targetSsum(arr,tar,i+1);
    }
}
