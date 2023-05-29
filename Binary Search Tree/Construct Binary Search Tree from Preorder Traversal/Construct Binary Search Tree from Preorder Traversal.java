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
    TreeNode tree = null;
    
    public TreeNode bstFromPreorder(int[] preorder) {
        for(int i : preorder){
            tree = insertBST(tree,i);
        }
        return tree;
    }

    public TreeNode insertBST(TreeNode root, int val){
        if(root == null) return new TreeNode(val, null, null);
        else if(root.val > val) root.left = insertBST(root.left, val);
        else if(root.val < val) root.right = insertBST(root.right, val);
        return root;
    }
}