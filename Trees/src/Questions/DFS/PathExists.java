package Questions.DFS;

import learing.AVL_tree;

public class PathExists {
    public static boolean isPathExists(AVL_tree.Node node, int[] arr){
        int i = 0;
        AVL_tree.Node temp = node;
        while (i < arr.length && temp != null){
            if (temp.data != arr[i]){
                return false;
            }
            if (temp.left != null && i+1 < arr.length && temp.left.data == arr[i+1]) temp = temp.left;
            if (temp.right != null && i+1 < arr.length && temp.right.data == arr[i+1]) temp = temp.right;
            i++;
        }
        if (temp.left != null && temp.right!= null){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        AVL_tree tree = new AVL_tree();
        for (int i = 1; i <= 5; i++) {
            tree.insert(i);
        }
        tree.good_Display();
        System.out.println(isPathExists(tree.root,new int[]{2,4,5}));
    }

}


