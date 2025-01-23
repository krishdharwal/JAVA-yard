package Questions.DFS;

import Questions.TreeNode;

public class goodNodes {
    public int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return count;
        }
        good(root,root.val);
        return count;
    }

    public void good(TreeNode node, int maxInPath){
        if(node == null){
            return;
        }

        maxInPath = Math.max(node.val,maxInPath);
        if(node.val >= maxInPath){
            count++;
        }

        good(node.left,maxInPath);
        good(node.right,maxInPath);

    }
}
