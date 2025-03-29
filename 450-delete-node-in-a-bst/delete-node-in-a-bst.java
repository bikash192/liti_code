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
    public void delete(TreeNode root,int tar){
        if(root==null) return;
        if(root.val>tar){
            if(root.left==null) return;
            if(root.left.val==tar){
                TreeNode l=root.left;
                if(l.left==null&&l.right==null) root.left=null;
                else if(l.left==null||l.right==null){
                    if(l.left!=null){
                        root.left=l.left;
                    }
                    else{
                        root.left=l.right;
                    }
                }
                else{
                    TreeNode cur=l;
                    TreeNode pred=cur.left;
                    while(pred.right!=null) pred=pred.right;
                    delete(root.left,pred.val);
                    pred.left=cur.left;
                    pred.right=cur.right;
                    root.left=pred;
                }
            }
            else{
                delete(root.left,tar);
            }
        }
        else{
            if(root.right==null) return;
            if(root.right.val==tar){
                TreeNode r=root.right;
                if(r.left==null&&r.right==null) root.right=null;
                else if(r.left==null||r.right==null){
                    if(r.left!=null) root.right=r.left;
                    else root.right=r.right;
                }
                else{
                    TreeNode cur=r;
                    TreeNode pred=cur.left;
                    while(pred.right!=null) pred=pred.right;
                    delete(root.right,pred.val);
                    pred.left=cur.left;
                    pred.right= cur.right;
                    root.right=pred;
                }
            }
            else{
                delete(root.right,tar);
            }
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode node=new TreeNode(Integer.MAX_VALUE);
        node.left=root;
        delete(node,key);
        return node.left;
    }
}