package Questions.BFS;

import Questions.TreeNode;

import java.util.*;

public class RightSIdeView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int n = 0;
        while(!queue.isEmpty()){
            n = queue.size();
            for(int i = 1; i <= n; i++){
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                if(i == n) list.add(node.val);
            }

        }
        return list;
    }
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(11);

       int s =  deque.getFirst();
       int e = deque.getLast();
//       deque./\

        List<Integer> list = new ArrayList<>();;

        System.out.println(s + " " + e);
    }
}
