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
    public TreeNode helper(int[]in,int il,int ih,int[]pos,int pol,int poh){
       if ( pol > poh) return null;
        TreeNode root=new TreeNode(pos[poh]);
        int i=il;
        while(in[i]!=pos[poh]){
            i++;
        }
        int ls=i-il;
        root.left=helper(in,il,i-1,pos,pol,pol+ls-1);
        root.right=helper(in,i+1,ih,pos,pol+ls,poh-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return helper(inorder,0,n-1,postorder,0,n-1);
    }
}