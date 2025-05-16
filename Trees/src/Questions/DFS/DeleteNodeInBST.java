package Questions.DFS;

import Questions.TreeNode;
import learing.Tree;

// fucking remember that it's a binary search tree
public class DeleteNodeInBST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        if (root.val > key){
            // go to left
            root.left = deleteNode(root.left,key);
        } else if (root.val < key) {
            // go to right
            root.right = deleteNode(root.right,key);
        } else {
          // found the target
          if (root.left == null){
              return root.right;
          }
          if (root.right == null){
              return  root.left;
          }

            // inorder successor
             TreeNode successor = InOrderSuccessor(root.right);
           successor.left = root.left;
           return root.right;
        }
        return root;
    }

    private TreeNode InOrderSuccessor(TreeNode node) {
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

}
