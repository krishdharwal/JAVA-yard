package learing;
// binary tree

import Questions.TreNode;

public class Tree {


    public TreNode root;

    // adding part
    public void add(int data) {
      root = add(root, data);
    }

    public TreNode add(TreNode node, int data) {
        if (node == null) {
            node = new TreNode(data);
            return node;
        }

        if (data < node.val) {
           node.left =  add(node.left, data);
        }

        if (data > node.val) {
           node.right = add(node.right, data);
        }

        return node;
    }


    public void display() {
        if (root == null) {
            System.out.print("root is null");
            return;
        }
        display(root);
    }

    public void display(TreNode node){
        if (node == null){
            return;
        }
        System.out.print(node.val + " - ");

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(1);
        tree.add(23);
        tree.add(11);
        tree.add(99);
        tree.display();
    }
}



