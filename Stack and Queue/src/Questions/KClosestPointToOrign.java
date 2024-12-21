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
            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->
                    Integer.compare(a[0], b[0]));

            for (int i = 0; i < points.length; i++) {
                int x = points[i][0];
                int y = points[i][1];
                int dist = x * x + y * y;
                queue.offer(new int[]{dist, i});
            }

            int[][] result = new int[k][2];
            for (int i = 0; i < k; i++) {
                int[] closest = queue.poll();
                result[i] = points[closest[1]];
            }

            return result;
        }


    // failed for this test case cause i am using square root
//     System.out.println(Arrays.deepToString(kClosest(new int[][]{{0,1},{1,0}},2)));
    public static int[][] kClosest2(int[][] points, int k) {
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
            map.put(sqrt, idx);
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
