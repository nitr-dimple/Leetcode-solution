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

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);
        while(queue.size() != 0){
            int len = queue.size();
            List<Integer> l = new ArrayList<>();

            for(int i = 0; i < len; i++){
                TreeNode node = queue.remove();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                l.add(node.val);
            }
            list.add(l);
        }
        return list;
    }
 
}