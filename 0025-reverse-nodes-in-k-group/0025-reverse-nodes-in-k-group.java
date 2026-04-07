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
    public ListNode reverse(ListNode ptr,int k){
        ListNode curr=ptr;
        ListNode prev=null;
        while(curr!=null && k>0){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            k--;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode t=new ListNode(-1);
        t.next=head;
        ListNode dummy=t;
        ListNode ptr=head;
        while(ptr!=null){
            int c=1;
            ListNode temp=ptr;
            while(temp!=null && c!=k){
                c++;
                temp=temp.next;
            }

            if(temp==null){
                break;
            }

            ListNode nextnode=temp.next;
            ListNode node=reverse(ptr,k);
            dummy.next=node;
            ptr.next=nextnode;
            dummy=ptr;
            ptr=ptr.next;
        }
        return t.next;
    }
}