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
    int currentSum = 0;
    public TreeNode convertBST(TreeNode root) {
        calculate(root);
        return root;
    }
    
    public void calculate(TreeNode root){
        if(root != null){
            calculate(root.right);
            root.val += currentSum;
            currentSum = root.val;
            calculate(root.left);
        }
    }
}