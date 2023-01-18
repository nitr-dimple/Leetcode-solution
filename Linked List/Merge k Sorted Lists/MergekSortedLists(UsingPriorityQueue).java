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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((l1, l2) ->  l1.val - l2.val);

        ListNode temp = new ListNode(0, null);
        ListNode head = temp;

        for(int i=0; i< lists.length; i++){
            if(lists[i] != null)
                pq.add(lists[i]);
        }

        while(pq.size() != 0){
            ListNode curr = pq.poll();
            temp.next = curr;
            temp = temp.next;

            if(curr.next != null)
                pq.add(curr.next);
        }
        temp.next = null;
        return head.next;

    }
}