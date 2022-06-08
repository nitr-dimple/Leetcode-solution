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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode m = new ListNode(0,null), t = m;
        while(l1 != null  && l2 != null) {
            if(l1.val < l2.val) {
                t.next = new ListNode(l1.val, null);
                l1 = l1.next;
            }else {
                t.next = new ListNode(l2.val, null);
                l2 = l2.next;
            }
            t = t.next;
        }
        while(l1 != null) {
            t.next = new ListNode(l1.val, null);
            l1 = l1.next;
            t = t.next;
        }
        while(l2 != null) {
            t.next = new ListNode(l2.val, null);
            l2 = l2.next;
            t = t.next;
        }
        return m.next;
        
    }
    
    public ListNode mergeList(ListNode[] lists , int len, int k) {
        if(k == len - 1)
            return lists[k];
        ListNode l1 = lists[k], l2;
        l2 = mergeList(lists, lists.length, k+1);    
        return mergeTwoLists(l1, l2);
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0)
            return null;
        if(lists.length == 1) 
            return lists[0];
        return mergeList(lists, lists.length, 0);
        
    }
}