/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        pointNext(root, null, 0);
        return root;
        
    }
    
    public void pointNext(Node root, Node parent, int id){
if(root == null) return;
        if(id == 1){
            if(parent.right != null) root.next = parent.right;
            else if(parent.next != null){
                Node temp = parent.next;
                while(temp != null && temp.left == null && temp.right == null) temp = temp.next;
                if(temp != null && temp.left != null) root.next = temp.left;
                else if(temp != null && temp.right != null) root.next = temp.right;
            }
        }
        if(id == 2){
            Node temp = parent.next;
            while(temp != null && temp.left == null && temp.right == null) temp = temp.next;
            if(temp != null && temp.left != null) root.next = temp.left;
            else if(temp != null && temp.right != null) root.next = temp.right;
        }
        pointNext(root.right, root, 2);
        pointNext(root.left, root, 1);
    }
}