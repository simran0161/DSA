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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        int carry=0;
        ListNode dummy=new ListNode (-1);
        ListNode temp=dummy;

        while(ptr1!=null && ptr2!=null){
            int sum=ptr1.val+ptr2.val+carry;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            temp.next=newnode;
            temp=temp.next;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        while(ptr1!=null){
            int sum=ptr1.val+carry;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            temp.next=newnode;
            temp=temp.next;
            ptr1=ptr1.next;
        }

        while(ptr2!=null){
            int sum=ptr2.val+carry;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            temp.next=newnode;
            temp=temp.next;
            ptr2=ptr2.next;
        }

        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            temp.next=newnode;
            temp=temp.next;
        }

        return dummy.next;
    }
}