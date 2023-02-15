/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p= headA, q=headB;
        while(p != q){
            if( p.next==null && q.next==null){
                p = p.next;
                break;
            }
            p = p.next != null? p.next : headB;
            q = q.next != null ? q.next : headA;
        }
        return p;
        
    }
}