package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffIn2ArraY {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2)  {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) set1.add(i);
        for (int i : nums2) set2.add(i);

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        // 1
        for (int i : set1) {
            if (!set2.contains(i)){
                list.get(0).add(i);
            }
        }

        // 2
        for (int i : set2) {
            if (!set1.contains(i)){
                list.get(1).add(i);
            }
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(list);
        return list;

    }

    public static void main(String[] args) {
        DiffIn2ArraY d = new DiffIn2ArraY();
        System.out.println(d.findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }

}
