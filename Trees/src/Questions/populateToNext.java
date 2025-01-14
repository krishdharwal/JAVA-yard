package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class populateToNext {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();

            Node np = queue.peek();
            for(int i=0; i<level; i++){

                Node temp = queue.poll();

                if(!queue.isEmpty()) temp.next = queue.peek();

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);

                np = temp;
            }

            np.next = null;

        }

        return root;

    }
}
