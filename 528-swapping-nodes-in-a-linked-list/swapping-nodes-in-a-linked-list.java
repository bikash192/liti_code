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

    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        ListNode temp=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        for(int i=1;i<k;i++){
            second=second.next;
        }
        while(second.next!=null){
            temp=temp.next;
            second=second.next;
        }
        int a=first.val;
        first.val=temp.val;
        temp.val=a;
        return head;
    }
}