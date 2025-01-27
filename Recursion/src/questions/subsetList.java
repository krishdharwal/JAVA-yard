package questions.concepts;

import java.util.ArrayList;
import java.util.List;


public class subsetList {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(ssubset(arr));
    }

    private static List<List<Integer>> ssubset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
