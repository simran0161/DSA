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
    public void solve(TreeNode root,List<String>res,String s){
        if(root.left==null && root.right==null){
            res.add(s+root.val);
        }

        
        if(root.left!=null)  solve(root.left,res,s+root.val+"->");
        if(root.right!=null) solve(root.right,res,s+root.val+"->");

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res=new ArrayList<>();

        solve(root,res,"");
        return res;
    }
}