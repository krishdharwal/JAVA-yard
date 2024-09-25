package learing;

import java.util.Scanner;

public class Custom_Tree {
    private Node root;
    public Custom_Tree(){
    }

    public void add(Scanner in){

        System.out.println("-------DATA---FOR---ROOT---");
        int data = in.nextInt();
        root = new Node(data);

        addNext(root, in);
    }

    public void addNext(Node Previous_Node,Scanner in){
//        System.out.println("DO YOU WANT TO ADD DATA IF YES JUST ADD DATA OR ENTER 'X' TO EXIT ");
//        String ch = in.next();
//        if ( ch.equals("X")){
//            return;
//        }

        System.out.println(" ------LEFT--- [ "+ Previous_Node.data +" ]---( t / f)-->");
     Boolean left = in.nextBoolean();
     if (left){
         System.out.println("-----Enter data for [ "+ Previous_Node.data + " ] LEFT node ---->");
         int data = in.nextInt();
         Previous_Node.left = new Node(data);
         addNext(Previous_Node.left,in);
     }

        System.out.println("-----RIGHT---[ " + Previous_Node.data + " ]----( t / f)-->");
     Boolean right = in.nextBoolean();
        if (right) {

            System.out.println("-----Enter data for [ "+ Previous_Node.data +" ] RIGHT node ---->");
            int data = in.nextInt();
            Previous_Node.right = new Node(data);
            addNext(Previous_Node.right,in);
        }

    }


    public void Simple_display(){
//        System.out.println(root.data);
        display(root);
    }

    private void display(Node root) {
        if (root == null){
            return;
        }

        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }


    public void Tree_form_display(){
        Tree_form_display(root,0);
    }

    private void Tree_form_display(Node node,int level) {
        if (node == null){
            return;
        }
        Tree_form_display(node.right,level+1);
        if (level != 0) {
            for (int i = 1; i < level; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|-------> [ " + node.data + " ]");
        }
            else{
            System.out.println(" [ " + node.data + " ]");
            }

            Tree_form_display(node.left,level+1);

    }

    // data , left, right
    private class Node{
        protected Node left;
        protected Node right;
        protected int data;

        public Node(int data){
            this.data  = data;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Custom_Tree tree = new Custom_Tree();
        tree.add(in);
        tree.Tree_form_display();
    }
}
