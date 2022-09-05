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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-5000, head);
        ListNode temp = head.next, p = null,  prevTemp = head;
        while(temp != null){
            if(prevTemp.val < temp.val){
                prevTemp = temp;
                temp = temp.next;
                continue;
            }
            p = dummy;
            while(p.next.val < temp.val){
                p = p.next;
            }
            prevTemp.next = temp.next;
            temp.next = p.next;
            p.next = temp;
            temp = prevTemp.next;
        }
        return dummy.next;
    }
}