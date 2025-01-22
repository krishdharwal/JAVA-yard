package Questions;

import java.util.Arrays;

public class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }

    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = -3000;
        arr[1] = -2000;

        System.out.println(Arrays.toString(arr));

    }
    }