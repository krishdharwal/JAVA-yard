package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequentElements {


    // Max Heap (priority queue)

    public static int[] topKFrequent1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build frequency map
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Use a max-heap (priority queue) sorted by frequency descending
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        // Build result
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }


    // MY solution - 53ms--
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int[] ans = new int[k];
        int i = 0;

        while (i < k){
            ans[i++] = getMaxVal(map);
        }

        return ans;
    }

    private static int getMaxVal(HashMap<Integer, Integer> map) {
        int maxVal = 0;
        int maxKey = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (maxVal < entry.getValue()) {
               maxVal = entry.getValue();
               maxKey = entry.getKey();
           }
        }
        map.remove(maxKey);
        return maxKey;
    }


    public static void main(String[] args) {
       int[] ams =  topKFrequent(new int[]{1,1,1,2,2,3},2);
        System.out.println(Arrays.toString(ams));
    }
}
