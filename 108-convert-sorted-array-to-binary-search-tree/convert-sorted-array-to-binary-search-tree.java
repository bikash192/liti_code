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
    public TreeNode constTree(int[]num,int l,int h){
        if(l>h) return null;
        int m=l+(h-l)/2;
        TreeNode root=new TreeNode(num[m]);
        root.left=constTree(num,l,m-1);
        root.right=constTree(num,m+1,h);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return constTree(nums,0,nums.length-1);
    }
}