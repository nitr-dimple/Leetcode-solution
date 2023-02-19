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
    public ListNode mergeNodes(ListNode head) {
        if(head == null) return head;
        int sum = 0;
        ListNode temp = head.next, p = head;
        while(temp != null){
            sum = sum + temp.val;
            if(temp.val == 0){
                p.next.val = sum;
                p = p.next;
                sum = 0;
            }
            temp = temp.next;
        }
        p.next = null;
        return head.next;
        
    }
}