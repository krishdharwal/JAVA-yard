package learing;

import Questions.DFS.PathSum3;
import Questions.Node;

import java.util.Scanner;

public class Binary_tree {
    private Node root;
    public Binary_tree(){}


    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }


    public void add(int data){
       root = addNext(root,data);
    }

    private Node addNext(Node node, int data) {
        if (node == null){
            node = new Node(data);
            return node;
        }

        // for left side
        if (data < node.val){
            node.left = addNext(node.left,data);
        }

        // for right side
        if (data > node.val){
            node.right = addNext(node.right,data);
        }

        node.height = Math.max(height(node.left),height(node.right) +1);
        return node;
    }


    public void Tree_form_display(){
        Tree_form_display(root,0);
    }

    private void Tree_form_display(Node node, int level) {
        if (node == null){
            return;
        }
        Tree_form_display(node.right,level+1);
        if (level != 0) {
            for (int i = 1; i < level; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|-------> [ " + node.val + " ]");
        }
        else{
            System.out.println(" [ " + node.val + " ]");
        }

        Tree_form_display(node.left,level+1);

    }




               // IN order traversal ->  L N R
    private void display_IN_Order() {
        display_IN_Order(this.root);
    }

    private void display_IN_Order(Node node) {
        if (node == null){
            return;
        }
        display_IN_Order(node.left);
        System.out.print(node.val + " ");
        display_IN_Order(node.right);
    }



    // pre order traversal ->  L N R
    private void display_Pre_Order() {
        display_Pre_Order(this.root);

    }

    private void display_Pre_Order(Node node) {
        if (node == null){
            return;
        }
        System.out.print(node.val + " ");
        display_Pre_Order(node.left);
        display_Pre_Order(node.right);
    }

    // Post order traversal ->  L R N
    private void display_Post_Order() {
        display_Post_Order(this.root);

    }

    private void display_Post_Order(Node node) {
        if (node == null){
            return;
        }

        display_Post_Order(node.left);
        display_Post_Order(node.right);
        System.out.print(node.val + " ");
    }



    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Binary_tree node = new Binary_tree();
        node.add(4);
        node.add(8);
        node.add(4);
        node.add(12);
        node.add(3);
        node.add(1);
        node.add(2);
        node.add(6);


//        node.display();
//        node.display_Pre_Order();
//        node.display_Post_Order();
        PathSum3 p3 = new PathSum3();
       int ans =  p3.pathSum(node.root,8);
        System.out.println("ANS -> " + ans);
        node.Tree_form_display();

    }

}
