package questions;

import java.util.*;

               // not working learn subsets in recursion

public class CombinationSumII {
    public Map<Integer,Integer> map = new HashMap<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        for (int i = 0; i < candidates.length; i++) {
            map.put(candidates[i],i);
        }
        Arrays.sort(candidates);
        findCombinationII(candidates,new ArrayList<>(),target,0,0);
        return ans;
    }

    private void findCombinationII(int[] candidates, List<Integer> list, int target, int sum,int idx) {
        if (sum > target || idx > candidates.length){
            list.removeLast();
            return;
        }

        int val = candidates[idx];
        // means all next values are greater than the target
        if (val > target){
            return;
        }

        // for the current value
        if (map.containsKey(val - target)){
            ans.add(Arrays.asList(val,val - target));
        }

        // if the subtract is present in map
        int sub = target - sum;
        if (map.containsKey(sub) && map.get(sub) != idx){
            list.add(sub);
            ans.add(new ArrayList<>(list));
            list.removeLast();
        }
        list.add(val);

        findCombinationII(candidates,list,target,sum + val,idx+1);
//        list.removeLast();
    }

    public static void main(String[] args) {
        CombinationSumII c = new CombinationSumII();
        System.out.println(c.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
}
