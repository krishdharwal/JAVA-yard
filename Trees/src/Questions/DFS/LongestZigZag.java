package Questions.DFS;

import Questions.TreeNode;

import java.util.Queue;
import java.util.Stack;

public class LongestZigZag {
    int gSum = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }
        caller(root.left, 1, true);
        caller(root.right, 1, false);
        return gSum;
    }

    // left - false, right - true
    public void caller(TreeNode node, int sum, boolean way) {
        if (node == null) {
            return;
        }
        gSum = Math.max(gSum, sum);
        caller(node.left, (!way) ? sum + 1 : 1, true);
        caller(node.right, (way) ? sum + 1 : 1, false);
    }


}