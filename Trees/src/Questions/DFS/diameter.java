package Questions.DFS;

import Questions.TreeNode;

public class diameter {
    public int diameterOfBinaryTree(TreeNode root) {
         findMaxDiameter(root);
         return md;
    }

    int md = 0;
    private int findMaxDiameter(TreeNode node) {
        if (node == null){
            return 0;
        }
        int l = findMaxDiameter(node.left);
        int r = findMaxDiameter(node.right);
        md = Math.max(md,l+r);
        return Math.max(l,r)+1;
    }


}
