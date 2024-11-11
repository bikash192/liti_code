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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode ln=new ListNode(0);
        ln.next=head;
        ListNode prev=ln;
        while(temp!=null){
            boolean flag=false;
            while(temp.next!=null&&temp.next.val==temp.val){
                temp=temp.next;
                flag=true;
            }
            if(flag){
                prev.next=temp.next;
            }
            else{
                prev=prev.next;
            }
            temp=temp.next;
        }
     
        return ln.next;
    }
}