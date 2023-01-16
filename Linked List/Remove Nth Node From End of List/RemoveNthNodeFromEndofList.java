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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode p = head, q = head;
        while(count <= n){
            p = p.next;
            count++;
        }
        if(p == null)
            return head.next;
        while(p.next !=  null) {;
            q = q.next;
            p = p.next;
        }
         q.next = q.next.next;
        return head;
    }
}