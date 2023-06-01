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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        calculateSum(root, 0);
        return sum;
        
    }

    public void calculateSum(TreeNode root, int currsum){
        if(root == null) return;
        currsum = currsum * 10 + root.val;
        if(root.left == null && root.right == null) sum += currsum;
        if(root.left != null) calculateSum(root.left, currsum);
        if(root.right != null) calculateSum(root.right, currsum);
    }
}