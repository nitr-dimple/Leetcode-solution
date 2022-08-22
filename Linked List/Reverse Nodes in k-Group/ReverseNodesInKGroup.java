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
    ListNode start;
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode temp = head, p;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        int count = 1;
        temp = dummy;
        while(count <= length/k){
            p = temp.next;
            temp.next = reverse(p, k);
            temp = start;
            count++;
        }
        return dummy.next;
    }
    
    public ListNode reverse(ListNode temp, int k){
        start = temp;
        int count = 1;
        ListNode p = temp.next;
        ListNode q = p.next;
        while(count < k){
            p.next = temp;
            temp = p;
            p = q;
            if(q != null)
                q = q.next;
            count++;
        }
        start.next = p;
        return temp;
    }
}