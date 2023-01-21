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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0) return head;
        int count = 1, l=1;
        ListNode t = head,t1 = head,prev=null;
        while(t.next!= null){
            t = t.next;
            l++;
        }
        t = head;
        if(k%l ==0) return head;
        if(k> l) k = k%l;
        while( count < k){
            t = t.next;
            count++;
        }
        while(t.next != null){
            t=t.next;
            prev = t1;
            t1=t1.next;
        }
        t.next = head;
        head = t1;
        prev.next = null;
        return head;
        
    }
}