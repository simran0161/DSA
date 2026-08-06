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

        if(head==null || head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(odd!=null && odd.next!=null ){
            ListNode newnode=new ListNode(odd.val);
            temp.next=newnode;
            temp=temp.next;
            odd=odd.next.next;
        }
        if(odd!=null){
            ListNode newnode=new ListNode(odd.val);
            temp.next=newnode;
            temp=temp.next;
        }

        while(even!=null && even.next!=null){
            ListNode newnode=new ListNode(even.val);
            temp.next=newnode;
            temp=temp.next;
            even=even.next.next;
        }

        if(even!=null){
            ListNode newnode=new ListNode(even.val);
            temp.next=newnode;
            temp=temp.next;
        }


        return dummy.next;
    }
}