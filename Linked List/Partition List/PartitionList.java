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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0,null), dummyEnd = new ListNode(0, null);
        ListNode p = dummyHead, q = dummyEnd, temp = head;
        while(temp!= null){
            if(temp.val < x){
                p.next = temp;
                p = p.next;
            }else {
                q.next = temp;
                q = q.next;
            }
            temp = temp.next;
        }
        if(dummyHead.next == null){
            return dummyEnd.next;
        }
        p.next = dummyEnd.next;
        q.next = null;
        return dummyHead.next;
        
    }
}