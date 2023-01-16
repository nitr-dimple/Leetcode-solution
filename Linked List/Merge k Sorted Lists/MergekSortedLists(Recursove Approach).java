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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode temp = new ListNode(0, null);
        ListNode head = temp;

        while(list1 != null || list2 != null){
            if(list1 == null){
                temp.next = list2;
                return head.next;
            }
            if(list2 == null){
                temp.next = list1;
                return head.next;
            }
            if(list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        return head.next;
        
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