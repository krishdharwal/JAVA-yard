package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(0,i);

        }

        System.out.println(list);
    }


    // doing this question in linear way

    public Node connect2(Node root) {
        if (root == null){
            return root;
        }

        Node leftMost = root;
        while(leftMost != null){
            Node curr = leftMost;
            while (curr != null){
                curr.left.next = curr.right;
                if (curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    }
