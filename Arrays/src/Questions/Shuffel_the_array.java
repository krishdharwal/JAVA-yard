package Questions;

import java.util.Arrays;

public class Shuffel_the_array {
    public static  int[] shuffle(int[] nums, int n) {

        int i = 0;
        int j = n ;
        int[] temp  = new int[nums.length];
        int k = 0;
while (i < n ){
    temp[k++] = nums[i++];
    temp[k++] = nums[j++];
        }
return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
}
