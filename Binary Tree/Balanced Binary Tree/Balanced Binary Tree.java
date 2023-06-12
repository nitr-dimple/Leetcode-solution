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
    boolean answer = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left ==null && root.right == null)) return true;
        height(root);
        return answer;
    }

    public int height(TreeNode root){
        if(answer == false) return 0;
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1) answer = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}