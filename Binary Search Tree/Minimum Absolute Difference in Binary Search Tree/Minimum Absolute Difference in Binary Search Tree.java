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
    int prev=-1;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            if(prev != -1) {
                min = min < Math.abs(root.val - prev) ? min :  Math.abs(root.val - prev);
            }
            prev = root.val;
            inorder(root.right);
        }
    }
}