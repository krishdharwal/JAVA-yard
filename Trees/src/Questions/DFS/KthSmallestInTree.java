package Questions.DFS;

import Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestInTree {



        public List<Integer> list = new ArrayList<>();

        public int kthSmallest(TreeNode node, int k) {
            if(node == null){
                return 0;
            }

            if(list.size() == k){
                return list.get(k-1);
            }

            kthSmallest(node.left,k);
            list.add(node.val);
            kthSmallest(node.right,k);

            return ((list.size()>=k) ? list.get(k-1) : list.getLast());

        }


}
