/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA);
        int l2 = length(headB);
        if(l1>l2){
            int d=l1-l2;
            while(d>0){
                headA=headA.next;
                d--;
            }
        }
        else{
            int d=l2-l1;
            while(d>0){
                headB=headB.next;
                d--;
            }
        }
        ListNode s1=headA;
        ListNode s2=headB;
        while(s1!=s2){
            s1=s1.next;
            s2=s2.next;
        }
        return s1;
    }
}