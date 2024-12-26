package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

import java.util.Queue;

public class ReorderDeckOfCards {

    public  static int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        Queue<Integer> queue = new LinkedList<>();
        // added index in queue
        for (int i = 0; i < deck.length; i++) {
            queue.offer(i);
        }
        Arrays.sort(deck);
        int i = 0;
        while (i < deck.length && !queue.isEmpty()){
            ans[queue.poll()] = deck[i++];
            int nextValInQueue = 0;
            if (!queue.isEmpty())  {
                nextValInQueue = queue.poll();
            }
            queue.offer(nextValInQueue);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[]{1,1000})));
    }
}
