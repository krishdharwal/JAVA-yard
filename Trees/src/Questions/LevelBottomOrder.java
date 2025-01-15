package Questions;

import java.util.*;


public class LevelBottomOrder {

    // big brain moment
    // just traverse in normal level order but reverse the ans list of list at last
    public List<List<Integer>> levelOrderBottom(Custom_Tree root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Custom_Tree> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<level; i++){
                Custom_Tree temp = queue.poll();
                list.add(temp.val);

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);

            }

            ans.add(list);

        }
        Collections.reverse(ans);
        return ans;
    }

    }
