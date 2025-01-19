package Questions.BFS;

import Questions.Node;

import java.util.*;

public class RightSIdeView {
    public List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // list.add(root.val);

        while(!queue.isEmpty()){

            Node last = queue.peek();
            int level = queue.size();

            for(int i=0; i<level; i++){
                Node temp = queue.poll();
                last = temp;
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);

            }

            list.add(last.data);


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
