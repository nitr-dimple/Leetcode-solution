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
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode curr = null;
        
        for(int i = 0; i< nums.length; i++){
            TreeNode temp = new TreeNode(nums[i], null, null);
            while(!stk.isEmpty() && stk.peek().val < nums[i]){
                TreeNode p = stk.pop();
                p.right = curr;
                curr = p;
            }
            temp.left = curr;
            curr = null;
            stk.push(temp);
        }
            curr = null;
        while(!stk.isEmpty()){
            TreeNode p = stk.pop();
            p.right = curr;
            curr = p;
        }
        return curr;
    }

}