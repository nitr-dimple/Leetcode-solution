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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = head, dummy =new ListNode(0,null), p= dummy;
        dummy.next = head;
        while(temp!= null){
            while(temp.next!= null && temp.val == temp.next.val) temp = temp.next;
            if(p.next == temp) p = p.next;
            else p.next = temp.next;
            temp = temp.next;
        }
        return dummy.next;
      
        
    }
}