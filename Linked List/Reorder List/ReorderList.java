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
    public void reorderList(ListNode head) {
        if(head != null && head.next != null){
            ListNode rev, slow = head, fast = head, prevSlow = null;
            while(fast.next != null && fast.next.next != null){
                prevSlow = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            if(fast.next == null){
                rev = reverse(slow);
                prevSlow.next = null;
            }
            else{
                rev = reverse(slow.next);
                slow.next = null;
            }
            slow = head;
            ListNode  temp1=head, temp2 = rev, prev= null;
            while(temp1 != null){
                temp1 = temp1.next;
                slow.next = rev;
                if(rev != null)
                    rev = rev.next;
                slow = slow.next;
                slow.next = temp1;
                prev = slow;
                slow = slow.next;

            }
            if(rev != null) prev.next = rev;
        }
        
    }
    public ListNode reverse(ListNode slow){
        if(slow.next == null) return slow;
        ListNode temp = slow;
        ListNode p = temp.next;
        ListNode q = p.next;
        temp.next = null;
        while(q != null){
            p.next = temp;
            temp = p;
            p = q;
            q = q.next;
        }
        p.next = temp;
        return p;
    }
}