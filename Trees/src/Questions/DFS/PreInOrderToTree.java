package Questions.DFS;

import Questions.TreeNode;
import learing.AVL_tree;
import learing.Tree;


public class PreInOrderToTree {


    public static void preOrder(AVL_tree.Node node){
        if (node == null ) {
            System.out.print("- null -");
            return;
        }
        System.out.print(node.data + " - ");
        preOrder(node.left);
        preOrder(node.right
        );
    }

    public static void inOrder(AVL_tree.Node node){
        if (node == null ) return;

        inOrder(node.left);
        System.out.print(node.data + " - ");
        inOrder(node.right
        );
    }

    public static void main(String[] args) {
        AVL_tree tree = new AVL_tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.good_Display();
        System.out.println("Pre");
        preOrder(tree.root);

//        System.out.println();
//        System.out.println("In");
//        inOrder(tree.root);
    }



    // 105. Construct Binary Tree from Preorder and Inorder Traversal

    public TreeNode root;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // initilize root
        root = new TreeNode(preorder[0]);
        TreeNode left = root;
        TreeNode right = root;

        int i = 0;
        while (i < preorder.length) {
            left = build(preorder, inorder, left);
            if (left != right) right = build(preorder,inorder,right);
            i = i+2;
        }
        return root;
    }


    TreeNode build(int[] preorder, int[] inorder , TreeNode node){

        // left in inOrder
        int left = search(inorder, node.val) - 1;
        if (left >= 0) {
            node.left = new TreeNode(inorder[left]);
            inorder[left] = -2000;
        }

        // right in PreOrder
        int right = search(preorder, node.val) + 1;
        if (right < preorder.length){
            node.right = new TreeNode(preorder[right]);
            preorder[right] = -2000;
        }

        if(left == -2000 && right == -2000){
            return node;
        }
        return node;
    }

    public int search(int[] arr , int tar){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] == tar) return m;
            if (arr[m] > tar) e = m-1;
            else s = m+1;
        }

        return -1;
    }
}

















