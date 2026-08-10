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
    public ListNode reverse(ListNode start , ListNode end){
        ListNode prev=null;
        while(start!=end){
            ListNode temp=start.next;
            start.next=prev;
            prev= start;
            start=temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr=head;
        ListNode node=null;

        while(ptr!=null){
            ListNode temp=ptr;
            int c=1;
            while(temp!=null && c!=k){
                c++;
                temp=temp.next;
            }

            if(temp==null) break;
            ListNode nextnode=temp.next;
            ListNode p1=reverse(ptr,nextnode);
            if(node==null){
                head=temp;
            }
            else{
                node.next=p1;
            }
            node=ptr;
            ptr.next=nextnode;
            ptr=ptr.next;
        }
        return head;
    }
}