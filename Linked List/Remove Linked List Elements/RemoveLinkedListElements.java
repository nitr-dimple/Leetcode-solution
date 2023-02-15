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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, null);
        ListNode temp = head, p = dummy;
        while(temp != null){
            if(temp.val != val){
                p.next = temp;
                p = p.next;
            }
            temp = temp.next;
        }
        p.next = null;
        return dummy.next;
    }
}