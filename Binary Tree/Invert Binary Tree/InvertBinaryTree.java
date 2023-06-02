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
    public TreeNode invertTree(TreeNode root) {
        // if(root == null) return root;
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // while(queue.size()!= 0){
        //     TreeNode t = queue.remove();
        //     TreeNode temp = t.left;
        //     t.left = t.right;
        //     t.right = temp;
        //     if(t.left != null)
        //         queue.add(t.left);
        //     if(t.right != null)
        //         queue.add(t.right);
        // }
        if(root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
        
    }
}