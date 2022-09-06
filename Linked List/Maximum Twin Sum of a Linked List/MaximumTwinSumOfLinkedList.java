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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next);
        int max = 0;
        slow = head;
        while(rev != null){
            max = max > slow.val + rev.val ? max : slow.val + rev.val;
            slow = slow.next;
            rev = rev.next;
        }
        return max;
    }
    
    ListNode reverse(ListNode temp){
        if(temp.next == null) return temp;

        ListNode p = temp.next;
        ListNode q = p.next;
        temp.next = null;

        while(q != null){
            p.next = temp;
            temp = p;
            p = q;
            q = p.next;
        }
        p.next = temp;
        return p;
    }
}