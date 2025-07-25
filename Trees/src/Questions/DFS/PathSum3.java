package Questions.DFS;

import Questions.TreeNode;
//
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


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

    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(23);
        ll.add(33);
        System.out.println(ll);

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();



    }

}
