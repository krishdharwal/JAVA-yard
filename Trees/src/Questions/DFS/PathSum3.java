package Questions.DFS;

import Questions.Node;


public class PathSum3 {

    public int pathSum(Node root, int targetSum) {
        if (root == null){
            return 0;
        }
        return  findPathSumIII(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }

    public int findPathSumIII(Node node, int tar){
        if (node == null){
            return 0;
        }
        if (tar - node.val == 0){
            return 1;
        }

       return findPathSumIII(node.left,tar - node.val) + findPathSumIII(node.right,tar - node.val);
    }

}
