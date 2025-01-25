package questions;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> globalList = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        findCombinations(candidates,new ArrayList<>(),target,0,0);
        return globalList;

    }

    private void findCombinations(int[] candidates, List<Integer> list,int target, int currentIndex, int sum) {
        if (sum > target || currentIndex >= candidates.length){
            return;
        }

        if (sum == target){
            globalList.add(new ArrayList<>(list));
            return;
        }

       int idxVal = candidates[currentIndex];

        list.add(idxVal);
        findCombinations(candidates,list,target,currentIndex,sum+idxVal);
        list.removeLast();
        findCombinations(candidates,list,target,currentIndex+1,sum);

    }


    public static void main(String[] args) {
        CombinationSum c = new CombinationSum();
        System.out.println(c.combinationSum(new int[]{2,3,6,7},7));
    }

}
