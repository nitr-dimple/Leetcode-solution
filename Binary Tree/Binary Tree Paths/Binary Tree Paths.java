/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> list = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        String s = "";
        inorder(root, s);
        return list;       
    }

    public void inorder(TreeNode root, String s){
        if(root != null){
            s = s + Integer.toString(root.val);

            if(root.left == null && root.right == null){
                list.add(s);
                return;
            }
            s = s + "->";
            inorder(root.left, s);
            inorder(root.right,s);
        }
    }
}