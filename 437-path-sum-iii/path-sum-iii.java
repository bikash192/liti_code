/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int noOfPath(TreeNode root,long targetSum){
        if(root==null) return 0;
        int count=0;
        if((long)(root.val)==targetSum){
            count++;
        }
        return count+noOfPath(root.left,targetSum-(long)(root.val))+noOfPath(root.right,   targetSum-(long)(root.val));
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        int count = noOfPath(root, (long) targetSum);
        return count + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
}