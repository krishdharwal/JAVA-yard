package Questions.DFS;

import Questions.TreeNode;
public class TreeToLinkedList {


    // Solved by Pre Order Traversal
    public void flatten(TreeNode node) {
        if(node == null) return;

        if(node.left != null && node.right != null){
            putRightToLeft(node.left , node.right);
            // swap
            node.right = node.left;
            node.left = null;
        }
        if(node.left != null && node.right == null){
            node.right = node.left;
            node.left = null;
        }
        // call to right
        flatten(node.right);
    }

    void putRightToLeft(TreeNode left,TreeNode right){
        TreeNode temp = left;
        while(temp.right != null) {
            temp = temp.right;
        }
        temp.right = right;

    }

    // Solved by Post Order Traversal
    public void flatten2(TreeNode node) {
        if (node == null) return;

        flatten2(node.left);
        flatten2(node.right);

        TreeNode left = node.left;
        TreeNode right = node.right;

        node.right = left;

        TreeNode temp = node;
        while (temp.right != null){
            temp = temp.right;
        }

        temp.right = right;
    }

    }
