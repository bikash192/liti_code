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
    public void depth(TreeNode root,int d,Map<TreeNode,Integer> mp,int maxd[]){
        if(root==null) return ;
        maxd[0]=Math.max(maxd[0],d);
        mp.put(root,d);
        depth(root.left,d+1,mp,maxd);
        depth(root.right,d+1,mp,maxd);
    }
    public TreeNode lca(TreeNode root,Map<TreeNode,Integer> mp,int maxd){
        if(root==null) return null;
        int depth=mp.get(root);
        if(depth==maxd){
            return root;
        }
        TreeNode l=lca(root.left,mp,maxd),
        r=lca(root.right,mp,maxd);
        if(l!=null&&r!=null) return root;
        return l!=null?l:r;
    }




    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Map<TreeNode ,Integer> mp=new HashMap<>();
        int maxd[]=new int [1];
        depth(root,0,mp,maxd);

        return lca(root,mp,maxd[0]);
    }
}