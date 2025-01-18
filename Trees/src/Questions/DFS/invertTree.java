package Questions.DFS;

import Questions.TreeNode;


// using POST order approach
public class invertTree {

    //POST order approach
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
