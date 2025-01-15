package Questions.DFS;

import Questions.Node;

// using post order traversal to find height
public class Height {

    public int height(Node root){
        return height(root,0,0);
    }

    private int height(Node node, int mh , int h) {
        if (node == null){
            return h;
        }
        mh = Math.max(height(node.left,mh,h+1) , mh);
        mh = Math.max(height(node.right,mh,h+1), mh);

        return mh;
    }


}
