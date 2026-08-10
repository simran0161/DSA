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
        Node temp=head;
        Node newhead=null;
        Node dummy=new Node(-1);
        Node ptr=dummy;
        HashMap<Node,Node>mp=new HashMap<>();

        while(temp!=null){
            Node newnode=new Node(temp.val);
            mp.put(temp,newnode);
            ptr.next=newnode;
            if(temp==head) newhead=newnode;
            ptr=ptr.next;
            temp=temp.next;
        }

        Node newtemp=dummy.next;
        temp=head;

        while(temp!=null){
            Node p1=temp.random;
            Node p2=mp.get(p1);
            newtemp.random=p2;
            temp=temp.next;
            newtemp=newtemp.next;
        }
        return newhead;
    }
}