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
    public TreeNode helper(int[]pre,int pl,int ph,int[]ino,int il,int ih){
        if(pl>ph) return null;
        TreeNode root=new TreeNode(pre[pl]);
        int i=il;
        while(ino[i]!=pre[pl]){
            i++;
        }
        int ls=i-il;
        root.left=helper(pre,pl+1,pl+ls,ino,il,i-1);
        root.right=helper(pre,pl+ls+1,ph,ino,i+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}