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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode rev = null;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        rev = reverse(slow.next);
        slow = rev;
        fast = head;
        while(slow != null){
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
    }
    
    ListNode reverse(ListNode temp){
        if(temp == null || temp.next == null) return temp;
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