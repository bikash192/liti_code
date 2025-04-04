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
    public void depth(TreeNode root, int d, Map<TreeNode, Integer> mp, int[] maxD) {
        if (root == null)
            return;
        maxD[0] = Math.max(maxD[0], d);
        mp.put(root, d);
        depth(root.left, d + 1, mp, maxD);
        depth(root.right, d + 1, mp, maxD);
    }

    public TreeNode inorder(TreeNode root, int max, Map<TreeNode, Integer> mp) {
        if (root == null) return null;
        int depth = mp.get(root);
        if (depth == max) return root;

        TreeNode left_tree = inorder(root.left, max, mp);
        TreeNode right_tree = inorder(root.right, max, mp);

        if (left_tree != null && right_tree != null) return root;
        else if (left_tree != null) return left_tree;
        else return right_tree;
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Map<TreeNode, Integer> mp = new HashMap<>();
        int[] maxD = new int[1]; 
        depth(root, 0, mp, maxD);
        return inorder(root, maxD[0], mp);
    }
}
