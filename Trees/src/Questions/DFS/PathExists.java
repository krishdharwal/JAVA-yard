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
            if (temp.left != null && temp.left.data == arr[i+1]) temp = temp.left;
            if (temp.right != null && temp.right.data == arr[i+1]) temp = temp.right;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        AVL_tree tree = new AVL_tree();
        for (int i = 1; i <= 5; i++) {
            tree.insert(i);
        }
        tree.good_Display();
        System.out.println(isPathExists(tree.root,new int[]{2,1,9,9}));
    }

}


