import java.util.Arrays;

public class parityII {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6,7};
        int[] ans  = sortByParity2(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortByParity2(int[] arr) {
        if (arr.length <= 1) return new int[]{arr[0]};

        int[] temp = new int[arr.length];
        int s = 0;
        int e = 1;
        for (int k : arr){
            if (k % 2 == 0) {
                temp[s] = k;
                s += 2;
            }
            else {
                temp[e] = k;
            e += 2;
        }
        }

        return temp;
    }
}
