package Questions.DFS;

import Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    List<List<Integer>> globalList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        findPathSumII(root,targetSum,new ArrayList<>());
        return globalList;
    }

    private void findPathSumII(TreeNode node, int tar, List<Integer>  list) {
        if (node == null){
            return;
        }

        if (node.left == null && node.right == null && tar == 0){
            globalList.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }

        if (tar < 0){
            return;
        }

        int currVal = node.val;
        list.add(currVal);
        tar -= currVal;

        findPathSumII(node.left,tar,list);
        findPathSumII(node.right,tar,list);
    }
}
