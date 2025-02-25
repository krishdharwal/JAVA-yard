package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommbinationSumII {

    List<List<Integer>> glist = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        findCombinationII(candidates,target,new ArrayList<>(),0);
        return glist;
    }

    private void findCombinationII(int[] arr, int tar, List<Integer> list,int idx) {
        if(tar == 0){
            glist.add(new ArrayList<>(list));
            return;
        }

        if ( tar < 0 || idx >= arr.length){
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            if (i > idx && arr[i] == arr[i-1]){
                continue;
            }

            if (arr[i] > tar){
                break;
            }

                list.add(arr[i]);
                findCombinationII(arr,tar - arr[i],list,i+1);
                list.remove(list.size()-1);

        }

    }

    public static void main(String[] args) {
        CommbinationSumII c2 = new CommbinationSumII();
        System.out.println(c2.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }

}

