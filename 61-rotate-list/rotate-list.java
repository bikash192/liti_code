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
    public ListNode nth(ListNode t,int l){
        int ct=1;
        while(t!=null){
            if(ct==l) return t;
            ct++;
            t=t.next;
        }
        return t;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        ListNode nl=nth(head,len-k);
        head=nl.next;
        nl.next=null;
        return head;
    }
}