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
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorder1(root1);
        List<Integer> ans = new ArrayList<Integer>();
        inorder2(root2, ans);
        while(pq.size() != 0) ans.add(pq.poll());
        return ans;
        
    }

    public void inorder1(TreeNode root){
        if(root != null){
            inorder1(root.left);
            pq.add(root.val);
            inorder1(root.right);
        }
    }

    public void inorder2(TreeNode root, List<Integer> ans){
        if(root != null){
            inorder2(root.left, ans);
            while(pq.size() != 0 && pq.peek() < root.val)
                ans.add(pq.poll());
            ans.add(root.val);
            inorder2(root.right, ans);
        }
    }
}