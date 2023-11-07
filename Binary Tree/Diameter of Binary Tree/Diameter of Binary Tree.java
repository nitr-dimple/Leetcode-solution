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
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxLen(root);
        return max;
        
    }

    public int maxLen(TreeNode root){
        if(root == null) return 0;
        int left = maxLen(root.left) + 1;
        int right = maxLen(root.right) + 1;
        max = max > left + right - 2 ? max : left + right - 2;
        return Math.max(left, right);
    }
}