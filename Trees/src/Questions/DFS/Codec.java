package Questions.DFS;

import Questions.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public TreeNode r;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // do pre odr traversal and keep add them to a string buffer and return a string

        if (root == null) {
            return "";
        }

        r = root;
        return treeToString(root,new StringBuffer());
    }

    public String treeToString(TreeNode node , StringBuffer str){
        if (node == null){
            str.append(String.valueOf("n")).append(",");
            return str.toString();
        }

        str.append(String.valueOf(node.val)).append(",");

        treeToString(node.left,str);
        treeToString(node.right,str);
        return str.toString();
    }


    public TreeNode deserialize(String data) {
        // in deserialization do pre odr traversal and make a tree
        if (data.isEmpty()){
            return null;
        }
        // List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));

        return stringToTree(data.split(","),new int[]{0});
    }

    private TreeNode stringToTree(String[] str,int[] idx) {
        if(idx[0] > str.length || str[idx[0]].equals("n")){
            idx[0]++;
            return null;
        }

        String val = str[idx[0]++];

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = stringToTree(str,idx);
        node.right = stringToTree(str,idx);

        return node;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));