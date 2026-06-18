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
        ListNode dummy=new ListNode(-1);
        ListNode ptr=dummy;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode i:lists){
            if(i!=null){
                pq.add(i);
            }
        }

        while(!pq.isEmpty()){
            ListNode ele=pq.poll();

            ptr.next=ele;
            ptr=ptr.next;

            if(ele.next!=null){
                pq.add(ele.next);
            }
        }
        return dummy.next;
    }
}