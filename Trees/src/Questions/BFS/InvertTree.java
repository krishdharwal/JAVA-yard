package Questions.BFS;

import Questions.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


// using Level order traversal
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode node = queue.poll();

                // swap left and right
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }

        return root;
    }
}
