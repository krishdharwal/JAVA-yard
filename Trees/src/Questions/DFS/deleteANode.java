package Questions.DFS;

import Questions.TreeNode;
import com.sun.security.auth.UnixNumericUserPrincipal;
import learing.Tree;

import javax.swing.*;

public class deleteANode {

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        TreeNode target = findTarget(root,key);
        // cases
        if (target.left == null && target.right == null){
            return null;
        }

        return null;

    }

    TreeNode InorderSuccessor(TreeNode node){
        while (node.right != null){
            node = node.right;
        }
        return node;
    }

    TreeNode delete(TreeNode node){
        if (node.left == null) return node.right;
        if (node.right == null) return node.left;

        TreeNode rightMax = InorderSuccessor(node);
        rightMax.left = node.left;


        return null;

    }


    private TreeNode findTarget(TreeNode node, int key) {
        if (node == null){
            return null;
        }
        if (node.val == key){
            return node;
        }
        // if less go left , if great go right
        if (node.val > key){
            return findTarget(node.left,key);
        }
            return findTarget(node.right,key);
    }


}
