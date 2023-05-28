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
    int prev = -1;
    int diff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorderTraversal(root);
        return diff;
    }

    public void inorderTraversal(TreeNode root){
        if(root != null){
            inorderTraversal(root.left);
            if(prev != -1){
                diff = diff >  root.val - prev?  root.val - prev: diff;
            }
            prev = root.val;
            inorderTraversal(root.right);
        }
    }
}