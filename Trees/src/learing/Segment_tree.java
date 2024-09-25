package learing;

public class Segment_tree {
    private Node root;
    public Segment_tree(){
//        this.root  = ADD(arr,0,arr.length-1);
    }

    public void add(int[] arr){
      root = ADD(arr,0,arr.length-1);
    }

    private Node ADD(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);
        int mid = (start + end) / 2;

        node.left = ADD(arr,start,mid);
        node.right = ADD(arr,mid+1,end);

        node.data = node.left.data + node.right.data;

        return node;
    }


    public class Node{
        private int data;
        private Node left;
        private Node right;

        private int left_index;
        private int right_index;
        Node(){}

//        public Node(int data){
//            this.data = data;
//        }
        public Node(int left_index,int right_index){
            this.left_index = left_index;
            this.right_index = right_index;
        }
    }


    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        Segment_tree tree = new Segment_tree();
        tree.add(arr);

        System.out.println(tree.query(0,1));
        System.out.println();
        tree.display();

        System.out.println();
        tree.update(1,9);
        System.out.println();

        System.out.println(tree.query(0,1));
        System.out.println();
        tree.display();



    }


    public int query(int Qu_start,int Qu_end ){
      return query(root,Qu_start,Qu_end);
    }

    private int query(Node node, int quStart, int quEnd) {
        // to check the given Query index is lying in the give  current node address
        // check current node

        // when completely inside
        if (node.left_index >= quStart && node.right_index <= quEnd) {
            return node.data;
        }

        // when completely outside
        else if (node.left_index > quEnd || node.right_index < quStart ) {
            return 0;
        }

        // overlapping
        else{
             return query(node.left,quStart,quEnd) + query(node.right,quStart,quEnd);
        }
    }


    public void update(int index,int val){
      root.data = update(root,index,val);
    }
    public int update(Node node,int index,int value){
        // firstly it will check if its lying or not
        if (node.left_index <= index && node.right_index >= index){
            // check in child also
            if (node.left_index == index || node.right_index == index){
                node.data = value;
                return node.data;
            }
            else {
                int left_ans = update(node.left,index,value);
                int right_ans = update(node.right,index,value) ;
                node.data = left_ans + right_ans;
                return node.data;
            }
        }
        return node.data;
    }


    public void display(){
        display(root);
    }

    private void display(Node root) {
        if (root == null){
            return;
        }
        System.out.print(root.data + " -> ");
        display(root.left);
        display(root.right);
    }
}
