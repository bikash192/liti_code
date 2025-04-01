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
    public void inorder1(TreeNode root,List<Integer> ans){
        if(root==null) return ;
        inorder1(root.left,ans);
        ans.add(root.val);
        inorder1(root.right,ans);
    }
    public void inorder2(TreeNode root,List<Integer> ans){
        if(root==null) return ;
        inorder2(root.left,ans);
        ans.add(root.val);
        inorder2(root.right,ans);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> an1=new ArrayList<>();
        List<Integer> an2=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        inorder1(root1,an1);
        inorder2(root2,an2);
        ans.addAll(an1);
        ans.addAll(an2);
        Collections.sort(ans);
        return ans;
    }
}