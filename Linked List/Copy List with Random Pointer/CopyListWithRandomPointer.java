/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node temp1 = head, temp2, head2;
        while(temp1 != null){
            temp2 = new Node(temp1.val);
            temp2.next = temp1.next;
            temp1.next = temp2;
            temp1 = temp1.next.next;
        }
        temp1 = head;
        temp2 = temp1.next;
        while(temp1 != null){
            if(temp1.random != null)
                temp2.random = temp1.random.next;
            else
                temp2.random = null;
            temp1 = temp1.next.next;
            if(temp2.next != null)
                temp2 = temp2.next.next;
        }
        temp1 = head;
        head2 = temp1.next;
        temp2 = head2;
        Node temp = head;
        while(temp1 != null){
            temp1.next = temp1.next.next;
            temp1 = temp1.next;

            if(temp2.next != null){
                temp2.next = temp2.next.next;
                temp2 = temp2.next;
            }
        }
        return head2;
    }
}