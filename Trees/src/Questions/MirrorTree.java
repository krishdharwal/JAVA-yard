package Questions;

import java.util.Queue;
import java.util.LinkedList;


public class MirrorTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            // checks
            if (left == null && right == null){
                continue;
            }

            if (left == null || right == null){
                return false;
            }

            if(left.val != right.val){
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }



    // recursion ans
    public boolean isSymmetric2(TreeNode root) {
        if(root == null)
            return false;

        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;

        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

}
