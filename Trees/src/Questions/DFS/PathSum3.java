package Questions.DFS;

import Questions.Node;
import Questions.TreeNode;


public class PathSum3 {

    /* plan ->
    firstly traverse through every node
    treat every node as a root and call count function from every node
    and just count as you usually does in a tree
     */

    public int pathSum(TreeNode root, int targetSum) {
        // traverse
        if (root == null){
            return 0;
        }
        return pathSum(root.left,targetSum) + pathSum(root.right,targetSum) + findSum(root,targetSum,(long) 0);
    }

    private int findSum(TreeNode node, int tar,long sum) {
        if (node == null){
            return 0;
        }
        int count = 0;
        sum += node.val;
        if (sum == tar){
            count++;
        }
        count += findSum(node.left,tar,sum) + findSum(node.right,tar,sum);
        return count;
    }

}
