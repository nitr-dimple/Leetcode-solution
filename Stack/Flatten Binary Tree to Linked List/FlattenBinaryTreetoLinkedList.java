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
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode temp;
        if(root.left != null){
            temp = root.left;
            while(temp.right != null) temp = temp.right;
            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
}