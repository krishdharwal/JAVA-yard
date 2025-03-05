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

    private void findPathSumII(TreeNode node, int tar, List<Integer> list){
        if (node == null ){
            return;
        }

        list.add(node.val);
        if(node.left == null && node.right == null && tar - node.val == 0){
            globalList.add(new ArrayList<>(list));
        }
        else{
            findPathSumII(node.left,tar - node.val,list);
            findPathSumII(node.right,tar - node.val,list);
        }
        list.remove(list.size()-1);

    }
}
