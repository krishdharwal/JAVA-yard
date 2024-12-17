package learning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FInd_all_disapered {


    public static List<Integer> Cyclic_Sort(int[] nums){

        int i = 0;
        while (i < nums.length){
            int chk = nums[i] - 1;
            if (chk < nums.length && nums[i] == nums[chk]){
                i++;
            }
            else {
                swwap(nums,chk, i);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                list.add(j+1);
            }

        }
        return list;

    }

    private static void swwap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]  = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,1};
//        Cyclic_Sort(arr);
        System.out.println(Cyclic_Sort(arr));
    }
}
