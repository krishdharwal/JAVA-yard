package Questions;

import java.util.PriorityQueue;

class SmallestInfiniteSet {
    PriorityQueue<Integer> queue;
    int curr;
    public SmallestInfiniteSet() {
        queue = new PriorityQueue<>();
        curr = 1;
    }

    public int popSmallest() {
        if (!queue.isEmpty()){
            return queue.poll();
        }
        return curr++;
    }

    public void addBack(int num) {
        if (num < curr || queue.contains(num)){
            return;
        }
        queue.add(num);
    }

}