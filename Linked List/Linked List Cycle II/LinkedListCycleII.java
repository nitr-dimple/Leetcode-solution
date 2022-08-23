/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head, fast = head;
        do {
            if(fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }while(slow != fast);
        fast = head;
        while(slow != fast)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        
    }
}