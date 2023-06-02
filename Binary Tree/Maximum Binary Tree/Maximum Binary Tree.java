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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return inorder(nums,0, nums.length-1);
    }
    
    public TreeNode inorder(int nums[], int left, int right){
        if(left > right) return null;
        int max = Integer.MIN_VALUE;
        int maxInd = 0;
        
        for(int i = left; i<= right; i++){
            if(max < nums[i]){
                max = nums[i];
                maxInd = i;
            }
        }
        
        TreeNode root = new TreeNode(nums[maxInd], null, null);
        root.left = inorder(nums, left, maxInd - 1);
        root.right = inorder(nums, maxInd+1, right);
        return root;
    }

}