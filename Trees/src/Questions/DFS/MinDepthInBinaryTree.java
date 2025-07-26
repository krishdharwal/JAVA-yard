package Questions.DFS;

import Questions.TreeNode;

class MinDepthInBinaryTree {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        findMin(root,1);
        return min;
    }

    public void findMin(TreeNode root,int h){
        if(min <= h) return;
        if(root == null) return;
        if(root.left == null && root.right == null){
            min = Math.min(h,min);
            return;
        }
        findMin(root.left,h+1);
        findMin(root.right,h+1);

    }
}