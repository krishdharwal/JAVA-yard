package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSumIV {

    public int combinations = 0;
    public int combinationSumIV(int[] arr, int tar){
        Arrays.sort(arr);
        findCombinations(arr,new ArrayList<>(),tar);
        return combinations;
    }

    private void findCombinations(int[] arr, List<Integer> list, int target) {
        if (target == 0){
            combinations += 1;
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target){
                break;
            }
            list.add(arr[i]);
            findCombinations(arr,list,target - arr[i]);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        CombinationSumIV c4 = new CombinationSumIV();
        int ans = c4.combinationSumIV(new int[]{1,2,3},4);
        System.out.println(ans);
    }
}
