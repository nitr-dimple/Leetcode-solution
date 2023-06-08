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
    TreeNode temp = null;
    TreeNode x = null;
    TreeNode y = null;

    public void recoverTree(TreeNode root) {

        if(root == null) return;
        inorder(root);
        int t = x.val;
        x.val = y.val;
        y.val = t;
        return;
        
    }

    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            if(temp != null &&  root.val < temp.val){
                y = root;
                if(x == null)
                    x = temp;
                else 
                    return;
            }
            temp = root;
            inorder(root.right);
        }
        return;
    }
}