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
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return smallestK(root, k);
    }
    
    public int smallestK(TreeNode root, int k){
        int left = -1;
        int right = -1;
        if(root!= null){
            left = smallestK(root.left, k);
            count++;
            if(count == k) return root.val;
            if(left == -1)
                right = smallestK(root.right, k);
        }
        if(left != -1) return left;
        else return right;
    }
}