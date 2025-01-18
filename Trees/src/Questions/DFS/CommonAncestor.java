package Questions.DFS;

import Questions.TreeNode;

public class CommonAncestor {
    public TreeNode pPossibleAnswer;
    public TreeNode qPossibleAnswer;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        pPossibleAnswer = p;
        qPossibleAnswer = q;
        return find(root,p,q);
    }

    public TreeNode find(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return node;

        find(node.left,p,q);
        find(node.right,p,q);

        if(pPossibleAnswer == qPossibleAnswer) return qPossibleAnswer;

        if(node.left == pPossibleAnswer || node.right == pPossibleAnswer)  pPossibleAnswer = node;
        if(node.left == qPossibleAnswer || node.right == qPossibleAnswer)  qPossibleAnswer = node;


        return node;
    }

        public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) return root;

            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);

            if(left == null) return right;
            else if(right == null) return left;
            else return root;
    }
}
