package Questions.DFS;

import Questions.TreeNode;

public class SumAllRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }

    public int sum(TreeNode node,int sum) {
        if (node == null) {
            return 0;
        }
        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }

        int l = sum(node.left, sum);
        int r = sum(node.right, sum);

        return l + r;
    }
    }
