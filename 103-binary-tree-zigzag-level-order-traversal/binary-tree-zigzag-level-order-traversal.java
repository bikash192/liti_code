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
    public int height(TreeNode root){
        if(root==null||root.left==null&&root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nthlevel1(TreeNode root,int n,List<Integer> cur){
        if(root==null) return;
        if(n==1){
            cur.add(root.val);
            return;
        }
        nthlevel1(root.left,n-1,cur);
        nthlevel1(root.right,n-1,cur);
    }
    public void nthlevel2(TreeNode root,int n,List<Integer> cur){
        if(root==null) return;
        if(n==1){
            cur.add(root.val);
            return;
        }
        nthlevel2(root.right,n-1,cur);
        nthlevel2(root.left,n-1,cur);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> cur=new ArrayList<>();
            if(i%2!=0){
                nthlevel1(root,i,cur);
            }
            else{
                nthlevel2(root,i,cur);
            }
            ans.add(cur);
        }
        return ans;
    }
}