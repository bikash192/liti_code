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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constTree(List<Integer>ans,int l,int h){
        if(l>h) return null;
        int m=l+(h-l)/2;
        TreeNode root=new TreeNode(ans.get(m));
        root.left=constTree(ans,l,m-1);
        root.right=constTree(ans,m+1,h);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        return constTree(ans,0,ans.size()-1);
    }
}