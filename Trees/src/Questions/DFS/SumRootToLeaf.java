package Questions.DFS;

import Questions.TreeNode;

public class SumRootToLeaf {

    int wholeSum = 0;
    public int sumNumbers(TreeNode root) {
        findSum(root,0);
        return wholeSum;
    }

    private void findSum(TreeNode node, int currentSum) {
        if (node == null){
            wholeSum += currentSum;
            return;
        }

        findSum(node.left,currentSum * 10 + node.val);
        findSum(node.right,currentSum * 10 + node.val);
    }

}