package Questions.BFS;

import Questions.TreeNode;

public class MaximumLevelSum {
    public int lvl = 1;
    public int max = Integer.MIN_VALUE;

    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        return findMax(root,1);
    }

    public int findMax(TreeNode node,int currentLvl){
        if(node == null){
            return lvl;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i=0; i<size; i++){
                TreeNode temp = queue.poll();
                sum += temp.val;
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            if(sum > max){
                max = sum;
                lvl = currentLvl;
            }

            currentLvl++;
        }


        return lvl;


    }
}
