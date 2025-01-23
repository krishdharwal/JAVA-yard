package Questions.DFS;

import Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = getLeafList(root1,new ArrayList<>());
        List<Integer> l2 = getLeafList(root2,new ArrayList<>());
        return l1.equals(l2);
    }

    public List<Integer> getLeafList(TreeNode node,List<Integer> list){
        if(node == null){
            return list;
        }

        if(node.left == null && node.right == null){
            list.add(node.val);
            return list;
        }

        getLeafList(node.left,list);
        getLeafList(node.right,list);

        return list;
    }
}
