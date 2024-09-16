import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] ans = mismatchNo(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mismatchNo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int chk = arr[i] - 1;
            if (i != chk) {
                return new int[]{i, i + 1};
            }
            i++;
        }
        return new int[]{arr[0],arr[1]};
    }
}
