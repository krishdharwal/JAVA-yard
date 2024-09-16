import java.util.Arrays;
public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,41,14,67,13,9,8,7};
        int target = 11;
        int[] ans = twopointer(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] twopointer(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while (i <= j){
            if (arr[i] + arr[j] == target){
                return new int[]{i,j};
            }

            if (arr[i] + arr[j] > target){
                j--;
            }
            if (arr[i] + arr[j] < target){
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
