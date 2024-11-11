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
        ListNode ln = new ListNode(0);
        ListNode prev = ln;
        ln.next = head;
        ListNode temp = head;
        
        while (temp != null) {
            boolean flag = false;
            
            // Check for consecutive duplicates
            while (temp.next != null && temp.next.val == temp.val) {
                temp = temp.next; // Skip over the duplicate node
                flag = true; // Mark that duplicates were found
            }
            
            if (flag) {
                prev.next = temp.next; // Skip the entire duplicate sequence
            } else {
                prev = prev.next; // Move prev to the current unique node
            }
            
            temp = temp.next; // Move temp to the next node
        }
        
        return ln.next; // Return the modified list (skip the dummy node)
    }
}
