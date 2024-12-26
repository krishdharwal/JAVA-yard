package Questions;

import java.util.*;

public class SlidingWindowMaximumOptimized {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] arr = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();

        int j  = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.getLast()] < nums[i]) {
                queue.removeLast();
            }
            queue.offer(i);

            if ( !queue.isEmpty() && queue.getFirst() + k == i) {
                queue.removeFirst();
            }

            if (!queue.isEmpty() && i >= k - 1){
               arr[j++] = nums[queue.getFirst()];
            }
        }
        return arr;


    }

    public static void main(String[] args) {
        SlidingWindowMaximumOptimized solution = new SlidingWindowMaximumOptimized();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums, k)));
    }
}
