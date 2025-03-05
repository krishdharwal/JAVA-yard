package Questions.DFS;

import Questions.TreeNode;

public class PathSumI {
    public boolean hasPathSum(TreeNode node, int tar) {
        return hasPathSumHelper(node,tar,0);
    }

    public boolean hasPathSumHelper(TreeNode node, int tar, int sum) {
        if(node == null){
            return false;
        }

        if(node.left == null && node.right == null && tar == sum + node.val){
            return true;
        }

        return hasPathSumHelper(node.left,tar,sum + node.val) || hasPathSumHelper(node.right,tar,sum + node.val);

    }
}
