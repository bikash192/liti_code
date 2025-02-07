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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> ans=new ArrayList<>();
       if(root==null) return ans;
       
        List<Integer> temp1=postorderTraversal(root.left);
        List<Integer> temp2=postorderTraversal(root.right);
        ans.addAll(temp1);
        ans.addAll(temp2); 
        ans.add(root.val);
        return ans;
    }
}