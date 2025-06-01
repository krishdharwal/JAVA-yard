package Questions;

import java.util.PriorityQueue;

class TotalCostToHireKWorkers {

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();

        int i = 0,j = costs.length-1;
        long sum = 0;
        while(k-- > 0){
            while(left.size() < candidates && i <= j){
                left.offer(costs[i++]);
            }
            while(right.size() < candidates && i <= j){
                right.offer(costs[j--]);
            }
            int leftMin  = (!left.isEmpty())  ? left.peek() : Integer.MAX_VALUE;
            int rightMin = (!right.isEmpty()) ? right.peek(): Integer.MAX_VALUE;

            if(leftMin <= rightMin){
                sum += left.poll();
            }else{
                sum += right.poll();
            }
        }
        return sum;
    }

}