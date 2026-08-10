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

    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || k==0){
            return head;
        }
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }

        k=k%n;

        int val=n-k;
        int c=1;
        temp=head;
        while(temp!=null && c!=val){
            c++;
            temp=temp.next;
        }

        ListNode nextnode=temp.next;
        ListNode p1=reverse(head,nextnode);
        ListNode p2=reverse(nextnode,null);
        head.next=p2;
        head=p1;
        head=reverse(head,null);
        return head;
    }
}