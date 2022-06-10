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
    int preindex = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0) return null;
        for(int i=0; i<inorder.length; i++) map.put(inorder[i], i);
        return createTree(preorder, inorder, 0, inorder.length-1);        
    }
    
    public TreeNode createTree(int[] preorder, int[] inorder, int instart, int inend){
        if(instart > inend) return null;
        TreeNode tnode = new TreeNode(preorder[preindex++]);
        if(instart == inend) return tnode;
        int inindex = map.get(tnode.val);
        tnode.left = createTree(preorder, inorder, instart, inindex -1);
        tnode.right = createTree(preorder, inorder, inindex + 1, inend);
        return tnode;
    }
}