package questions;

import java.util.ArrayList;
import java.util.List;

public class combinationSum1 {

    List<List<Integer>> gList = new ArrayList<>();
    int totalSum = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findCombinationSum(candidates,target,new ArrayList<Integer>());
        return gList;
    }

    private void findCombinationSum(int[] arr, int tar, List<Integer> list) {
        if (totalSum == tar){
            List<Integer> temp = new ArrayList<>(list);
            temp.sort(Integer::compareTo);
            if (!gList.contains(temp)) {
                gList.add(new ArrayList<>(temp));
            }
            return;
        }

        if (totalSum > tar){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (totalSum + arr[i] <= tar){
                list.add(arr[i]);
                totalSum += arr[i];
                findCombinationSum(arr,tar,list);
                int rmv = list.remove(list.size()-1);
                totalSum -= rmv;
            }

        }


    }

    public static void main(String[] args) {
        combinationSum1 c = new combinationSum1();
        System.out.println(c.combinationSum(new int[]{7,3,2},18));
    }

}
