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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyOdd = new ListNode(0, null);
        ListNode dummyEven = new ListNode(0, null);
        ListNode odd = dummyOdd, even = dummyEven, temp = head;
        while(temp != null && temp.next != null){
            odd.next = temp;
            odd = odd.next;
            even.next = temp.next;
            even = even.next;
            temp = temp.next.next;
            
        }
        if(temp == null)
            odd.next = dummyEven.next;
        else {
            odd.next = temp;
            temp.next = dummyEven.next;
        }
        even.next = null;
        return dummyOdd.next;
        
    }
}