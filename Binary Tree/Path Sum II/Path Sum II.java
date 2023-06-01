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
    List<List<Integer>> answer = new ArrayList<>();

    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        hasTargetSum(root, targetSum, 0, list);
        return answer;
    }

    public void hasTargetSum(TreeNode root, int targetSum, int currentSum, List<Integer> list){
        if(root == null ) return ;
        list.add(root.val);
        if(root.left == null && root.right == null){
            if(currentSum + root.val == targetSum) {
                List<Integer> l = new ArrayList<>();
                for(int i: list)
                    l.add(i);
                answer.add(l);
            }
        }
        if(root.left != null) hasTargetSum(root.left, targetSum, currentSum + root.val, list);
         if(root.right != null) hasTargetSum(root.right, targetSum, currentSum + root.val, list);
        list.remove(list.size()-1);
        return;
    }
}