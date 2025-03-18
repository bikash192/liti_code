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
    public void helper(TreeNode root, int sum, List<Integer> cur, List<List<Integer>> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            cur.add(root.val);
            if (root.val == sum) {
                ans.add(new ArrayList<>(cur));
            }
            cur.remove(cur.size() - 1);
            return;
        }
        cur.add(root.val);
        helper(root.left,sum-root.val,cur,ans);
        helper(root.right,sum-root.val,cur,ans);
        cur.remove(cur.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(root, targetSum, cur, ans);
        return ans;
    }
}