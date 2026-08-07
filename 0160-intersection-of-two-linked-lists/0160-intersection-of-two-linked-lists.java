/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;

        ListNode temp1=headA;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }

        ListNode temp2=headB;
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }

        System.out.println(l1);
        System.out.println(l2);

        int k=Math.abs(l1-l2);

        temp1=headA;
        temp2=headB;
        int c=0;

        if(l1>l2){ 
            while(temp1!=null && c!=k ){
                c++;
                temp1=temp1.next;
            }
        }
        else{
            while(temp2!=null && c!=k ){
                c++;
                temp2=temp2.next;
            }
        }

        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}