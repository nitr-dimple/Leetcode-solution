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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
        
    }

    public TreeNode createTree(int nums[], int start, int end){
        TreeNode root = null;
        if(start <= end){
            int mid = start + (end - start)/2;
            root = new TreeNode(nums[mid], createTree(nums, start, mid-1), createTree(nums, mid+1, end));
        }
        return root;
    }
}