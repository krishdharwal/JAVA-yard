package questions.learning;

import java.util.ArrayList;
import java.util.List;

public class CombinataionSumIII {

    List<List<Integer>> gLit = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        findCombinationSum3(new ArrayList<>(),k, n,1);
        return gLit;
    }

    private void findCombinationSum3(List<Integer> list,int size, int tar, int start) {
        if (tar == 0 && list.size() == size){
            gLit.add(new ArrayList<>(list));
            return;
        }

        if (tar < 0){
            return;
        }

        if (list.size() == size && tar > 0){
            return;
        }

        for (int i = start; i < 10; i++) {
            if (i > tar){
                break;
            }
            if (!list.contains(i)) {
                list.add(i);
                findCombinationSum3(list, size, tar - i, i + 1);
                list.remove(list.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        CombinataionSumIII c3 = new CombinataionSumIII();
        System.out.println(c3.combinationSum3(3,9));
    }


}
