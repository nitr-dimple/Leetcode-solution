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
    public ListNode swapPairs(ListNode head) {
        ListNode temp1, temp2, start = new ListNode(0);
        start.next = head;
        temp1 = start;
        while(temp1.next != null && temp1.next.next != null) {
            temp2 = temp1.next;
            temp1.next = temp2.next;
            temp1 = temp1.next;
            temp2.next = temp1.next;
            temp1.next = temp2;
            temp1 = temp2;
        }
        return start.next;
    }
}