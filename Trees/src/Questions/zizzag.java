//package Questions;
//
//public class zizzag {
//    List<List<Integer>> ans = new ArrayList<>();
//        if (root == null) return ans;
//
//    Deque<TreeNode> deque = new LinkedList<>();
//        deque.addFirst(root);
//    int chk = 1;
//
//        while (!deque.isEmpty()){
//        int level = deque.size();
//        List<Integer> current = new ArrayList<>();
//
//        for(int i=0; i<level; i++){
//
//            if (chk % 2 != 0){
//                TreeNode temp = deque.pollFirst();
//                current.add(temp.val);
//                if (temp.left != null) deque.addLast(temp.left);
//                if (temp.right != null) deque.addLast(temp.right);
//            }
//
//            else {
//                TreeNode temp = deque.pollLast();
//                current.add(temp.val);
//                if (temp.right != null) deque.addFirst(temp.right);
//                if (temp.left != null) deque.addFirst(temp.left);
//            }
//
//        }
//        chk++;
//        ans.add(current);
//    }
//
//        return ans;
//
//}
