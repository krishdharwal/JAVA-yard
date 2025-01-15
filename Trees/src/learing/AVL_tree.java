package learing;
// self balancing tree

import Questions.Node;

public class AVL_tree {
    private Node root;
    public AVL_tree(){}

                               // height
    public int height(){
       return height(root);
    }
    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }



                              // inset
    public void insert(int data){
        if (root == null){
            root = new Node(data);
            return;
        }
       root = insertNext(root,data);
    }

    private Node insertNext(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        // left side case
        if (data < node.data) {
            node.left = insertNext(node.left, data);
        }

        // right side
        if (data > node.data) {
            node.right = insertNext(node.right, data);
        }
        // at every level it's going to check for , is the node unbalancing the tree or not
//        return rotate(node);
        node.height = Math.max(height(node.left),height(node.right) +1);
        return rotate(node);
    }

                              // AVL

    private Node rotate(Node node) {
        // here it's finding the root's left or right side

        // left heavy
        if (height(node.left) - height(node.right) > 1){
            // if the height is in [postitive side] than means  < left - left >
            if(height(node.left.left) - height(node.left.right) > 0){
              return right_ROtate(node);
            }

            // if the height is in [negative side] than means   < left - right >
            if (height(node.left.left) - height(node.left.right) < 0){
                return left_ROtate(node);
            }
        }

        // right heavy
        if (height(node.left) - height(node.right) < -1){

//            right- left case
            if (height(node.right.left) - height(node.right.right) > 0){
                return right_ROtate(node);
            }

//            right - right case
            if (height(node.right.left) - height(node.right.right) < 0){
                return left_ROtate(node);
            }
        }
        return node;
    }

    private Node left_ROtate(Node c) {
        // assign
        Node p  = c.right;
        Node t = p.left;

        // re - structure
      p.left = c;
      c.right = t;

        // height update
        p.height = Math.max(height(p.left),height(p.right) +1);
        c.height = Math.max(height(c.left),height(c.right) +1);


        // then
         return p;


    }

    private Node right_ROtate(Node p) {
        // assigning the values
        Node c = p.left;
        Node t = c.right;

        // Re-Structuring value
        c.left = p;
        p.left = t;

        // update height
         // do { c }
        p.height = Math.max(height(p.left),height(p.right) +1);
        c.height = Math.max(height(c.left),height(c.right) +1);

        // return the top most node
        return c;
    }

      class Node{
          Node left;
          Node right;
          int data;
         int height;

         public Node(int data){
             this.data = data;
         }
         public Node(){}
     }

                                     // call
    public static void main(String[] args) {
        AVL_tree tree = new AVL_tree();
        for (int i = 1; i <= 10; i++) {
            tree.insert(i);

        }
        System.out.println(tree.height());
        tree.good_Display();
        System.out.println(tree.heightTraverse());
    }



    public void good_Display(){
        if (root == null)
        {
            return;
        }
        good_Display(root,0);
    }

    private void good_Display(Node node, int level) {
        if (node == null){
            return;
        }
        good_Display(node.right,level+1);

        if (level > 0) {
            for (int i = 1; i < level; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|-------> " + node.data);
        }
        else {
            System.out.println(node.data);
        }
        good_Display(node.left,level+1);

    }


    public int heightTraverse(){
        return heightTraverse(root,0,0);
    }

    private int heightTraverse(Node node, int mh , int h) {
        if (node == null){
            return h-1;
        }

        mh = Math.max(heightTraverse(node.left,mh,h+1) , mh);
        mh = Math.max(heightTraverse(node.right,mh,h+1), mh);

        return mh;
    }


}
