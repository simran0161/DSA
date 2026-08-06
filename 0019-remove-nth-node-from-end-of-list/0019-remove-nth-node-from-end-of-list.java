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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int k=count-n-1;
        if(k<0) return head.next;

        temp=head;
        int c=0;
        while(temp!=null && c!=k){
            temp=temp.next;
            c++;
        }

        

        temp.next=temp.next.next;
        

        System.out.println(c);
        return head;
    }
}