package Questions;

import java.util.*;

public class KClosestPointToOrign {

    public static void main(String[] args) {
        int[][] arr = {
                {-2,2},
                {1,3}
        };
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{0,1},{1,0}},2)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        int[][] arr = new int[k][2];
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int idx = 0;

        for(int[] array: points){
            int sqrt = 0;
            for (int ele : array){
                sqrt += ele * ele;
            }
            queue.offer(sqrt);
            if(!map.isEmpty() && map.containsKey(sqrt)){
                map.put(sqrt+1, idx);
            }else {
                map.put(sqrt, idx);
            }
            idx++;
        }
//        System.out.println(queue + "\n" + map);
        int m = 0;
        while (k > 0 && !queue.isEmpty()){
            int findElement = queue.poll();
            arr[m]  = points[map.get(findElement)];
            map.remove(findElement);
            k--;
            m++;
        }

        return arr;

    }

}
