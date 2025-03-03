package Questions.DFS;

import Questions.Node;


public class PathSum3 {

    int count = 0;
    int originalTar;
    public int pathSum(Node root, int targetSum) {
        originalTar = targetSum;
        findPathSumIII(root,targetSum);
        return count;
    }

    public void findPathSumIII(Node node, int tar){
        if(tar == 0){
            count += 1;
            return;
        }

        if(node == null){
            return;
        }

        int val = node.val;

        if (val < 0){
            tar += Math.abs(val);
        }
        else if(val > tar){
            tar = originalTar;
        }
        else {
            tar -= node.val;
        }


        findPathSumIII(node.left,tar);
        findPathSumIII(node.right,tar);
    }

}
