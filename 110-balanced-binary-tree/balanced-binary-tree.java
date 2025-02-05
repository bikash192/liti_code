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
    public int depth(TreeNode root){
        if(root==null) return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        if(Math.abs(l-r)>1||l==-1||r==-1) return -1;
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        if(depth(root)==-1) return false;
        return true;
    }
}