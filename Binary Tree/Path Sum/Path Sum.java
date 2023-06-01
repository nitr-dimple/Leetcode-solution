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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasTargetSum(root, targetSum, 0);
    }
    
    public boolean hasTargetSum(TreeNode root, int targetSum, int currentSum){
        if(root == null ) return false;
        if(root.left == null && root.right == null){
            if(currentSum + root.val == targetSum) return true;
            return false;
        }

        return hasTargetSum(root.left, targetSum, currentSum + root.val) || hasTargetSum(root.right, targetSum, currentSum + root.val);
    }
}