/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
package Questions;
class depth {
    int h = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return h;
        }
        findDepth(root,0);
        return h;
    }

    public void findDepth(TreeNode node,int ch){
        if(node == null){
            h = Math.max(h,ch);
            return;
        }
        findDepth(node.left,ch+1);
        findDepth(node.right,ch+1);
    }
}
