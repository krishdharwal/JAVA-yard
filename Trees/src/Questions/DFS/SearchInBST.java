package Questions.DFS;

import Questions.TreeNode;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }

        if(root.val == val){
            return root;
        }
        TreeNode temp = searchBST(root.left,val);
        if(temp != null) return temp;
        return searchBST(root.right,val);
    }
}
