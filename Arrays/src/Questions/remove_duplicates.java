package Questions;

import java.util.Arrays;

public class remove_duplicates {

    public static int countDulicates(int[] nums) {
        int i = 0;
        int count = 0;
        while (i < nums.length-1){
            if (nums[i] == nums[i+1]){
                i++;
            }
            else {
                i++;
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
       removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(i+1);
    }
}
