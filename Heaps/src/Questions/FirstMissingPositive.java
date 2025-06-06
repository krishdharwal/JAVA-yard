package Questions;

import java.util.PriorityQueue;

public class FirstMissingPositive {


    // My Solution -- [ 85ms ]
    public int firstMissingPositive(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int ele : nums){
            if(ele > 0) queue.offer(ele);
        }
        int curr = 1;
        while(!queue.isEmpty()){
            int e = queue.poll();
            if(curr < e){
                return curr;
            }
            if(e >= curr) curr++;
        }
        return curr;
    }
}
