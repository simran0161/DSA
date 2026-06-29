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
    int pathSum=Integer.MIN_VALUE;

    public int solve(TreeNode root){
        if(root==null) return 0;

        int left=Math.max(solve(root.left),0);
        int right=Math.max(solve(root.right),0);

        pathSum=Math.max(pathSum,root.val+left+right);

        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return pathSum;
    }
}