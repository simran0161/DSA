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
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);

        ListNode temp=head;
        while(temp!=null){
            pq.add(temp);
            temp=temp.next;
        }

        ListNode dummy=new ListNode(-1);
        ListNode ptr=dummy;

        while(!pq.isEmpty()){
            ListNode newnode=pq.poll();
            ptr.next=newnode;
            ptr=ptr.next;
            ptr.next=null;
        }
        return dummy.next;
    }
}