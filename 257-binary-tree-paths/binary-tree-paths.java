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
    public void path(TreeNode root,List<String>st,String s){
        if(root==null) return ;
        s+=root.val;
        if(root.left==null&&root.right==null){
            st.add(s);
        }
        else{
        path(root.left,st,s+"->");
        path(root.right,st,s+"->");
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>st=new ArrayList<>();
        String s="";
        path(root,st,s);
        return st;
    }
}