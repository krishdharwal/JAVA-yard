package concepts.subsets_and_Permutaton;


import java.util.ArrayList;
import java.util.List;

// return all possible answers or combinations to form that face
public class DiceNumberCombination {
        public List<List<Integer>>  totalDiceFaceCombination(int face){
            findDiceCombinations(0,face,new ArrayList<>());
            return glist;
        }

    List<List<Integer>> glist = new ArrayList<>();
    private List<Integer> findDiceCombinations(int p, int up,List<Integer> list) {
        if (up == 0){
            glist.add(new ArrayList<>(list));
            return list;
        }
        for (int i = 1; i <= up; i++) {
            list.add(i);
            findDiceCombinations(i,up - i,list);
            list.removeLast();
        }

        return list;
    }


    public static void main(String[] args) {
        DiceNumberCombination d = new DiceNumberCombination();
        System.out.println(d.totalDiceFaceCombination(4));
    }
}
