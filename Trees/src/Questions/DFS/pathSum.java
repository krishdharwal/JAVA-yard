package Questions.DFS;

import Questions.TreeNode;

public class pathSum {
    public int gsum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode node) {
        maxPathSum2(node);
        return gsum;
    }

    public int maxPathSum2(TreeNode node) {
        if(node == null){
            return 0;
        }

        int left = maxPathSum2(node.left);
        int right = maxPathSum2(node.right);

        left = Math.max(left,0);
        right = Math.max(right,0);

        int NodeSum = node.val + left + right;
        int lrSum = node.val + Math.max(left,right);

        gsum = Math.max(gsum,NodeSum);

        return lrSum;
    }
}


