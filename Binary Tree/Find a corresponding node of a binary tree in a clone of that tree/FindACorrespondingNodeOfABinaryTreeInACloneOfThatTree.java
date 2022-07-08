/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return preorder(cloned, target);
    }
    
    public TreeNode preorder(final TreeNode cloned, final TreeNode target){
        if(cloned != null){
            if(cloned.val == target.val) return cloned;
            TreeNode l = preorder(cloned.left, target);
            if(l != null) return l;
            TreeNode r = preorder(cloned.right, target);
            return r;
        }
        return null;
    }
}