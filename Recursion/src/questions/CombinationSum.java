package questions;

import java.util.*;

//combination sum , and i can use duplicates

public class CombinationSum {

    public List<List<Integer>> gList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        findCombinations(candidates,new ArrayList<>(),target, 0);
        return gList;
    }

    private void findCombinations(int[] arr, List<Integer> list,int target, int idx) {
        if (target == 0){
            gList.add(new ArrayList<>(list));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] > target){
                break;
            }
            list.add(arr[i]);
            findCombinations(arr,list,target - arr[i],i);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        CombinationSum c = new CombinationSum();
        System.out.println(c.combinationSum(new int[]{2,3,6,7},7));
    }

}
