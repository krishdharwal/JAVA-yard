package Searching;

import java.util.Arrays;

public class Two_Sum_II {

    public static int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;

        while (s < e){
            if (numbers[s] + numbers[e] == target) {
                return new int[]{s+1,e+1};
            } else if (numbers[s] + numbers[e] > target) {
                e--;
            }else{
                s++;
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] a = {-3,3,4,90};
        System.out.println(Arrays.toString(twoSum(a,0)));
    }
}
