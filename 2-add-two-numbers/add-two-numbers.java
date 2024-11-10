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
        ListNode newNode= new ListNode(-1);
        ListNode temp=newNode;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int cary=0;
        while(temp1!=null||temp2!=null){
            int sum=cary;
            if(temp1!=null){
                sum=sum+temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum=sum+temp2.val;
                temp2=temp2.next;
            }
            ListNode ll=new ListNode(sum%10);
            cary=sum/10;
            temp.next=ll;
            temp=temp.next;
        }
        if(cary>0){
            ListNode ln=new ListNode(cary);
            temp.next=ln;
        }
        return newNode.next;
    }
}