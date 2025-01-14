package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSIdeView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // list.add(root.val);

        while(!queue.isEmpty()){

            TreeNode last = queue.peek();
            int level = queue.size();

            for(int i=0; i<level; i++){
                TreeNode temp = queue.poll();
                last = temp;
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);

            }

            list.add(last.val);


        }
        return list;
    }
}
