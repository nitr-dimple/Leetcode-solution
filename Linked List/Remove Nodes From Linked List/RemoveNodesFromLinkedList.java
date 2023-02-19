/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while(temp != null){
            while(stack.size()!= 0 && temp.val > stack.peek().val)
                stack.pop();
            stack.push(temp);
            temp = temp.next;
        }
        ListNode dummy = null;
        while(stack.size() != 0){
            temp = stack.pop();
            temp.next = dummy;
            dummy = temp;
        }
        return dummy;

        
    }
}