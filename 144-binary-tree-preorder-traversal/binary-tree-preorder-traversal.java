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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> ans=new ArrayList<>();
       List<Integer> temp1=new ArrayList<>();
       List<Integer> temp2=new ArrayList<>();
       if(root==null) return ans;
       ans.add(root.val);
        temp1=preorderTraversal(root.left);
        temp2=preorderTraversal(root.right);
        ans.addAll(temp1);
        ans.addAll(temp2); 
        return ans;
    }
}