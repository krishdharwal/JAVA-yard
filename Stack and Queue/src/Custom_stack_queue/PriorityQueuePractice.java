package Custom_stack_queue;

import java.util.*;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(2);
        q.add(33);
        q.offer(3);
        q.remove();
//        q.offer(9);
//        q.offer(-1);
////        q.stream().findAny();
////        int k =   q.();
////        System.out.println(k);
//        ArrayList<Integer> l = new ArrayList<>();
////        int k  = l.get(1);
//        l.add(2);
//        l.add(223);
//        l.add(1);
//
//        Queue<Integer> queue = new PriorityQueue<>(l);
//                int k  = queue.element();
//
//        System.out.println(k);
//
//        System.out.println(q);

        System.out.println(findKthLargest(new int[]{6,5,4,3,2,1}, 2));
    }

    public static int findKthLargest(int[] nums, int k){
    Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
        queue.offer(nums[i]);
    }

    List<Integer> list = new ArrayList<>();

       while (!queue.isEmpty()){
        list.add(queue.poll());
    }
        return  list.get(list.size() - k );
}


}
