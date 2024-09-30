package Questions;

import java.util.Arrays;

public class find_total_smaller_number_than_current {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = BinarySearchHelper(temp,nums[i]);
        }
        return nums;
    }

    private static int BinarySearchHelper(int[] arr, int target) {
        int s = 0,e = arr.length;
        while (s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] == target){
                while (m >= 1 && arr[m] == arr[m-1] ){
                    m--;
                }


                return m;
            }
            else if (arr[m] > target){
                e = m - 1;
            }
            else {
                s = m + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
